package com.yechangqing.demo.java.springboot.kafka.job;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

@Component
public class Consumer1 {
    public static AtomicInteger num = new AtomicInteger(0);

    @KafkaListener(topics = "test")
    public void consumer(ConsumerRecord<String, String> record) throws InterruptedException {
        long time = System.currentTimeMillis() - record.timestamp();
        num.incrementAndGet();
        if (time < 5000) {
            System.out.println("*********线程等待***************");
            Thread.sleep(5000 - time);
        }
        System.out.println(record.timestamp() + ":" + record);
        System.out.println("1:" + num);
    }
}
