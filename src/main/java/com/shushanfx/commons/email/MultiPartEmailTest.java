package com.shushanfx.commons.email;

import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created with IntelliJ IDEA.
 * User: dengjianxin
 * Date: 14-9-3
 * Time: ÏÂÎç6:13
 * To change this template use File | Settings | File Templates.
 */
public class MultiPartEmailTest {
    public static void main(String[] args) throws EmailException, MalformedURLException {
        // Create the attachment
        EmailAttachment attachment = new EmailAttachment();
        attachment.setPath("images/test.jpg");
        attachment.setDisposition(EmailAttachment.ATTACHMENT);
        attachment.setDescription("Picture of John");
        attachment.setName("John.jpg");

        EmailAttachment attachment3 = new EmailAttachment();
        attachment3.setURL(new URL("http://www.apache.org/images/asf_logo_wide.gif"));
        attachment3.setDisposition(EmailAttachment.ATTACHMENT);
        attachment3.setDescription("Apache logo");
        attachment3.setName("Apache logo.gif");

        // Create the email message
        MultiPartEmail email = (MultiPartEmail) EmailFactory.getEmail(EmailFactory.MULTI_PART_EMAIL);
        email.addTo("dengjianxin@sogou-inc.com", "Dengjianxin1314");
        email.setFrom("dengjianxin1990s@163.com", "Me");
        email.setSubject("The picture");
        email.setMsg("Here is the picture you wanted");

        // add the attachment
        email.attach(attachment);
        email.attach(attachment3);

        // send the email
        email.send();
    }
}
