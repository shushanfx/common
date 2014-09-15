package com.shushanfx.commons.email;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;

/**
 * Created with IntelliJ IDEA.
 * User: dengjianxin
 * Date: 14-9-3
 * Time: обнГ6:06
 * To change this template use File | Settings | File Templates.
 */
public class SimpleEmailTest {
    public static void main(String[] args) throws EmailException {
        Email email = EmailFactory.getEmail(EmailFactory.SIMPLE_EMAIL);
        email.setSubject("TestMail");
        email.setMsg("This is a test mail ... :-)");
        email.addTo("dengjianxin@sogou-inc.com");
        email.send();
    }
}
