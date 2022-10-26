package com.vivek.springbootemailsender.service;

import com.vivek.springbootemailsender.entity.EmailDetails;

public interface EmailService {

	String sendSimpleMail(EmailDetails details);

	String sendMailWithAttachment(EmailDetails details);

}
