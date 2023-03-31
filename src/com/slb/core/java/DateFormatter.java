package com.slb.core.java;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateFormatter {
    private static final String DATE_FORMAT = "MMM d, yyyy HH:mm a";
    private static final String EXPECTED_DATE_STRING_FORMAT = "Mar 1, 2023 12:00 PM";

    public static void main(String[] args) {

        TimeZone.setDefault(TimeZone.getTimeZone("IST"));
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.MARCH, 1, 12, 0);
        Date date = calendar.getTime();

        DateFormat formatter = new SimpleDateFormat(DATE_FORMAT);

        String formattedDate = formatter.format(date);

        assertEquals(EXPECTED_DATE_STRING_FORMAT , formattedDate);
        System.out.println(formattedDate);


        //using java 8
        DateTimeFormatter formatterJava8Example = DateTimeFormatter.ofPattern(DATE_FORMAT);
        Instant instant = date.toInstant();
        LocalDateTime localDateTime = instant.atZone(ZoneId.of("UTC"))
                .toLocalDateTime();

        String formattedDateJava8 = localDateTime.format(formatterJava8Example);
        System.out.println(formattedDateJava8);

    }
}
