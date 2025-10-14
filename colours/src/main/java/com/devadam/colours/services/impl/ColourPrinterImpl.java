package com.devadam.colours.services.impl;

import com.devadam.colours.services.BluePrinter;
import com.devadam.colours.services.ColourPrinter;
import com.devadam.colours.services.GreenPrinter;
import com.devadam.colours.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class ColourPrinterImpl implements ColourPrinter {

    private final GreenPrinter greenPrinter;
    private final RedPrinter redPrinter;
    private final BluePrinter bluePrinter;

    public ColourPrinterImpl(RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter) {
        this.greenPrinter = greenPrinter;
        this.redPrinter = redPrinter;
        this.bluePrinter = bluePrinter;
    }

    @Override
    public String print() {
        return String.join(", ", redPrinter.print(), bluePrinter.print(), greenPrinter.print());
    }
}