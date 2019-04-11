package com.example.feignserverapi;

import lombok.Data;

import java.util.List;

@Data
public class DtoSystemMenu {
    private List<SysMenuEntity> entity;
    private Long ad;
}
