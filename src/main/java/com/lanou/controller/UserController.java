package com.lanou.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lanou.entity.AuthUser;
import com.lanou.entity.LoginLogp;
import com.lanou.service.LoginLogpService;
import com.lanou.service.UserService;

@Controller
public class UserController {
	
	@Resource
	public UserService userService;
	@Resource
	private LoginLogpService loginLogpService;
	
	@RequestMapping("/login")
	public String login(@RequestParam("userName")String username,@RequestParam("password")String password,HttpServletRequest request,HttpServletResponse response) {
		
		AuthUser user = userService.selectByUserAndPwd(username, password);
		//1: 根据用户名查询  用户 如果存在,在进行login 验证
		List<AuthUser> list = userService.selectByUser(username);
		if (user!=null) {
		boolean exist = isExist(request);
		if (!exist) {
			
		
			Cookie cookie = new Cookie("userName", username);
			Cookie c1 = new Cookie("password", password);
			cookie.setMaxAge(60*60);
			c1.setMaxAge(60*60);
			response.addCookie(cookie);
			response.addCookie(c1);
		}
			request.getSession().setAttribute("user", user);
			
			LoginLogp login = new LoginLogp();
			
			
			login.setLOGIN_TIME(new Date());
			login.setLOGIN_NAME(username);
			login.setIP_ADDRESS(getIpAddr(request));
			loginLogpService.insertSelective(login);
			return "redirect:fmain.action";
		}else {
			if (list == null  || list.size()==0) {
				request.setAttribute("loginFailed", 2);
			}else {
			request.setAttribute("loginFailed", 1);
			}
		}
		
		return "/index";
		
		
	}
	/**
	 * 判断cookie 里面是否存在用户名和密码
	 * @return
	 */
	public boolean isExist(HttpServletRequest request) {
		// 不存在的
		boolean flag = false;
		Cookie[] cs = request.getCookies();
		int count = 0;// 记录比较次数
		if (cs!=null) {
			
		
		for (Cookie c : cs) {
			if (c.getName().equals("userName")) {
				count++;
			}
			if (c.getName().equals("password")) {
				count++;
			}
		}
		}
		if(count==2) {
			flag = true;
		}
		return flag ;
	}
	/** 
     * 获取当前网络ip 
     * @param request 
     * @return 
     */  
    public String getIpAddr(HttpServletRequest request){  
        String ipAddress = request.getHeader("x-forwarded-for");  
            if(ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {  
                ipAddress = request.getHeader("Proxy-Client-IP");  
            }  
            if(ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {  
                ipAddress = request.getHeader("WL-Proxy-Client-IP");  
            }  
            if(ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {  
                ipAddress = request.getRemoteAddr();  
                if(ipAddress.equals("127.0.0.1") || ipAddress.equals("0:0:0:0:0:0:0:1")){  
                    //根据网卡取本机配置的IP  
                    InetAddress inet=null;  
                    try {  
                        inet = InetAddress.getLocalHost();  
                    } catch (UnknownHostException e) {  
                        e.printStackTrace();  
                    }  
                    ipAddress= inet.getHostAddress();  
                }  
            }  
            //对于通过多个代理的情况，第一个IP为客户端真实IP,多个IP按照','分割  
            if(ipAddress!=null && ipAddress.length()>15){ //"***.***.***.***".length() = 15  
                if(ipAddress.indexOf(",")>0){  
                    ipAddress = ipAddress.substring(0,ipAddress.indexOf(","));  
                }  
            }  
            return ipAddress;   
    }


}
