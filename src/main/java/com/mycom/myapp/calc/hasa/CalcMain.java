package com.mycom.myapp.calc.hasa;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalcMain {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xml/hasa-calc-annotation.xml");
        HasaCalculator hasaCalculator = (HasaCalculator) context.getBean("hasaCalculator");// spring 에게 의뢰
        System.out.println(hasaCalculator.add(4, 5));
        context.close();
    }

}