package ru.perm.v.multimodule.application;

import ru.perm.v.multimodule.service.EchoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "ru.perm.v.multimodule")
@RestController
public class DemoApplication {

	private final EchoService echoService;

	public DemoApplication(EchoService myService) {
		this.echoService = myService;
	}

	@GetMapping("/echo/{message}")
	public String home(String message) {
		return echoService.message(message);
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
