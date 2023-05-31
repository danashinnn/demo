package com.example.demo.controller;

import com.example.demo.domain.Menu;
import com.example.demo.dto.MenuDTO;
import com.example.demo.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/menu")
@RequiredArgsConstructor
public class MenuController {

    private final MenuService menuService;

    @GetMapping("/get/{menuNo}")
    public Menu getMenu(@PathVariable("menuNo") int menuNo) {
        return menuService.findById(menuNo);
    }

    @PostMapping("/register")
    public int registerMenu(@RequestBody MenuDTO param) {

        Menu menu = Menu.builder()
                .menuName(param.getMenuName())
                .menuType(param.getMenuType())
                .menuPrice(param.getMenuPrice())
                .menuDesc(param.getMenuDesc())
                .build();

        return menuService.register(menu);
    }

}
