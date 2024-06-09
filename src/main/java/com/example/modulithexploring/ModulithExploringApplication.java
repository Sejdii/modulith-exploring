package com.example.modulithexploring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.modulith.Modulithic;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@Modulithic(sharedModules = "shared")
public class ModulithExploringApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModulithExploringApplication.class, args);
    }

}
