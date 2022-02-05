package com.allen.followsuit.controller;

import com.allen.followsuit.common.Result;
import com.allen.followsuit.entity.Account;
import com.allen.followsuit.entity.Goods;
import com.allen.followsuit.service.AccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/data_account")
public class AccountController {

    @Resource
    private AccountService accountService;

    @GetMapping
    public Result<List<Account>> findAllaccount() {
        return Result.success(accountService.findAllaccount());
    }
}
