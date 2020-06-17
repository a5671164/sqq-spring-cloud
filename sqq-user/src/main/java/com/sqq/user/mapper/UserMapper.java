package com.sqq.user.mapper;

import com.sqq.user.model.User;
import org.apache.ibatis.annotations.Update;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    @Update("update t_user set balance = balance - #{balance},integral = integral + #{integral} where id = #{id}")
    int updateUserInfo(User user);
}