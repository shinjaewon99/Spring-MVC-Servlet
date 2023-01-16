package helloMVC.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;



/*
@ServletComponentScan
스프링이 자동으로 helloMVC의 하위 패키지에서
Servlet 찾아 등록해 실행할수있게 도와준다.
*/
@ServletComponentScan
@SpringBootApplication
public class ServletApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServletApplication.class, args);
	}

}
