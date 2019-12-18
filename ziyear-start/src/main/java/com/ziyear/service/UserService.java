package com.ziyear.service;

import com.github.pagehelper.PageInfo;
import com.ziyear.model.dto.UserDTO;

/**
 * Created by Administrator on 2018/4/19.
 */
public interface UserService {

    int addUser(UserDTO user);

    PageInfo<UserDTO> findAllUser(int pageNum, int pageSize);
}
