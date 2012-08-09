package com.intuit.services.entity.welcomemessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.intuit.schema.domain.banking.welcome.v1.WelcomeMessage;


@Component("welcomeMessageRepository")
public class WelcomeMessageRepository {

	@Autowired(required = true)
	@Qualifier("welcomeMessageEntityManager")
	WelcomeMessageDao dao;

	public WelcomeMessage retrieveWelcomeMessage(String developerId) {
		return dao.selectMessageFromDB(developerId);
	}
}
