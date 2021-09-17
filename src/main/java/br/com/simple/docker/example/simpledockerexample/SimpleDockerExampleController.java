package br.com.simple.docker.example.simpledockerexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleDockerExampleController {

	@GetMapping("/flow")
	public void getFlow() {
		System.out.println("First case success.");
	}
	
}
