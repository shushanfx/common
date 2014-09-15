package com.shushanfx.commons.email;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created with IntelliJ IDEA.
 * User: dengjianxin
 * Date: 14-9-3
 * Time: ÏÂÎç8:04
 * To change this template use File | Settings | File Templates.
 */
public class HtmlEmailTest {
    public static void main(String[] args) throws EmailException, MalformedURLException {
        HtmlEmail email = (HtmlEmail) EmailFactory.getEmail(EmailFactory.HTML_EMAIL);

        email.addTo("dengjianxin@sogou-inc.com");
        email.setSubject("Test email with inline image");

        // embed the image and get the content id
        URL url = new URL("http://www.apache.org/images/asf_logo_wide.gif");
        String cid = email.embed(url, "Apache logo");

        // set the html message
        email.setHtmlMsg("<html>The apache logo - <img src=\"cid:"+cid+"\"></html>");

        // set the alternative message
        email.setTextMsg("Your email client does not support HTML messages");

        // send the email
        email.send();
    }
}
