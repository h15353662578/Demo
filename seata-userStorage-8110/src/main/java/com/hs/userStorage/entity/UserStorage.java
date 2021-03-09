package com.hs.userStorage.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/08/20:01
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserStorage {

    private Long id;

    private Long productId;

    private Integer total;

    private Integer used;

    private Integer residue;
}
