package org.nagesh.demo;

import java.util.stream.Stream;

import org.nagesh.demo.config.DemoConfig;
import org.nagesh.demo.modal.User;
import org.nagesh.demo.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SbNageshDemoApplication implements CommandLineRunner {

	@Autowired
	private DemoConfig myConfig;
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SbNageshDemoApplication.class);
        app.run();
		
        //SpringApplication.run(SbNageshDemoApplication.class, args);
	}
	
	@Bean
	CommandLineRunner init(UserRepository userRepo) {
		return args -> {
			Stream.of("Nagesh","Sindhu","Likith","Siva").forEach(name ->
			{
				User user = new User(name,name.toLowerCase()+"@sklmt.com");
				userRepo.save(user);
			});
			userRepo.findAll().forEach(System.out::println);
		};
	}
	
	public void run(String... args) throws Exception {
        System.out.println("using environment: " + myConfig.getEnvironment());
        System.out.println("name: " + myConfig.getName());
        System.out.println("servers: " + myConfig.getServers());
    }

}
