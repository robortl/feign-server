package com.example.feignserver.entity;

import lombok.Data;

import java.util.List;

@Data
public class DtoSystemMenu {
    private List<SysMenuEntity> entity;
    private Long ad;
}
