package com.hs.userStorage.service.impl;

import com.hs.userStorage.mapper.UserStorageMapper;
import com.hs.userStorage.service.UserStorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/08/20:05
 * @Description:
 */

@Service
@Slf4j
public class UserStorageServiceImpl implements UserStorageService {

    @Resource
    private UserStorageMapper userStorageMapper;

    @Override
    public void decrease(Long productId, Integer count) {
        log.info("----> StorageService中扣减库存");
        userStorageMapper.decrease(productId, count);
        log.info("----> StorageService中扣减库存完成");
    }

}
