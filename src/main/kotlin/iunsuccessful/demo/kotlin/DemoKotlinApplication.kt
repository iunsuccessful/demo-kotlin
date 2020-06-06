package iunsuccessful.demo.kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

//@MapperScan("iunsuccessful.demo.kotlin.dao")
@SpringBootApplication
class DemoKotlinApplication

fun main(args: Array<String>) {
	runApplication<DemoKotlinApplication>(*args)
}
