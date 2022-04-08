package com.example.SpringSecurityJdbcNew1;

	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.GetMapping;

	@Controller
	public class LoginControllerAq2 {

		@GetMapping("/login")
		public String login() {
			return "login";
		}
	}