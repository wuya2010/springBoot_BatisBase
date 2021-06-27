package main.com.alibaba.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author kylinWang
 * @data 2021-06-27 11:49
 */
public class test {  //com.alibaba.bean.test

    /*
    (1)spring 的主要作用就是为代码“解耦”，降低代码间的耦合度。
    根据功能的不同，可以将一个系统中的代码分为主业务逻辑与系统级业务逻辑两类

    (2)Spring 根据代码的功能特点，将降低耦合度的方式分为了两类：IOC 与AOP

    (3)IoC 使得主业务在相互调用过程中，不用再自己维护关系了，即不用再自己创建要使用的对象了,由 Spring 容器统一管理，自动“注入”

    (4) AOP 使得系统级服务得到了最大复用，且不用再由程序员手工将系统级服务“混杂”到主业务逻辑中了，而是由 Spring 容器统一完成“织入”
     */

    public static void main(String[] args) {
        //创建Spring上下文（加载bean.xml）
        ApplicationContext acx = new ClassPathXmlApplicationContext("spring-config.xml");
        //获取HelloWorld实例并赋值
        User id = acx.getBean("user", User.class);
        id.setName("李四");
        id.setAge(22);
        //再获取一个实例，不赋值
        User idNew = acx.getBean("user", User.class);
        //新建2个对象： 调用方法
        System.out.println(id.toString());
        System.out.println(idNew.toString());
    }

//    @Test
//    public void getTest() {
//
//        /*
//            getBean 方法的获取：
//
//            （1）getBean(String name)
//            参数name表示IOC容器中已经实例化的bean的id或者name,且无论是id还是name都要求在IOC容器中是唯一的不能重名。
//            那么这种方法就是通过id或name去查找获取bean.
//
//            （2）getBean(Class type)
//            参数Class type表示要加载的Bean的类型。如果该类型没有继承任何父类(Object类除外)和实现接口的话，
//            那么要求该类型的bean在IOC容器中也必须是唯一的。比如applicationContext.xml配置两个类型完全一致的bean,且都没有配置id和name属性
//
//            我们可以总结getBean(String name)和getBean(Class type)的异同点。
//            相同点：都要求id或者name或者类型在容器中的唯一性。
//            不同点：getBean(String name)获得的对象需要类型转换而getBean(Class type)获得的对象无需类型转换。
//
//            （3）getBean(String name,Class type)
//            这种方式比较适合当类型不唯一时，再通过id或者name来获取bean。
//
//            （4）getBean(String name,Object[] args)
//            这种方式本质还是通过bean的id或者name来获取bean,通过第二个参数Object[] args可以给bean的属性赋值，
//            赋值的方式有两种：构造方法和工厂方法。但是通过这种方式获取的bean必须把scope属性设置为prototype，也就是非单例模式
//         */
//
//        //创建Spring上下文（加载bean.xml）
//        ApplicationContext acx = new ClassPathXmlApplicationContext("spring-config.xml");
//        //获取HelloWorld实例并赋值
//        User id = acx.getBean("user", User.class);
//        id.setName("李四");
//        id.setAge(22);
//        //再获取一个实例，不赋值
//        User idNew = acx.getBean("user", User.class);
//        //新建2个对象： 调用方法
//        System.out.println(id.toString());
//        System.out.println(idNew.toString());
//    }


//    @Test
//    public void getTest2() {
//        //创建Spring上下文（加载bean.xml）
//        ApplicationContext acx = new ClassPathXmlApplicationContext("spring-config.xml");
//        //获取User实例
//        User user = acx.getBean("user", User.class);
//        //调用方法
//        System.out.println(user.toString());
//    }
//
//    @Test
//    public void gtTest3() {
//        //创建Spring上下文（加载bean.xml）
//        ApplicationContext acx = new ClassPathXmlApplicationContext("spring-config.xml");
//        //获取HelloWorld实例并赋值
//        User id = acx.getBean("user", User.class);
//        id.setName("李四");
//        id.setAge(22);
//        //调用方法
//        id.toString();
//        //销毁实例对象
//        ((ClassPathXmlApplicationContext) acx).close();
//
//    }
}
