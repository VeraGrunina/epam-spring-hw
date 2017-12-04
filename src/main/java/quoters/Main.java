package quoters;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("contex.xml");
        context.getBean(TerminatorQuoter.class).sayQoute();
    }
}
