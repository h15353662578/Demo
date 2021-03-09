package com.hs.userStorage.service;

import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/08/20:04
 * @Description:
 */
public interface UserStorageService {

    void decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}
