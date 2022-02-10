package ex03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// Spring Test는 되지만 BootTest는 x 
//@Configuration 

// Springboot Test


@SpringBootConfiguration
@ComponentScan
public class MyApplication {
	
	public static void main(String[] args) {
		try(ConfigurableApplicationContext c = SpringApplication.run(MyApplication.class, args)){
			
		}
	}

}
