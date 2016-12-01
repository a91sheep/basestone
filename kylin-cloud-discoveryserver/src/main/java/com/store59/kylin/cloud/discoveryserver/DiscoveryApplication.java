/**
 * Copyright (c) 2015, 59store. All rights reserved.
 */
package com.store59.kylin.cloud.discoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *
 * @author <a href="mailto:chenyb@59store.com">山人</a>
 * @version 1.0 15/11/26
 * @since 1.0
 */
@SpringBootApplication
@EnableEurekaServer
@EnableEurekaClient
public class DiscoveryApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DiscoveryApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryApplication.class, args);
    }
}
