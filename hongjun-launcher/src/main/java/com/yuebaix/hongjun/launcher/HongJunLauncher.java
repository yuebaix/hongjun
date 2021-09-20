package com.yuebaix.hongjun.launcher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.yuebaix.hongjun")
public class HongJunLauncher {
    public static void main(String[] args) {
        SpringApplication.run(HongJunLauncher.class, args);
    }
}
