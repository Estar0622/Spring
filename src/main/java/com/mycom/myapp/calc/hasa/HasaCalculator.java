package com.mycom.myapp.calc.hasa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class HasaCalculator {
    // DI #1 field ( 오랜동안 문제없이 잘 사용.... )
//  @Autowired
//  Calculator calculator;


    // DI #2 setter
//  Calculator calculator;
//
//  @Autowired
//  public void setCalculator(Calculator calculator) {
//      this.calculator = calculator;
//  }
    // DI #3 constructor (@Autowired 필요 X)
    Calculator calculator;
    public HasaCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public int add(int n1, int n2) {
        System.out.println("HasaCalculator add()");
        return calculator.add(n1, n2);

    }
}