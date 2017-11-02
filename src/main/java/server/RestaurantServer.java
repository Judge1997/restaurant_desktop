package server;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RestaurantServer {

    public static void main(String[] agrs){
        ApplicationContext bf = new ClassPathXmlApplicationContext("server.xml");

        System.out.println("Server has started...");
    }

}
