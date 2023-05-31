package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MenuDTO {
    private int menuNo;
    private String menuName;
    private String menuType;
    private int menuPrice;
    private String menuDesc;
}
