package com.cgwx.data;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
class DataApplicationTests
{
    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads()
    {
        System.out.println(dataSource.getClass());
        Connection connection = null;
        try
        {
            connection = dataSource.getConnection();
        } catch (SQLException throwables)
        {
            throwables.printStackTrace();
        }
        System.out.println(connection);
        try
        {
            connection.close();
        } catch (SQLException throwables)
        {
            throwables.printStackTrace();
        }
    }
}
