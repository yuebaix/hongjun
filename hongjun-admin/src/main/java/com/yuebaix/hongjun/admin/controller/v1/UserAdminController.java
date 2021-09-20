package com.yuebaix.hongjun.admin.controller.v1;

import com.yuebaix.hongjun.infra.entity.User;
import com.yuebaix.hongjun.infra.service.UserService;
import com.yuebaix.pangu.web.base.BaseResp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "用户管理接口")
@RequestMapping("/v1/admin/user")
@RestController
public class UserAdminController {
    @Autowired
    private UserService userService;

    @ApiOperation("获取用户")
    @GetMapping("/get")
    public BaseResp<User> get(Long id) {
        return BaseResp.success(userService.get(id));
    }
}
