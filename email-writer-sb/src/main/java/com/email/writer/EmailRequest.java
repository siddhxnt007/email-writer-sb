package com.email.writer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmailRequest {

    private String tone;
    private String emailContent;

    public static char[] getEmailContent() {
        return new char[0];
    }

    public CharSequence getTone() {
        return null;
    }
}
