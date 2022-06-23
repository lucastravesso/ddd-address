package com.ddd.addressapi;

import com.ddd.addressapi.core.config.CoreConfig;
import com.ddd.addressapi.inbound.config.InboundConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AddressapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(new Class[]{
				AddressapiApplication.class,
				CoreConfig.class,
				InboundConfig.class,
		}, args);

	}
}
