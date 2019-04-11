package com.example.feignserverapi;

import feign.Headers;
import feign.RequestLine;

import java.util.List;

@Headers("Content-Type:application/json")

public interface TestFeignClient {

    @RequestLine("POST list")
    List<SysMenuEntity> getMenu(DtoSystemMenu dto);

    @RequestLine("POST HelloSpring")
    SysMenuEntity HelloSpring();

}
