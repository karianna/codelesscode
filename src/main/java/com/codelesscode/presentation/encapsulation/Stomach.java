package com.codelesscode.presentation.encapsulation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Stomach {
    
    private final static Logger LOGGER = LoggerFactory.getLogger(Stomach.class);
    
    @SuppressWarnings("static-method")
    public void feed() {
        LOGGER.error("Monk dies in an agonsing & grisly death.");
    }

}
