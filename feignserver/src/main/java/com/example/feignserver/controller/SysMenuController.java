package com.example.feignserver.controller;

import com.example.feignserver.entity.DtoSystemMenu;
import com.example.feignserver.entity.SysMenuEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class SysMenuController {

    @RequestMapping(value="/list",method = RequestMethod.POST)
    public List<SysMenuEntity> getMenu(@RequestBody DtoSystemMenu dto){
     List<SysMenuEntity> entities = new ArrayList<>();
//     Object obj = map.get("sysMenu");
//        SysMenuEntity entity = null;
//     if (obj instanceof  SysMenuEntity){
//          entity = (SysMenuEntity) map.get("sysMenu");
//     }
     entities.addAll(dto.getEntity());
     System.out.print(dto.getEntity().toString()+dto.getAd().toString());
     return entities;
    }

    @PostMapping("/HelloSpring")
    public SysMenuEntity HelloSpring (){
        System.out.println("hello spring boot");
        SysMenuEntity  sysMenutity = new SysMenuEntity();
        sysMenutity.setName("hello spring boot");
        return sysMenutity;
    }

}
