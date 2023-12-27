package es.juntadeandalucia.test.activemq.activeqmtest.consumer;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
@SpringBootApplication(scanBasePackages = "es.juntadeandalucia.test.activemq.activeqmtest.consumer")
public class ActiveMQConsumer {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ActiveMQConsumer.class)
                .web(WebApplicationType.NONE)
                .run(args);
    }
}
