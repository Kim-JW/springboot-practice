package ex01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

/*
 * 
 * Bootstrapping Class
 * 
 * 1. 스프링부트 애플리케이션의 부트스트래핑(Bootstrapping)
 * 2. 설정 클래스로 역할(Configuration Class)
 * 
 * */


@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		/*
		 * run 안에서의 과정 
		 * 
		 * 1. Application Context, Spring Container 생성 
		 * 2. Web Application Type인 경우 -> MVC or Reactive 타입 결정 
		 * 3. Annotation Scanning(Auto) or Configuration Class(Explicit) 통한 빈 생성/등록 및 Wiring 
		 * 4. Web Application(MVC - WAS 필요)
		 * 	- 내장(Embedded) 서버(TomcatEmbbededServletConatiner) 인스턴스 생성
		 * 	- 서버 인스턴스 Web Application을 배포
		 *  - 서버 인스턴스 실행 
		 * 
		 *  5. ApplicationRunner Interface를 구현한 Bean을 찾아서 실행(run 호출)
		 * 
		 * */
		
		// ConfigurableApplicationContext c = null;
		
//		try {
//			 c = SpringApplication.run(HelloWorldApplication.class, args);
//		} catch (Throwable ex) {
//			ex.printStackTrace();
//		} finally {
//			c.close();
//		}
		
		// try ~ with ~ resource
		
		try(ConfigurableApplicationContext c = SpringApplication.run(HelloWorldApplication.class, args)){
			
		}
		
	}
}
