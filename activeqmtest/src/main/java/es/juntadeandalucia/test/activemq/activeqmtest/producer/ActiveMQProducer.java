package es.juntadeandalucia.test.activemq.activeqmtest.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "es.juntadeandalucia.test.activemq.activeqmtest.producer")
public class ActiveMQProducer {

	public static void main(String[] args) {

	SpringApplication.run(ActiveMQProducer.class,args);


	}

}
