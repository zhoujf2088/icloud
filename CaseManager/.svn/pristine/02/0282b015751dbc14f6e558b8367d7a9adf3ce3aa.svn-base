package com.cloud.cases;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cloud.cases.util.Constant;

public class VerifyCodeServlet extends HttpServlet{

	private static final long serialVersionUID = -2355789268658597463L;
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,IllegalStateException{
	   ByteArrayInputStream baIs = getImage(request.getSession());
	   byte[] bytes = new byte[1024];
	   int len = 0;
	   while ((len = baIs.read(bytes)) != -1) {
	       response.getOutputStream().write(bytes, 0, len);
	   }
	   baIs.close();
	   response.setContentType("image/jpeg");
	}
	
	public ByteArrayInputStream getImage(HttpSession session){
		int width = 80;
		int height = 22;
		
		//创建可访问图象数据缓冲区的image
		BufferedImage image=new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		//获取image的上下文
		Graphics graphics = image.getGraphics();
		//创建随机生成器
		Random random = new Random();
		
		//设置graphics的颜色
		graphics.setColor(getRandColor(200, 250));
		//填充区域
		graphics.fillRect(0, 0, width, height);
		// 设定字体
		graphics.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		//产生150条随机线
		graphics.setColor(getRandColor(150, 200));
		for(int i=0; i<150;i++){
			int x1 = random.nextInt(width);
			int y1 = random.nextInt(height);
			int x2 = random.nextInt(12);
			int y2 = random.nextInt(12);
			graphics.drawLine(x1, y1, x2, y2);
		}
		
		// 取随机产生的认证码(4位数字)
		StringBuffer srand=new StringBuffer();
		for(int i=0;i<4;i++){
			String rand=String.valueOf(random.nextInt(10));
			srand.append(rand);
			
			//将许可证码显示到图片中
			Color color=getRandColor(20, 100);
			graphics.setColor(color);
			graphics.drawString(rand, 13 * i + 6, 16);
		}
		
		//把验证码srand 存放到session中
		session.setAttribute(Constant.VERIFY_CODE,srand.toString());
		
		//释放图形上下文
		graphics.dispose();
		
        ByteArrayInputStream input = null;
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        try {
            ImageOutputStream imageOut = ImageIO.createImageOutputStream(output);
            ImageIO.write(image, "JPEG", imageOut);
            imageOut.close();
            input = new ByteArrayInputStream(output.toByteArray());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return input;/* 赋值图像 */
	}
	
	//给定范围，产生随机颜色
	public Color getRandColor(int fc,int bc){
		Random random = new Random();
		if(fc>255)
			fc=255;
		
		if(bc>255)
			bc=255;
		
		int r = fc+random.nextInt(bc-fc);
		int g = fc+random.nextInt(bc-fc);
		int b = fc+random.nextInt(bc-fc);
		
		return new Color(r,g,b);
	}
}
