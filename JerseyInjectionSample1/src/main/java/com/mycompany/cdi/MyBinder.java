/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cdi;

import org.glassfish.hk2.utilities.binding.AbstractBinder;

public class MyBinder extends AbstractBinder {
 
    
    @Override
    protected void configure() {
        bind(GreetingServiceImpl.class).to(GreetingService.class);      
    }
 
}