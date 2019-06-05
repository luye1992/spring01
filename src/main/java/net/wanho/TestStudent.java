package net.wanho;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2019/5/27.
 */
public class TestStudent {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext2.xml");
//        Student stu1 = (Student) ctx.getBean("stu1");
//        Student stu2 = (Student) ctx.getBean("stu2");
//        Student stu21 = (Student) ctx.getBean("stu21");
        Student stu4 = (Student) ctx.getBean("stu10");


//        System.out.println(stu1);
//        System.out.println(stu2);
//        System.out.println(stu21);
          System.out.println(stu4);

    }
}
