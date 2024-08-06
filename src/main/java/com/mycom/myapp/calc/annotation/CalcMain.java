package com.mycom.myapp.calc.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalcMain {
    public static void main(String[] args) {
        // 개발자가 직접 객체를 만드는 방법
        //Calculator calculator = new Calculator();
        //System.out.println(calculator.add(3,7));

        //spring DI를 통한 객체를 이용하는 방법을 알아보자
        // java main()에서 spring context를 사용하도록 준비하고 실행

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xml/calc-annotation.xml");
        Calculator calulator = (Calculator) context.getBean("calculator"); // spring에게 의뢰
        System.out.println(calulator.add(4,5));
        context.close();


    }
}
