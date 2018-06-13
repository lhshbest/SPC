/** 
 * Project Name:its-common 
 * File Name:CssHttpServletRequestWrapper.java 
 * Package Name:com.timanetworks.its.common.filter 
 * Date:2018年6月11日下午1:25:13 
 * Copyright (c) 2018, Tima Networks Inc. All Rights Reserved. 
 * 
 */
package com.timanetworks.its.common.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

import org.springframework.web.util.HtmlUtils;

/**  
* @ClassName: CssHttpServletRequestWrapper  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author haisheng  
* @date 2018年6月11日  
*    
*/
public class CssHttpServletRequestWrapper extends HttpServletRequestWrapper {

    /**  
    * 创建一个新的实例 CssHttpServletRequestWrapper.  
    *  
    * @param request  
    */ 
    public CssHttpServletRequestWrapper(HttpServletRequest request) {
        super(request);
    }

    @Override
    public String getHeader(String name) {
        return HtmlUtils.htmlEscape(super.getHeader(name));
    }

    @Override
    public String getParameter(String name) {
        return HtmlUtils.htmlEscape(super.getParameter(name));
    }

    @Override
    public String[] getParameterValues(String name) {
        String[] values = super.getParameterValues(name);
        
        if (null == values) {
            return super.getParameterValues(name);
        }
        
        String[] strArrays = new String[values.length];
        int flag = 0;

        for (String str : values) {
            strArrays[flag] = HtmlUtils.htmlEscape(str);
            flag++;
        }
        
        return strArrays;
    }

    
    
}
