package client;

import common.RestaurantService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RestaurantMain {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ApplicationContext bf =
				new ClassPathXmlApplicationContext("client.xml");

		RestaurantService service = (RestaurantService) bf.getBean("restService");

		RestaurantUI ui = new RestaurantUI(service);
		ui.start();
		
	}
}

