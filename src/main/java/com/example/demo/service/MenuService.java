package com.example.demo.service;

import com.example.demo.domain.Menu;

public interface MenuService {
    Menu findById(int menuNo);

    int register(Menu menu);
}
