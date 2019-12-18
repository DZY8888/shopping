package com.shopping.weixin.api;

import com.shopping.weixin.dto.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface WeiXinService {

    @GetMapping("/getTest")
    Test getTest();
}
