package test;

import configure.WebConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.mail.javamail.JavaMailSender;
import persistence.UserDao;
import bean.UserEntity;
import configure.RootConfigure;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.UserService;

/**
 * Created by hzlaojiaqi on 2016/8/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfigure.class})
public class MyTest extends AbstractJUnit4SpringContextTests {


    @Autowired
    UserService userService;

    @Test
    public void testMybatis(){
     System.out.print(userService.findUserById(2));

    }
}
