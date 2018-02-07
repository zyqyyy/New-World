package com.lanou.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lanou.entity.AuthUser;
import com.lanou.entity.LoginLogp;
import com.lanou.service.LoginLogpService;
import com.lanou.service.UserService;


@Controller
public class IndexController {
	
	@Resource
	public UserService userService;
	@Resource
	private LoginLogpService loginLogpService;

	@RequestMapping("/index")
	public String index(HttpServletRequest request) {
		
		String[] cookie = getCookie(request);
		if (cookie.length==2) {
				request.setAttribute("userName", cookie[0]);
				request.setAttribute("password", cookie[1]);
		}
		
		
		
		return "index";
	}
	
	public String[] getCookie(HttpServletRequest request) {
		String[] strs = new String[2];
		Cookie[] cs = request.getCookies();
		if (cs!=null) {
			for (Cookie c : cs) {
				if (c.getName().equals("userName")) {
					// 获取账号
					strs[0] = c.getValue();
				}
				if (c.getName().equals("password")) {
					// 获取密码
					strs[1] = c.getValue();
				}
		}
		}
		return strs;
	}

	@RequestMapping(value="/fmain.action")
	public String fmain(HttpServletRequest request){
		LoginLogp login = new LoginLogp();
		String[] cookie = getCookie(request);
		List<AuthUser> list = userService.selectByUser(cookie[0]);
		List<AuthUser> user = userService.selectByUser(list.get(0).getUSERNAME());
		AuthUser user2 = user.get(0);
		request.getSession().setAttribute("user",user2 );
		
		
		login.setLOGIN_TIME(new Date());
		login.setLOGIN_NAME(cookie[0]);
		login.setIP_ADDRESS(getIpAddr(request));
		loginLogpService.insertSelective(login);
		return "/home/fmain";
	}
	
	@RequestMapping(value="/title")
	public String title(){
		return "/home/title";
	}
	
	@RequestMapping(value="/left")
	public String left(){
		return "/home/left";
	}
	
	@RequestMapping(value="/main")
	public String main(){
		return "/home/olmsgList";			//首页转向留言板
	}
	
	//系统管理模块
	
	@RequestMapping("/sysadminMain.action")
	public String sysadminMain(){
		return "/sysadmin/main";
	}
	
	@RequestMapping("/sysadminLeft.action")
	public String sysadminLeft(){
		return "/sysadmin/left";
	}
	
	//基础信息模块
	
	@RequestMapping("/baseinfoMain.action")
	public String baseinfoMain(){
		return "/baseinfo/main";
	}
	
	@RequestMapping("/baseinfoLeft.action")
	public String baseinfoLeft(){
		return "/baseinfo/left";
	}
	
	//货运管理模块
	
	@RequestMapping("/cargoMain.action")
	public String cargoMain(){
		return "/cargo/main";
	}
	
	@RequestMapping("/cargoLeft.action")
	public String cargoLeft(){
		return "/cargo/left";
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
