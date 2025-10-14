package com.devadam.colours.services.impl;

import com.devadam.colours.services.RedPrinter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class SpanishRedPrinter implements RedPrinter {

    @Override
    public String print() {
        return "rojo";
    }
}
