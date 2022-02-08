package com.fastcampus.practice;

import com.fastcampus.practice.config.Config;
import com.fastcampus.practice.service.StringSortService;
import java.util.Arrays;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        StringSortService sortService = context.getBean(StringSortService.class);
        List<String> list = sortService.doSort(Arrays.asList(args));

        System.out.println("Hello World !- result: " + list.toString());
    }
}
