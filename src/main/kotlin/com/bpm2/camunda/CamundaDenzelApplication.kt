package com.bpm2.camunda

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CamundaDenzelApplication

fun main(args: Array<String>) {
	runApplication<CamundaDenzelApplication>(*args)
}
