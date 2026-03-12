package com.dhruba.cqrs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.yaml.snakeyaml.util.ArrayUtils;

import java.lang.reflect.Array;
import java.util.Arrays;

@SpringBootApplication
public class Application {
    static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
