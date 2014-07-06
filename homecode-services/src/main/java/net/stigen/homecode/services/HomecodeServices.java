package net.stigen.homecode.services;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

public class HomecodeServices extends ResourceConfig {
    public HomecodeServices(){
        packages("net.stigen.homecode.services");
        register(JacksonFeature.class);
    }
}
