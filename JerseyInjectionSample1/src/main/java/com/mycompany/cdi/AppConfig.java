/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cdi;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author imran
 */
@ApplicationPath("services")
public class AppConfig extends ResourceConfig{
  
    public AppConfig() {
        packages("com.mycompany.cdi").register(new MyBinder());
    }
    
}
