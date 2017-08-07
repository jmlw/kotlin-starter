import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.Configuration

@EnableAutoConfiguration
@Configuration
class Application

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}