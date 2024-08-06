package com.mycom.myapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringDiApplicationTests {

    @Test
    void contextLoads() {
    }

}

// ide 도 spring boot 전용 sts4를 사용해서 spring boot project를 만들고 spring boot를 기반으로 spring mvc 프로젝트를 생성하고 학습한다.
// 현재 학습하는 내용은 JSP를 사용하는 spring legacy project (spring mvc project)를 만들고 테스트 해야한다.
// spring lagecy project (spring mvc project)는 내장 톰캣도 없고, root-context.xml. servlet-context.xml 설정파일이 나눠져서 설정이 많이 복잡하다.
// pom.xml로 의존성을 확인해보자