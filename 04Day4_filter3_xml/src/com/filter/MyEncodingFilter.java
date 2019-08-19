package com.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;



public class MyEncodingFilter implements Filter {

   

	public void destroy() {
		System.out.println("MyEncodingFilter.destroy");
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("MyEncodingFilter.doFilter 요청"); //요청필터
		request.setCharacterEncoding("utf-8");
        chain.doFilter(request, response);
		System.out.println("MyEncodingFilter.doFilter 응답"); //응답필터
	}


	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("MyEncodingFilter.init");
	}

}
