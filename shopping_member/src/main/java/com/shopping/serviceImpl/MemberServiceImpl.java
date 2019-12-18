package com.shopping.serviceImpl;

import com.shopping.feign.WeiXinFeignService;
import com.shopping.member.MemberService;
import com.shopping.weixin.dto.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberServiceImpl implements MemberService {

    @Autowired
    private WeiXinFeignService weiXinFeignService;

    @Override
    public Test getMember() {
        return weiXinFeignService.getTest();
    }
}
