package es.juntadeandalucia.test.activemq.activeqmtest.producer.controller;

import es.juntadeandalucia.test.activemq.activeqmtest.producer.JmsProducer;
import es.juntadeandalucia.test.activemq.activeqmtest.model.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ProduceMessageController {
    @Autowired
    JmsProducer jmsProducer;

    @PostMapping(value="/api/employee")
    public Employee sendMessage(@RequestBody Employee employee){
        jmsProducer.sendMessage(employee);
        return employee;
    }
}
