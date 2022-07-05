package com.spring.core.chap03.computer.config;

import com.spring.core.chap03.computer.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 스프링 컨테이너에 스프링 빈을 등록하는 설정 파일
@Configuration
public class ComputerConfig {

    @Bean
    public Keyboard keyboard() {
        return new SamsungKeyboard();
    }

    @Bean
    public Monitor monitor() {
        return new SamsungMonitor();
    }

    @Bean
    public Mouse mouse() {
        return new AppleMouse();
    }

    @Bean
    public Computer computer() {
        return new Computer(keyboard(), mouse(), monitor());
    }

}
