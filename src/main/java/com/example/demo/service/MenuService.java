package com.example.demo.service;

import com.example.demo.domain.Menu;
import com.example.demo.dto.MenuDTO;

public interface MenuService {
    MenuDTO findById(int menuNo);

    int register(Menu menu);
}
