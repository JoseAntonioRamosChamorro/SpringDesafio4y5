package com.everis.spring.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	public static String prueba = "Inicio";

	@GetMapping("/inicio")
	public String showTest() {
		return prueba;
	}

}
