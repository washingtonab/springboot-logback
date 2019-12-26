package br.com.springboot.log.springbootlog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootLogApplication implements CommandLineRunner {

	private static Logger logger = LoggerFactory.getLogger(SpringbootLogApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringbootLogApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		MDC.put("separator", "assunto");
		
		logger.trace("A TRACE Message");
		logger.debug("A DEBUG Message");
		logger.info("An INFO Message");
		logger.warn("A WARN Message");
		logger.error("An ERROR Message");

	}

}
