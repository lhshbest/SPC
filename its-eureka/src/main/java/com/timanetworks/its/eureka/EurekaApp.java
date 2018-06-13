/** 
 * Project Name:its-eureka 
 * File Name:EurekaApp.java 
 * Package Name:com.timanetworks.its.eureka 
 * Date:2018年6月8日下午1:48:44 
 * Copyright (c) 2018, Tima Networks Inc. All Rights Reserved. 
 * 
 */
package com.timanetworks.its.eureka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**  
* @ClassName: EurekaApp  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author haisheng  
* @date 2018年6月8日  
*    
*/
@SpringBootApplication
@EnableEurekaServer
public class EurekaApp {
    
    private static Logger logger = LoggerFactory.getLogger(EurekaApp.class);
    
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaApp.class).web(true).run(args);
        logger.info("EurekaApp start ok!");
    }

}
