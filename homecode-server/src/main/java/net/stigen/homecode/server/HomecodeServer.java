package net.stigen.homecode.server;

import static net.stigen.homecode.server.HomecodeProperties.EProperties.*;

/**
 * Launcher for the Homecode-server.
 * Requires the following arguments:
 * -Dhomecode.config_file=[path to homecode.properties]
 */
public class HomecodeServer {

    public static void main(String args[]) {
        System.out.println(HomecodeProperties.get(BIND_PORT));
        System.out.println(HomecodeProperties.get(MAX_REQUESTS));



    }
}
