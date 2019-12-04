package com.david;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

//这个类用于启动项目
// 其中的 @ComponenetScan 扫描和 application 在同一个 包下（包括子包） 中的所有bean
@SpringBootApplication
//扫描mybaitis 通用mapper所在的包
@MapperScan(basePackages = "com.david.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
