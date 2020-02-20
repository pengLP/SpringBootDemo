package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;
public interface UserMapper {

    Integer insertUser(User user);

    Integer batchInsertUser(List<User> users);

    User deleteUser(Integer id);

    User updateUser(User user);

    User selectUser(Integer id);

    List<User> selectAllUser();

    @Select("select * from t_user where username like CONCAT('%' , #{0} , '%')")
    @ResultMap("userMap")
    List<User> selectUserByName(String name);
}
