package com.yuebaix.hongjun.launcher;

import com.yuebaix.pangu.support.PanGuScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@ComponentScan(
        basePackages = "com.yuebaix.hongjun",
        useDefaultFilters = false,
        includeFilters = {
                @ComponentScan.Filter(type = FilterType.CUSTOM, classes = PanGuScan.IncludeTypeFilter.class)
        },
        excludeFilters = {
                @ComponentScan.Filter(type = FilterType.CUSTOM, classes = PanGuScan.ExcludeTypeFilter.class)
        }
)
@SpringBootApplication
public class HongJunLauncher {
    public static void main(String[] args) {
        SpringApplication.run(HongJunLauncher.class, args);
    }
}
