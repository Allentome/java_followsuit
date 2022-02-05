package com.allen.followsuit.service;

import com.allen.followsuit.dao.AccountDao;
import com.allen.followsuit.entity.Account;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AccountService {
    @Resource
    private AccountDao accountDao;

    public List<Account> findAllaccount(){
        return accountDao.findAll();
    }

}
