package com.store59.api.controller;

import com.store59.api.remoteservice.SpringcloudServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="mailto:linxh@59store.com">linxiaohui</a>
 * @version 1.0 16/12/1
 * @since 1.0
 */
@RestController
public class ApiController {
    @Autowired
    SpringcloudServiceClient client;

    @RequestMapping(value = "/sum", method = RequestMethod.GET)
    public Integer sum() {
        Integer ret = client.add(10, 20);
        System.out.println(ret);
        return ret;
    }
}
