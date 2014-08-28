package com.codelesscode.presentation.encapsulation;

/** Case III - Encapsulation */
public class Encapsulation {
    
    private Monk monk = new Monk();
    
    public static void main(String[] args) {
        Encapsulation me = new Encapsulation();        
        me.feedingTime();
    }
    
    private void feedingTime() {
        // monk.getMouth().feed();
        monk.stomach.feed();
    }
}
