package com.igorkhromov;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.server.handler.HandlerCollection;
import org.eclipse.jetty.webapp.WebAppContext;

import java.io.File;


public class Main {

    public static void main(String[] args) throws Exception {
        String webXmlPath = new File(".").getAbsolutePath()
                + "/src/main/webapp";

        Server server = new Server();

        ServerConnector connector = new ServerConnector(server);
        connector.setPort(8080);
        server.setConnectors(new Connector[] { connector });

        WebAppContext context = new WebAppContext();
        context.setErrorHandler(new ErrorHandler());
        context.setContextPath("/");
        context.setResourceBase(webXmlPath);
        context.setParentLoaderPriority(true);

        HandlerCollection handlers = new HandlerCollection();
        handlers.setHandlers(new Handler[] { context });
        server.setHandler(handlers);

        server.start();
        server.join();
    }
}
