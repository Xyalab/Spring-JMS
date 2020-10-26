package pers.johnx.text;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pers.johnx.demo.TopicProducer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/spring/applicationContext-jms-producer-topic.xml")
public class JmsTopicTest {

    @Autowired
    private TopicProducer topicProducer;

    @Test
    public void sendTextTopic(){
        topicProducer.sendTextMessage("Hello Topic!");
        System.out.println("发送成功！");
    }

}
