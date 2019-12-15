package org.nagesh.demo;

import org.nagesh.demo.config.DemoConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbNageshDemoApplication implements CommandLineRunner {

	@Autowired
	private DemoConfig myConfig;
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SbNageshDemoApplication.class);
        app.run();
		
        //SpringApplication.run(SbNageshDemoApplication.class, args);
	}
	
	public void run(String... args) throws Exception {
        System.out.println("using environment: " + myConfig.getEnvironment());
        System.out.println("name: " + myConfig.getName());
        System.out.println("servers: " + myConfig.getServers());
    }

}
