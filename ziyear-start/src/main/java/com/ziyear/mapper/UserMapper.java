package com.ziyear.mapper;


import com.ziyear.model.dto.UserDTO;

import java.util.List;

public interface UserMapper {


    int insert(UserDTO record);


    List<UserDTO> selectUsers();
}