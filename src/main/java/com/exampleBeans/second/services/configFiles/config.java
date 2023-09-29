package com.exampleBeans.second.services.configFiles;

import com.exampleBeans.second.services.imp.bluePrinter;
import com.exampleBeans.second.services.imp.colorPrinter;
import com.exampleBeans.second.services.imp.greenPrinter;
import com.exampleBeans.second.services.imp.impl.*;
import com.exampleBeans.second.services.imp.redPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {
    @Bean
    public redPrinter redPrinter(){
        return new frenchRedPrinter();
    }
    @Bean
    public bluePrinter bluePrinter(){
        return new frenchBluePrinter();
    }
    @Bean
    public greenPrinter greenPrinter(){
        return new frenchGreenPrinter();
    }
    @Bean
    public colorPrinter colorPrinter(redPrinter redPrinter,bluePrinter bluePrinter,greenPrinter greenPrinter){
        return new colorPrinterImple(redPrinter,bluePrinter,greenPrinter);
    }
}
