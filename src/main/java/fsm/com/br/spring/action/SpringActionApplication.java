package fsm.com.br.spring.action;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan("fsm.com.br.spring.action.controllers")

@RestController
public class SpringActionApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringActionApplication.class, args);
	}
	@GetMapping("/")
	public String helloWorld() {
		return "Hello World main";
	}

}
