package ex02;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

// 옛 방식 

//@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes= {MyApplication.class})


//springboot 방식 -> 설정 파일을 지정하지 않는다. 


//

@SpringBootTest
public class MyApplicationTest {
	
	@Autowired
	private MyComponent myComponent;
	
	@Test
	public void myComponentNotNull() {
		assertNotNull(myComponent);
	}
}
