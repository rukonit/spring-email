package com.rukon.mailSenderdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class MailSenderdemoApplication {

	@Autowired
	private EmailSenderService emailSenderService;

	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() {
		emailSenderService.sendSimpleEmail("rkhanit@gmail.com", "<h1>Hi...</h1><p>How are you man</p>", "Testmessage from Rukon");
	}

	public static void main(String[] args) {
		SpringApplication.run(MailSenderdemoApplication.class, args);
	}

}
