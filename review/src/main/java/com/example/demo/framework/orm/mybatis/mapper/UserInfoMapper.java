package com.example.demo.framework.orm.mybatis.mapper;

import com.example.demo.framework.orm.mybatis.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author fanyangyang
 */
@Mapper
@Repository
public interface UserInfoMapper {

    /**
     * 查询用户信息
     * @param id
     * @return
     */
    UserInfo selectUserInfoById(@Param("id") Integer id);
}
