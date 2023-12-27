package es.juntadeandalucia.test.activemq.activeqmtest.producer;

import es.juntadeandalucia.test.activemq.activeqmtest.model.Employee;
import lombok.extern.slf4j.Slf4j;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class JmsProducer {

    @Autowired
    JmsTemplate jmsTemplate;

    @Value("${active-mq.topic}")
    private String topic;

    public void sendMessage(Employee message){
        try{
            log.info("Attempting Send message to Topic: "+ topic);
            jmsTemplate.convertAndSend(new ActiveMQTopic(topic), message);
        } catch(Exception e){
            log.error("Recieved Exception during send Message: ", e);
        }
    }
}
