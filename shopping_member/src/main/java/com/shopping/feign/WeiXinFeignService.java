package com.shopping.feign;

import com.shopping.weixin.api.WeiXinService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@Component
@FeignClient(name = "weixin")
public interface WeiXinFeignService extends WeiXinService {

}
