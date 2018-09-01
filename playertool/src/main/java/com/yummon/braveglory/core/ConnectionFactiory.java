package com.yummon.braveglory.core;

import org.apache.ibatis.datasource.DataSourceFactory;
import org.apache.ibatis.datasource.pooled.PooledDataSourceFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.boot.jdbc.DataSourceBuilder;

/**
 * Created by Administrator on 2018/9/1.
 */
public class ConnectionFactiory {

    public SqlSessionFactory createFactory(){

        DataSourceFactory factory = new PooledDataSourceFactory();
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
    }


}
