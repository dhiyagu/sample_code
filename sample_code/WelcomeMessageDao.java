package com.intuit.services.entity.welcomemessage;

import org.springframework.stereotype.Component;

import com.intuit.schema.domain.banking.welcome.v1.WelcomeMessage;

@Component("welcomeMessageEntityManager")
public class WelcomeMessageDao {

	public WelcomeMessage selectMessageFromDB(String developerId) {
		WelcomeMessage welcomeMessage = new WelcomeMessage();
		welcomeMessage.setId((long) 1);
		welcomeMessage.setDeveloperId(developerId);

		if ("sakib".equals(developerId)) {
			welcomeMessage.setMessage("Hi there, Welcome back to SOA, Sakib");
		} else {
			welcomeMessage.setMessage("Welcome to SOA," + developerId);
		}
	
		return welcomeMessage;
	}
}
