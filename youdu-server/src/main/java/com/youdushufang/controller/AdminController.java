package com.youdushufang.controller;

import com.youdushufang.common.model.CommonResp;
import com.youdushufang.exception.ServiceException;
import com.youdushufang.service.ConfigService;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotEmpty;

@RestController
@RequestMapping("/admin/api")
public class AdminController {

    private final ConfigService configService;

    public AdminController(ConfigService configService) {
        this.configService = configService;
    }

    @GetMapping("/name")
    public CommonResp<String> getYouduName() {
        return CommonResp.success(
                configService.getConfig("whosyourdaddy"));
    }

    @GetMapping("/config")
    public CommonResp<String> getConfig(@NotEmpty @RequestParam("key") String configKey) {
        return CommonResp.success(
                configService.getConfig(configKey));
    }

    @PostMapping("/burn")
    public CommonResp<String> burnSomething() {
        throw new ServiceException(3001, "Something is burning!");
    }

    @GetMapping("/fun")
    public CommonResp<String> getSomeFun() {
        return CommonResp.success("Wheeee!");
    }
}
