package com.yechangqing.demo.java.basic.time;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        var nowLocalDateTime = LocalDateTime.now();
        var yesterday = nowLocalDateTime.toLocalDate().plusDays(-1);
        var ystart = Date.from(LocalDateTime
            .of(yesterday, LocalTime.MIN)
            .atZone(ZoneId.systemDefault())
            .toInstant());
        var yend = Date.from(LocalDateTime
            .of(yesterday, LocalTime.MAX)
            .atZone(ZoneId.systemDefault())
            .toInstant());
        // 2020-02-20 00:00:00
        System.out.println(dateFormat.format(ystart));
        // 2020-02-20 23:59:59
        System.out.println(dateFormat.format(yend));
    }
}
