package es.juntadeandalucia.test.activemq.activeqmtest.consumer;

import es.juntadeandalucia.test.activemq.activeqmtest.model.Employee;
import jakarta.jms.Message;
import jakarta.jms.ObjectMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class JmsConsumer {
    @Value("${spring.application.name}")
    private String applicationName;

    @JmsListener(destination = "Consumer.${spring.application.name}.${active-mq.topic}")
    public void recive(Message message) {
        try{
            ObjectMessage objectMessage = (ObjectMessage)message;
            Employee employee = (Employee)objectMessage.getObject();
            //do additional processing
            log.info("Consumer" + applicationName +" received Message from Topic: "+ employee.toString());
        } catch(Exception e) {
            log.error("Received Exception while processing message: "+ e);
        }

    }
}
