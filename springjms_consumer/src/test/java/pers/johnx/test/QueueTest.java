package pers.johnx.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/spring/applicationContext-jms-consumer-queue.xml")
public class QueueTest {

    @Test
    public void testQueue(){
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
