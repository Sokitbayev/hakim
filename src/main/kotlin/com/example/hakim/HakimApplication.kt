package com.example.hakim

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class HakimApplication

fun main(args: Array<String>) {
	runApplication<HakimApplication>(*args)
}


@RestController
class ExampleController() {

	@GetMapping("/name")
	fun name(): String {
		return "Tlek".repeat(100).plus("Tlek\n".repeat(100000))
	}

}
