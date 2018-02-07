package util;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;



public class SendMail {
	private String name;
	private String password;
	private Session session;
	private MimeMessage message;
	private MimeMultipart all_part;
	/**
	 * 创建发送邮件
	 * @param name 邮箱
	 * @param password 密码
	 */
	public SendMail(String name,String password) {
		this.name=name;
		this.password=password;
		Properties prop=new Properties();
		prop.setProperty("mail.host", "smtp."+name.substring(name.indexOf("@")+1));
		prop.setProperty("mail.smtp.auth", "true");
		Authenticator au=new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(name.substring(0,name.indexOf("@")), password);
			}
		};
		session =Session.getInstance(prop,au);
		message =new MimeMessage(session);
		all_part=new MimeMultipart();
	}
	/**
	 *	发送邮件
	 * @param toAddr 对方邮箱地址
	 * @param subject 主题
	 * @throws MessagingException 
	 * @throws AddressException 
	 */
	public void  sendMail(String toAddr,String subject,String your_message) throws AddressException, MessagingException {
		message.setFrom(new InternetAddress(name));
		message.setRecipients(RecipientType.TO, toAddr);
		message.setSubject(subject);
		MimeBodyPart main_part=new MimeBodyPart();
		main_part.setContent(your_message, "text/html;charset=utf-8");
		all_part.addBodyPart(main_part);
		message.setContent(all_part);
		Transport.send(message);
		
	}
	/**
	 * 添加附件
	 * @param uri 附件的路径
	 * @throws MessagingException 
	 * @throws IOException 
	 */
	public void addFile(String uri){
		MimeBodyPart file_part=new MimeBodyPart();
		try {
			File file=new File(uri);
			file_part.attachFile(file);
			file_part.setFileName(MimeUtility.encodeText(file.getName()));
			all_part.addBodyPart(file_part);
		} catch (Exception e) {
			throw new RuntimeException(e);
		} 
	}
}
