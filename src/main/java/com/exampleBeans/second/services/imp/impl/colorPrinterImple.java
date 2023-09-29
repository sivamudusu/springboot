package com.exampleBeans.second.services.imp.impl;

import com.exampleBeans.second.services.imp.bluePrinter;
import com.exampleBeans.second.services.imp.colorPrinter;
import com.exampleBeans.second.services.imp.greenPrinter;
import com.exampleBeans.second.services.imp.redPrinter;

public class colorPrinterImple implements colorPrinter {
    private redPrinter RedPrinter;
    private bluePrinter BluePrinter;
    private greenPrinter GrennPrinter;

    public colorPrinterImple(redPrinter redPrinter,bluePrinter bluePrinter, greenPrinter greenPrinter){
        this.GrennPrinter = greenPrinter;
        this.BluePrinter = bluePrinter;
        this.RedPrinter = redPrinter;
    }
    public String print(){
        return String.join(",",RedPrinter.print(), GrennPrinter.print(), BluePrinter.print());
    }
}
