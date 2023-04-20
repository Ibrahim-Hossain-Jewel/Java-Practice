package com.lcwd.sendMailing;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *Mail_Sending com.sun.mail
 */
public class MailService 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello gallery" );
        String message = "Dosto Kamon asis? My first mail server implementation using java code.";
        String subject = "First mail sending.";
        String from = "ibrahimhossain495@gmail.com";
        String to = "raihancse20@gmail.com";
        sendMail(message, subject, from, to);
    }
    public static void sendMail(String message, String subject, String from, String to) {
    	System.out.println("Your message " + message + "\n your subject : " + subject + "\n From "+ from + "to" + to);
    	String host = "smtp.gmail.com";
    	Properties properties = System.getProperties(); //System.getProperties(String key, String value);
    	System.out.println("Properties value : " + properties);
    	properties.put("mail.smtp.host", host); 
    	//where key is the name of system property.
    	properties.put("mail.smtp.port", "465");
    	properties.put("mail.smtp.ssl.enable", "true"); 
    	//mail.smtp.ssl.enable -> Security Socket Layer.
    	properties.put("mail.smtp.auth", "true");  //smtp authentication.
    	//step 1. get the session object. where from you want to send. 
    	//set your current mail server using Session.getInstance method mail server information
    	Session session = Session.getInstance(properties, new Authenticator() {
    		//Get password authentication
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("ibrahimhossain495@gmail.com", "ftahcegwxmepbzaz"); 
				//password authentication if you provide wrong authentication credential session does not make.
			}
    		
    	});
    	// step 2. Compose the message message can be text or Multi media. to mime => Multi purpose Internet Mail Extensions.
    	session.setDebug(true); //to show what's going on into the session object.
    	MimeMessage mimeMessage = new MimeMessage(session); // Multi purpose Internet Mail Extensions Message.
    	try {
    		//set where from to the Mime instance
    		mimeMessage.setFrom(from); 
    		//adding recipient to message.
    		mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(to)); 
    		//set subject to the mime object.
    		mimeMessage.setSubject(subject); //mimeMessage
    		//set Message by the help of setText() method.
    		mimeMessage.setText(message);
    	//Step 3. send the message using transport class.
    		Transport.send(mimeMessage); 
    		System.out.println("Send Successful.");
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    }
}
