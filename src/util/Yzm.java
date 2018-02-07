package util;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

public class Yzm{
	//验证码
	private StringBuffer code;
	// 从中得到验证码
	private final String SOURCE_CODE= "023456789abcdefghijkmnpqrstuvwxyzABCDEFGHJKLMNUVWXYZSTRPQ";
	private String [] font= {"黑体","宋体","楷体"};
	private int [] style= {Font.BOLD,Font.PLAIN,Font.ITALIC,Font.BOLD+Font.ITALIC};
	Random rand =new Random();
	/**
	 * 得到图片的流BufferedImage对象
	 */
	public  BufferedImage getImg() throws FileNotFoundException, IOException {
		BufferedImage image=new BufferedImage(100, 40, BufferedImage.TYPE_INT_RGB);
		code=new StringBuffer();
		Graphics2D bg=(Graphics2D) image.getGraphics();
		bg.setColor(Color.WHITE);
		bg.fillRect(0, 0, 100, 40);
		for(int index=0;index<4;index++) {
			String get_code=randomCode()+"";
			code.append(get_code);
			bg.setColor(randomColor());
			bg.setFont(randomFont());
			bg.drawString(get_code, 2+index*22,36-rand.nextInt(3));
		}
		for(int index=0;index<4;index++) {
			bg.setColor(randomColor());
			bg.setStroke(new BasicStroke(2));//设置笔画粗细
			bg.drawLine(rand.nextInt(100),rand.nextInt(40) , rand.nextInt(100), rand.nextInt(40));
		}
		return image;
	}
	//得到随机字符
	private char randomCode() {
		return SOURCE_CODE.charAt(rand.nextInt(SOURCE_CODE.length()));
	}
	//得到随机字体
	private Font randomFont() {
		return new Font(font[rand.nextInt(3)],style[rand.nextInt(4)] ,38);
	}
	//得到随机颜色
	private Color randomColor() {
		int red=rand.nextInt(150);
		int green=rand.nextInt(150);
		int blue=rand.nextInt(150);
		return new Color(red,green,blue);
		
	}
	/**
	 * 得到验证码字符串
	 */
	public String getCode() {
		return code.toString();
	}
}
