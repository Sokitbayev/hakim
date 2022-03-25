package com.example.hakim

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ExampleController() {

	@GetMapping("/name")
	fun name(): String {
		return "Tlek".repeat(100).plus("Tlek\n".repeat(100000))
	}

}