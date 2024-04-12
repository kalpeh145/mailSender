package com.email.email_sender.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class mailStructure {
    private String subject;
    private String message;
}
