package net.stigen.homecode.server;

import net.stigen.homecode.server.HomecodeProperties;

public class HomecodeServer {

    public static void main(String args[]) {
        HomecodeProperties.get(HomecodeProperties.EProperties.BIND_PORT);
    }
}
