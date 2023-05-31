package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int menuNo;         // 메뉴 번호
    private String menuName;    // 메뉴 이름
    private String menuType;    // 메뉴 타입 (에피타이저, 메인, 사이드, 음료 등)
    private int menuPrice;      // 메뉴 가격
    private String menuDesc;    // 메뉴 설명
}
