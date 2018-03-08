package util;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.junit.jupiter.api.Test;

class TestCase {

	
	void test() throws FileNotFoundException, IOException {
		Yzm y=new Yzm();
		ImageIO.write(y.getImg(), "JPEG", new FileOutputStream("E:/yzm.jpg"));
		System.out.println(y.getCode());
	}

	public void test2() {
		String name="lee_dage@163.com";
		System.out.println(name.substring(name.indexOf("@")+1));
		System.out.println(name.substring(0,name.indexOf("@")));
	}
	
	public void test3() {
		File f=new File("E:/yzm.jpg") ;
		System.out.println(f.getName());
	}
	@Test
	public void test4(){
		SendMail send=new SendMail("lee_dage@163.com","1997126iloveyou");
		try {
			send.addFile("E:/yzm.jpg");
			send.sendMail("172@qq.com", "测试", "it is working");
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 

}
