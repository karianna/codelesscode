package com.codelesscode.presentation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Case I - The Small Stuff */
public class TheSmallStuff {

    private final static Logger LOGGER = LoggerFactory.getLogger(TheSmallStuff.class);
    
    private int addend1 = 0;
    private int addend2 = 0;
    
    public static void main(String[] args) {
        TheSmallStuff me = new TheSmallStuff();
        me.generateSum();
    }
    
    private void generateSum() {
        LOGGER.info("Sum of two addends is: " + addend1 + addend2 + "");
    }
}
