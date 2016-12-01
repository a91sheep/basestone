package com.store59.api.remoteservice;

/**
 * @author <a href="mailto:linxh@59store.com">linxiaohui</a>
 * @version 1.0 16/12/1
 * @since 1.0
 */

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("springcloud-service")
public interface SpringcloudServiceClient {
    @RequestMapping(method = RequestMethod.GET, value = "/springcloudservice/add")
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}
