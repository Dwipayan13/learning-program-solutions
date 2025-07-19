package com.cognizant.microservices.simple;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;

import com.cognizant.microservices.eurekaserver.EurekaServerApplication;

import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(OutputCaptureExtension.class)
public class SampleSimpleApplicationTests {

	private String profiles;

	@BeforeEach
	public void init() {
		this.profiles = System.getProperty("spring.profiles.active");
	}

	@AfterEach
	public void after() {
		if (this.profiles != null) {
			System.setProperty("spring.profiles.active", this.profiles);
		} else {
			System.clearProperty("spring.profiles.active");
		}
	}

	@Test
	public void testDefaultSettings(CapturedOutput output) {
		EurekaServerApplication.main(new String[0]);
		assertThat(output.getOut()).contains("Hello Phil");
	}

	@Test
	public void testCommandLineOverrides(CapturedOutput output) {
		EurekaServerApplication.main(new String[]{"--name=Gordon"});
		assertThat(output.getOut()).contains("Hello Gordon");
	}
}
