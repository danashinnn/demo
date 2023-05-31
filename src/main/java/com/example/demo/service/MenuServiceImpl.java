package com.example.demo.service;

import com.example.demo.domain.Menu;
import com.example.demo.dto.MenuDTO;
import com.example.demo.repository.MenuRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class MenuServiceImpl implements MenuService{

    private final MenuRepository menuRepository;

    @Override
    public MenuDTO findById(int menuNo) {
        Optional<Menu> menuOptional = menuRepository.findById(menuNo);
        Menu menu = menuOptional.orElseThrow();
        MenuDTO menuDTO = MenuDTO.builder()
                .menuNo(menu.getMenuNo())
                .menuName(menu.getMenuName())
                .menuType(menu.getMenuType())
                .menuPrice(menu.getMenuPrice())
                .menuDesc(menu.getMenuDesc())
                .build();

        return menuDTO;
    }

    @Override
    public int register(Menu menu) {
        return menuRepository.save(menu).getMenuNo();
    }
}
