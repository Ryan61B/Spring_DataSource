package cn.bdqn;

import cn.bdqn.entity.Car;
import cn.bdqn.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class DataSourceTest {

    private ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

    @Test
    public void Test_01(){
//        DataSource dataSource = context.getBean(DataSource.class);

        //按照类型获取组件,可以获取这个类型下所有实现类子类等等...
        DataSource dataSource = (DataSource) context.getBean("dataSource");
        System.out.println(dataSource);

        Car car = context.getBean(Car.class);
        System.out.println(car);
    }

    /**
     * autowire自动装配
     */
    @Test
    public void Test_02(){
        User user = context.getBean("user",User.class);
        System.out.println(user);
    }

}
