package com.lanou.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

@WebFilter("/*")
public class SysFilter implements Filter {
	
	private Logger log = Logger.getLogger(SysFilter.class);

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		// System.out.println("TestFilter init()===========");

	}

	@Override
	public void doFilter(ServletRequest srequest, ServletResponse sresponse, FilterChain chain)
			throws IOException, ServletException {
//		地址
		HttpServletRequest request = (HttpServletRequest) srequest;
		HttpServletResponse response = (HttpServletResponse) sresponse;
		String path = request.getContextPath();
		String url = request.getRequestURL().toString();
		String uri = request.getRequestURI().toString();
//		http://localhost:8080/jk/
		url = url.substring(url.lastIndexOf("/")+1);
		log.debug("url======"+url);
		log.debug("uri======"+uri);
		log.debug("path======"+path);
		
		if (url.equals("index")||url.equals("")) {
			//
			boolean flag = isExist(request);
			if (flag) {
				response.sendRedirect("fmain.action");
				return;
			}
		}
		chain.doFilter(request, response);
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

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		// System.out.println("TestFilter destroy()===========");
	}

}
