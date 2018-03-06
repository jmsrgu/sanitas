package com.mycorp.repository.config;



import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.mycorp.repository.ValueCodeRepository;
import com.mycorp.support.ValueCode;


@Configuration
@EnableJpaRepositories(basePackages = "com.mycorp.repository")
@EntityScan(basePackageClasses=ValueCode.class)
@ComponentScan(basePackageClasses = ValueCodeRepository.class)
public class ConfigurationRepository {

}
