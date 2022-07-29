package sunghyeon.startkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class StartKotlinApplication

fun main(args: Array<String>) {
	runApplication<StartKotlinApplication>(*args)
}
