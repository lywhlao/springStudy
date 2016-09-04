package test;

import bean.Apple;
import bean.Banana;
import bean.Fruit;
import configure.WebConfig;
import impl.BasicGenerator;
import inter.Generator;
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

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hzlaojiaqi on 2016/8/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfigure.class})
public class MyTest extends AbstractJUnit4SpringContextTests {


//    @Autowired
//    UserService userService;
//
//    @Test
//    public void testMybatis(){
//     System.out.print(userService.findUserById(2));
//
//    }

    @Test
    public void test(){
        List<? extends Fruit> fruits=new ArrayList<Apple>();
       // fruits.add(new Fruit());

        Person person=new Person();
        person.setAge(18);
        person.setName("laobing");
        person.setHigh(175);


        System.out.print(person.getName());
    }


    /**
     * 工厂模式
     */
    @Test
    public void factoryTest(){
        Generator<Person> personGenerator=BasicGenerator.getGenerator(Person.class);
        Person person=personGenerator.next();
        person.setName("hello");
        System.out.print(person.getName());
    }
}
