package pnr.demo.proj01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Proj01Application {

	public static void main(String[] args) {
		SpringApplication.run(Proj01Application.class, args);
	}

}
