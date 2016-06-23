/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cdi;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author imran
 */
@Path("service1")
public class MyService {
   
    @Inject
    private GreetingService greetingServiceImpl;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String sayHello(){
        return "Simple Injection :"+greetingServiceImpl.sayHello();//+greetingService.sayHello();
    }
}
