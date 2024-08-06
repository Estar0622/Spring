package com.mycom.myapp.calc.configuration;

import org.springframework.stereotype.Component;

@Component // 클래스 이름으로부터 ID도출, ID가 명시되어 있으면 그 ID사용
public class Calculator {
    public int add (int n1, int n2) {
        return n1 + n2;
    }
}
