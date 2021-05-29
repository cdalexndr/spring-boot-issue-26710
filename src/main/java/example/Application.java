package example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackageClasses = {Application.class})
@EnableTransactionManagement(mode = AdviceMode.ASPECTJ)
public class Application {
    public static void main( String[] args ) {
        SpringApplication.run( Application.class, args );
    }
}
