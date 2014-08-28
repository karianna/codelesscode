package com.codelesscode.presentation;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Empty {

    private final static Logger LOGGER = LoggerFactory.getLogger(Empty.class);
    
    /** Is initialised to null */
    List<?> dataCollection = null; // new ArrayList<>();
    
    public static void main(String[] args) {
        Empty me = new Empty();
        me.readFromCollection();
    }
    
    private void readFromCollection() {
        LOGGER.info("Collection Size is:" + dataCollection.size());
    }

}
