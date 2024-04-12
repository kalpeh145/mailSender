package com.email.email_sender.Controller;

import com.email.email_sender.model.mailStructure;
import com.email.email_sender.service.mailservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mail")
public class mailController {
    @Autowired
    mailservice mailservice;
    @PostMapping("/send/{mail}")
     public String sendmail(@PathVariable String mail, @RequestBody mailStructure mailStructure){
        mailservice.sendmail(mail,mailStructure);
        return "mail has been sent...";

     }
}
