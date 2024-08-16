package com.example.datefinder;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController
public class MyController {

    @GetMapping("/")
    public String datefinder() {
        LocalDate dateObj = LocalDate.now();
        LocalDate res = dateObj.plusDays(100);
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = res.format(format1);
        return formattedDate;
    }
}
