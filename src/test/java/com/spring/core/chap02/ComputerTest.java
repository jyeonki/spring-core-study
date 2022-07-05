package com.spring.core.chap02;

import com.spring.core.chap02.computer.Computer;
import com.spring.core.chap02.computer.Keyboard;
import com.spring.core.chap02.computer.SamsungKeyboard;
import com.spring.core.chap02.computer.config.ComputerConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {

    @Test
    @DisplayName("자바 클래스 설정파일에 등록한 Computer 빈을 가져와야 한다.")
    void findBeanTest() {

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(ComputerConfig.class);
        Computer computer = ac.getBean(Computer.class);

        computer.showSpec();

    }


}
