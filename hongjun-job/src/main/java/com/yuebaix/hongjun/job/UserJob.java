package com.yuebaix.hongjun.job;

import com.yuebaix.hongjun.infra.entity.User;
import com.yuebaix.hongjun.infra.service.UserService;
import com.yuebaix.pangu.common.util.JacksonUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Slf4j
@Component
public class UserJob {
    private ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
    @Autowired
    private UserService userService;

    @PostConstruct
    public void postConstruct() {
        scheduledExecutorService.scheduleAtFixedRate(this::execute, 0, 3, TimeUnit.SECONDS);
    }

    @PreDestroy
    public void preDestroy() {
        scheduledExecutorService.shutdown();
    }

    public void execute() {
        User user = userService.get(new Random().nextLong());
        log.info(JacksonUtil.write(user));
    }
}
