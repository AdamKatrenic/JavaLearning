package com.devadam.colours.services.impl;

import com.devadam.colours.services.BluePrinter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class SpanishBluePrinter implements BluePrinter {

    @Override
    public String print() {
        return "azul";
    }
}
