package com.shushanfx.commons.email;

import org.apache.commons.mail.*;

/**
 * Created with IntelliJ IDEA.
 * User: dengjianxin
 * Date: 14-9-3
 * Time: ÏÂÎç7:36
 * To change this template use File | Settings | File Templates.
 */
public final class EmailFactory {
    public static final int SIMPLE_EMAIL= 0x1;
    public static final int MULTI_PART_EMAIL= 0x2;
    public static final int HTML_EMAIL = 0x3;
    public static final int IMAGE_HTML_EMAIL= 0x4;

    public static Email getEmail(int type) throws EmailException {
        Email email = null;
        switch (type){
            case MULTI_PART_EMAIL:
                email = new MultiPartEmail();
                break;
            case HTML_EMAIL:
                email = new HtmlEmail();
                break;
            case IMAGE_HTML_EMAIL:
                email = new ImageHtmlEmail();
                break;
            default:
                email = new SimpleEmail();
        }

        email.setHostName("smtp.163.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("dengjianxin1990s", "Daniel1991_02_22"));
        email.setSSLOnConnect(true);
        email.setFrom("dengjianxin1990s@163.com");

        return email;
    }
}
