package com.main.sbp.controller;

import java.security.Principal;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class OAuthController {

	@GetMapping("/message")
	public ResponseEntity<String> getMessage(Principal principal) {

		return new ResponseEntity<>("Hi " + principal.getName() + " Welocme to OAuth Demo Application", HttpStatus.OK);

	}

}
