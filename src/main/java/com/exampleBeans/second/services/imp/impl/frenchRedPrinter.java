package com.exampleBeans.second.services.imp.impl;

import com.exampleBeans.second.services.imp.colorPrinter;
import com.exampleBeans.second.services.imp.redPrinter;

public class frenchRedPrinter  implements redPrinter {
    @Override
    public String print() {
        return "rojo";
    }
}
