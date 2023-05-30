package com.example.demo.controller;

import com.example.demo.domain.Menu;
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
    public int registerMenu(@RequestParam("menuName") String menuName,
                             @RequestParam("menuType") String menuType,
                             @RequestParam("menuPrice") int menuPrice,
                             @RequestParam("menuDesc") String menuDesc) {

        Menu menu = Menu.builder()
                .menuName(menuName)
                .menuType(menuType)
                .menuPrice(menuPrice)
                .menuDesc(menuDesc)
                .build();

        return menuService.register(menu);
    }

}
