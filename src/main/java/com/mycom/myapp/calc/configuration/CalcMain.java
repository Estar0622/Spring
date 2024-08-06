package com.mycom.myapp.calc.configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalcMain {

    public static void main(String[] args) {
        // 개발자가 직접 객체를 만드는 방법
//		Calculator calculator = new Calculator();
//		System.out.println(calculator.add(3, 7));

        // Spring DI 를 통한 객체를 이용하는 바업
        // java main() 에서 spring context 를 사용하도록 준비하고 실행 <= Java Configuration
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CalcConfiguration.class);
        Calculator calculator = (Calculator) context.getBean("calculator");// spring 에게 의뢰
        System.out.println(calculator.add(4, 5));
        context.close();
    }

}