package ex02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Spring Test는 되지만 BootTest는 x 
//@Configuration 

// Springboot Test
@SpringBootConfiguration
public class MyApplication {
	
	@Bean
	public MyComponent myComponent() {
		return new MyComponent();
	}
	
	public static void main(String[] args) {
		try(ConfigurableApplicationContext c = SpringApplication.run(MyApplication.class, args)){
			
		}
	}

}
