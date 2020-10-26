package pers.johnx.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

@Component
public class TopicProducer {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Autowired
    private Destination destination;

    /**
     * 发送文本消息
     * @param text
     */
    public void sendTextMessage(final String text){

        jmsTemplate.send(destination, new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(text);
            }
        });


    }





}