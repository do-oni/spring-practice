package hello.spring.doon;
// hello.spring.doon 하위 패키지들만 자동 스캔

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DoonApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoonApplication.class, args);
	}

}
