package project.bmicalc;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("project.bmicalc")
public class MyApplicationConfig extends ResourceConfig {
    public MyApplicationConfig () {
        packages("project.bmicalc");
    }
}