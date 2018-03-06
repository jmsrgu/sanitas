package com.mycorp;

import java.io.IOException;
import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.mycorp.repository.config.ConfigurationRepository;






@SpringBootApplication
@Import({ConfigurationRepository.class})
//@Component
//@ComponentScan("com.mycorp")
//@EnableAutoConfiguration
public class MainApp {
	
	   @Autowired
	    private Environment env;
   public static void main(String[] args) {
	   SpringApplication.run(MainApp.class, args);
   }
   @PostConstruct
   public void initApplication() throws IOException {
       if (env.getActiveProfiles().length == 0) {
           //logger.warn("No Spring profile configured, running with default configuration with profile develop");
       }
       else {
          // logger.info("Running with Spring profile(s) : {}", Arrays.toString(env.getActiveProfiles()));
       }
   }
}