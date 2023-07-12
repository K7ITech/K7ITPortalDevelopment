package com.k7it.sms;


import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
/**
 * 
 * @author Gowtham
 *
 */
@EnableWebMvc
@SpringBootApplication
@EnableSwagger2
public class SmsApplication {
	
	SmsApplication(){
		
	}
	
	private static Logger logger = Logger.getLogger(SmsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SmsApplication.class, args);

		logger.info("<<<<<<<<<<<<<<<<<<<<<SmsApplication Main class Started>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	}

}
