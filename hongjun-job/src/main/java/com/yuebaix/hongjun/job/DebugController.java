package com.yuebaix.hongjun.job;

import com.yuebaix.hongjun.infra.service.UserService;
import com.yuebaix.pangu.common.util.JacksonUtil;
import com.yuebaix.pangu.web.base.BaseResp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Api(tags = "调试接口")
@Slf4j
@RestController
@RequestMapping("/debug")
public class DebugController {
    @Autowired
    private UserService userService;
    @Autowired
    private Map<String, UserService> svcMap;

    @SneakyThrows
    @ApiOperation("测试")
    @GetMapping("/test")
    public BaseResp get(Long id) {
        log.info(JacksonUtil.getObjectMapperHolder().writerWithDefaultPrettyPrinter().writeValueAsString(svcMap));
        return BaseResp.success(userService.get(id));
    }
}