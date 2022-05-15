package org.example;

import static org.junit.Assert.assertTrue;

import org.example.pojo.Users;
import org.example.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void Test01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_service.xml");
        UserService userService = (UserService) ac.getBean("userServiceImpl");
        int num = userService.insert(new Users(100,"545","465"));
        System.out.println(num);
    }
}
