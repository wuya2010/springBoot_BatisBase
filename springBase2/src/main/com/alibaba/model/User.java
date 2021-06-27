package main.com.alibaba.model;

/**
 * @author kylinWang
 * @data 2021-06-27 11:43
 */
public class User { //com.alibaba.bean.User

    private String name;
    private  int  age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "User [name=" + name + ", age=" + age + "]";
    }

    //bean初始化时调用的方法
    public void init(){
        System.out.println("Bean初始化.....");
    }
    //bean销毁时调用的方法
    public void destroy(){
        System.out.println("Bean销毁.....");
    }


}
