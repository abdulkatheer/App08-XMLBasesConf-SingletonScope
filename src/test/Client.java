package test;

import beans.Mobile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("resources/applicationContext.xml");

        Mobile r1 = (Mobile) context.getBean("redminote7pro");
        Mobile r2 = (Mobile) context.getBean("redminote7pro");

        Mobile h1 = (Mobile) context.getBean("honor8lite");
        Mobile h2 = (Mobile) context.getBean("honor8lite");
        System.out.println(String.format("%-15s%-15s%-15s%-15s%-15s%-15s","Brand", "Model", "Year", "OS", "RAM", "Internal"));
        r1.getMobileDetails();
        r2.getMobileDetails();
        h1.getMobileDetails();
        h2.getMobileDetails();
    }
}
