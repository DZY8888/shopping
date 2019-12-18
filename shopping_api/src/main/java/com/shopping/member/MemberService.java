package com.shopping.member;

import com.shopping.weixin.dto.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface MemberService {

    @GetMapping("/getMember")
    Test getMember();

}
