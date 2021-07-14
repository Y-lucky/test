package com.cykj.mapper;

import com.cykj.bean.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User selectUser(User user);
}
