package com.exampleBeans.second.services;

import com.exampleBeans.second.services.imp.colorPrinter;
import com.exampleBeans.second.services.imp.impl.colorPrinterImple;
import com.exampleBeans.second.services.imp.sample;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.PrintStream;

@SpringBootApplication
@Log

public class coloursApplication implements CommandLineRunner{
    private colorPrinter colorPrinter;

    public coloursApplication(colorPrinter colorPrinter){
        this.colorPrinter = colorPrinter;

    }
    public static void main(String[] args) {
        SpringApplication.run(coloursApplication.class, args);
    }

    @Override
    public void run(final String... args) {


        log.info(colorPrinter.print());
    }
}
