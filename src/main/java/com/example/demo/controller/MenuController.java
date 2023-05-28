package com.example.demo.controller;

import com.example.demo.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class MenuController {

    private final MenuService menuService;

}
