package net.stigen.homecode.server;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

public class HomecodeServices extends ResourceConfig {
    public HomecodeServices(){
        packages("net.stigen.homecode.diary.services");
        register(JacksonFeature.class);
    }
}
