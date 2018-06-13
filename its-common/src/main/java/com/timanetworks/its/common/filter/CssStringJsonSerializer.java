/** 
 * Project Name:its-common 
 * File Name:CssStringJsonSerializer.java 
 * Package Name:com.timanetworks.its.common.filter 
 * Date:2018年6月11日下午2:06:04 
 * Copyright (c) 2018, Tima Networks Inc. All Rights Reserved. 
 * 
 */
package com.timanetworks.its.common.filter;

import java.io.IOException;

import org.springframework.web.util.HtmlUtils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * @ClassName: CssStringJsonSerializer
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author haisheng
 * @param <T>
 * @date 2018年6月11日
 * 
 */
public class CssStringJsonSerializer extends JsonSerializer<String> {

    @Override
    public void serialize(String value, JsonGenerator jsonGenerator, SerializerProvider arg2)
            throws IOException, JsonProcessingException {
        if (value != null) {
            String encodedValue = HtmlUtils.htmlEscape(value);
            jsonGenerator.writeString(encodedValue);
        }
    }
}
