package com.example.demo.service;

import com.example.demo.domain.Menu;
import com.example.demo.repository.MenuRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class MenuServiceImpl implements MenuService{

    private final MenuRepository menuRepository;

    @Override
    public Menu findById(int menuNo) {
        return menuRepository.findById(menuNo).orElse(null);
    }

    @Override
    public int register(Menu menu) {
        return menuRepository.save(menu).getMenuNo();
    }
}
