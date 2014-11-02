package com.sample;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.assets.AssetsBundle;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Configuration;
import com.yammer.dropwizard.config.Environment;

public class MainServer extends Service<Configuration>{
    public static void main(String[] args) throws Exception {
    	System.out.println("Starting AngularSampleApp...");
        new MainServer().run(args);
    }

    @Override
    public void initialize(final Bootstrap<Configuration> bootstrap) {
        AssetsBundle bundle = new AssetsBundle("/html", "/");
        bootstrap.addBundle(bundle);
    }

    @Override
    public void run(final Configuration configuration, final Environment environment) throws Exception {
        environment.manage(new ManagedImpl());
        environment.addResource(new RestServiceImpl());
    }
}
