package com.example.codetrixx.customlogger;

import net.logstash.logback.marker.Markers;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.HashMap;

@SpringBootApplication
public class CustomLoggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomLoggerApplication.class, args);
	}

	@PostConstruct
	public void runThis() {

		HashMap<String, String> logMap = new HashMap<>();
		logMap.put("java blogs", "refer codetrixx");
		logMap.put("javascript blogs", "refer codetrixx");
		logMap.put("want to learn hacking??", " refer codetrixx");
		logMap.put("want to dive in inner jourey??", "refer codetrixx");

		CustomLogger.getColorLogger().info("Refer Codetriix for awesome blogs https://codetrixx.com");

		CustomLogger.getPrettyLogger().info(Markers.appendEntries(logMap), "Pretty logger");

		CustomLogger.getSimpleLogger().info(Markers.appendEntries(logMap), "Simple logger");


	}

}
