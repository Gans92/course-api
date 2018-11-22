package com.gagan.springbootstarter.controller;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

	@Autowired
	private JavaMailSender javaMail;
	
	@RequestMapping("/sendEmail")
	public String SendEmail() {
		MimeMessage message = javaMail.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);
		try {
			helper.setTo("gaganyv8@gmail.com");
			helper.setText("Hello Gagan, Texting from SprinBoot application.");
			helper.setSubject("Email from Spring Boot Team");
		}catch(MessagingException e) {
			e.printStackTrace();
			return "Error Sending Emails.";
		}
		javaMail.send(message);
		return "Email Sent Successfully";
	}
}
