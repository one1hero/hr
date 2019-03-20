package com.newer.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 
 * @author LiuBin
 *
 */
@RestController
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "";
	}
}
