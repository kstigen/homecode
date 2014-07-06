package net.stigen.homecode.server;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;

import java.text.SimpleDateFormat;
import java.util.Date;

import static net.stigen.homecode.server.HomecodeProperties.EProperties.*;

/**
 * Launcher for the Homecode-server.
 *
 * Requires the following arguments:
 * -Dhomecode.config_file=[path to homecode.properties]
 */
public class HomecodeServer {

    public static void main(String args[]) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss,SSS");
        Server server = new Server(HomecodeProperties.getInt(BIND_PORT));

        System.out.println("Starting with www_root " + HomecodeProperties.get(WWW_ROOT));
        ResourceHandler resource_handler = new ResourceHandler();
        resource_handler.setDirectoriesListed(false);
        resource_handler.setWelcomeFiles(new String[]{ "index.html" });
        resource_handler.setResourceBase(HomecodeProperties.get(WWW_ROOT));

        HandlerList handlers = new HandlerList();
        handlers.setHandlers(new Handler[] { resource_handler, new DefaultHandler() });
        server.setHandler(handlers);

        server.start();
        System.out.println("HOMECODE STARTED at " + sdf.format(new Date()) + " on PORT "+ HomecodeProperties.get(BIND_PORT));

        server.join();
    }
}
