package com.codelesscode.presentation.encapsulation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mouth {
    
    private final static Logger LOGGER = LoggerFactory.getLogger(Mouth.class);
    
    @SuppressWarnings("static-method")
    public void feed() {
        LOGGER.info("Monk is well fed.");
    }

}
