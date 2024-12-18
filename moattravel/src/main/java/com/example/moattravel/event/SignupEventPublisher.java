package com.example.moattravel.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.example.moattravel.entity.User;

@Component

public class SignupEventPublisher {
	private final ApplicationEventPublisher applicationEventPublisher;
	public SignupEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher=applicationEventPublisher;
	}
	public void publisheSignupEvent(User user, String requestUrl) {
		System.out.println("SignupEvent 発行: ユーザー=" + user.getEmail() + ", リクエストURL=" + requestUrl);
		applicationEventPublisher.publishEvent(new SignupEvent(this, user, requestUrl));
	}

}
