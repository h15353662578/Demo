package com.hs.useraccount.service;

import java.math.BigDecimal;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/09/8:28
 * @Description:
 */
public interface UserAccountService {

    /***
     *
     * @param userId
     * @param money
     */
    void decrease(Long userId, BigDecimal money);

}
