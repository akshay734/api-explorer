package com.api.explorer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class ExplorerApplication implements CommandLineRunner {
	@Autowired
	private ExploreService exploreService;


	public static void main(String[] args) {
		SpringApplication.run(ExplorerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Application started");
		if(args.length>0 && args[0].equals("0")) {
			System.out.print(exploreService.getUsermodel("akshay"));
		}
		if(args.length>0 && args[0].equals("1")){
			System.out.println("\ncalling arg1");
			exploreService.getRepoall();

		}
	}
}
