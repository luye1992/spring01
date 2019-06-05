package net.wanho;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2019/5/27.
 */
public class TestHello {

    private static Logger logger = Logger.getLogger(TestHello.class);

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

       HelloWord hw =  (HelloWord) ctx.getBean("hw2");

       hw.hello();

       logger.debug("debug");

    }
}
