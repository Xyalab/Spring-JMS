package pers.johnx.text;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pers.johnx.demo.QueueProducer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/spring/applicationContext-jms-producer-queue.xml")
public class JmsQueueTest {

    @Autowired
    private QueueProducer queueProducer;

    @Test
    public void sendTextQueue(){

        queueProducer.sendTextMessage("SpringJms点对点 信息");
        System.out.println("发送成功！");
    }



}
