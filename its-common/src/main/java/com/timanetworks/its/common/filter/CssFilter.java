/** 
 * Project Name:its-common 
 * File Name:CssFilter.java 
 * Package Name:com.timanetworks.its.common.filter 
 * Date:2018年6月11日下午1:44:33 
 * Copyright (c) 2018, Tima Networks Inc. All Rights Reserved. 
 * 
 */
package com.timanetworks.its.common.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**  
* @ClassName: CssFilter  
* @Description: 跨站脚本攻击(Cross Site Scripting)
* @author haisheng  
* @date 2018年6月11日  
*    
*/
@WebFilter(filterName = "CssFilter", urlPatterns = "/*", asyncSupported = true)
public class CssFilter implements Filter {
    
    private static Logger logger = LoggerFactory.getLogger(CssFilter.class);
    
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info("enter init() method!");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        logger.info("enter doFilter() method!");
        
        CssHttpServletRequestWrapper requestWrapper = new  
                    CssHttpServletRequestWrapper((HttpServletRequest)request);
        chain.doFilter(requestWrapper, response);
    }

    @Override
    public void destroy() {
        logger.info("enter destory() method!");
    }

}
