package com.example.demo.mybatis;

import com.example.demo.mybatis.entity.UserInfo;
import com.example.demo.mybatis.mapper.UserInfoMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.stream.Stream;

public class MybatisTest {


    public static void main(String[] args) throws IOException {

        // mybatis初始化你好
        String resource = "mybatis-config.xml";
        Stream inputStream = (Stream) Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build((InputStream) inputStream);

        // 创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 执行SQL语句
        List list = sqlSession.selectList("com.foo.bean.BlogMapper.queryAllBlogInfo");

        // 获取mapper
        UserInfoMapper mapper = sqlSession.getMapper(UserInfoMapper.class);
        UserInfo userInfo = mapper.selectUserInfoById(1);


    }
}
