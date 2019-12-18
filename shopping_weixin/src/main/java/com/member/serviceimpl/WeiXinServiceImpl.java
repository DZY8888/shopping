package com.member.serviceimpl;

import com.shopping.weixin.api.WeiXinService;
import com.shopping.weixin.dto.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeiXinServiceImpl implements WeiXinService {

    @GetMapping("/getTest")
    @Override
    public Test getTest() {
        return new Test(1,"调用成功了");
    }
}
