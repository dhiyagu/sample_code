package com.intuit.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.intuit.schema.domain.banking.welcome.v1.WelcomeMessage;
import com.intuit.schema.domain.banking.welcome.v1.WelcomeMessageReadRequest;
import com.intuit.schema.domain.banking.welcome.v1.WelcomeMessageReadResponse;
import com.intuit.services.entity.welcomemessage.WelcomeMessageRepository;

@Service("welcomeService")
public class WelcomeServiceImpl implements WelcomeService {

	@Autowired(required = true)
	@Qualifier("welcomeMessageRepository")
	WelcomeMessageRepository repository;

	@Override	
	public WelcomeMessageReadResponse readWelcomeMessage(
			WelcomeMessageReadRequest request) {

		WelcomeMessage message = 	repository.retrieveWelcomeMessage(request.getDeveloperId());

		WelcomeMessageReadResponse response = new WelcomeMessageReadResponse();
		
		response.setWelcomeMessage(message);

		return response;
	}
}
