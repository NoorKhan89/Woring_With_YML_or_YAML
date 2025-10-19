package in.vayam.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootApp2Application {

	public static void main(String[] args) {
	System.out.println("Stating to server");	
	SpringApplication.run(SpringBootApp2Application.class, args);
	
	System.out.println("Stop the server");
	}

}
