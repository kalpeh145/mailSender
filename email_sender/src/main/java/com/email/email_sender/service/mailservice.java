package com.email.email_sender.service;

import com.email.email_sender.model.mailStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class mailservice {
    @Autowired
    private JavaMailSender javaMailSender;
    @Value("$(spring.mail.username)")
    private String fromMail;
    public void sendmail(String mail, mailStructure mailStructure){
        SimpleMailMessage message=new SimpleMailMessage();
        message.setFrom(fromMail);
        message.setSubject(mailStructure.getSubject());
        message.setText(mailStructure.getMessage());
        message.setTo(mail);
        javaMailSender.send(message);


    }

}
