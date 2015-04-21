package com.kjdc.web.action.base;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Map;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**  
 * @类功能说明：  用于生成验证码的工具类.
 * @类修改者：  
 * @修改日期： 
 * @修改说明：  
 * @公司名称：****信息科技有限公司  
 * @作者：lrx  
 * @创建时间：2015-4-17 下午10:46:17  
 * @版本：V1.0  
 */
@Controller
@Scope("prototype")
public class RandomCodeAction extends ActionSupport
{
	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = -2147886104852771109L;
	/**
	 * logger.
	 */
	private static final Log log = LogFactory.getLog(RandomCodeAction.class);
	/**
	 * inputStream.
	 */
	private ByteArrayInputStream inputStream;

	/**
	 * @return success.
	 */
	@SuppressWarnings("unchecked")
	public final String execute()
	{
		try
		{
			ActionContext context = ActionContext.getContext();
			Map session = context.getSession();
			log.info("=== previous randomCode value: "
					+ session.get("randomCode"));
			session.remove("randomCode");
			// 在内存中创建图象.
			int width = 65, height = 22;
			BufferedImage image = new BufferedImage(width, height,
					BufferedImage.TYPE_INT_RGB);

			// 获取图形上下文.
			Graphics graphic = image.getGraphics();

			// 生成随机类.
			Random random = new Random();

			// 设定背景色.
			graphic.setColor(getRandColor(200, 250));
			graphic.fillRect(0, 0, width, height);

			// 设定字体.
			graphic.setFont(new Font("Times New Roman", Font.PLAIN, 18));

			// 随机产生155条干扰线，使图象中的认证码不易被其它程序探测到.
			graphic.setColor(getRandColor(160, 200));
			for (int i = 0; i < 155; i++)
			{
				int x = random.nextInt(width);
				int y = random.nextInt(height);
				int xl = random.nextInt(12);
				int yl = random.nextInt(12);
				graphic.drawLine(x, y, x + xl, y + yl);
			}

			// 取随机产生的认证码(4位数字).
			String sRand = "";
			for (int i = 0; i < 4; i++)
			{
				String rand = String.valueOf(random.nextInt(10));
				sRand += rand;

				// 将认证码显示到图象中.
				graphic.setColor(new Color(20 + random.nextInt(110),
						20 + random.nextInt(110), 20 + random.nextInt(110)));

				// 调用函数出来的颜色相同，可能是因为种子太接近，所以只能直接生成.
				graphic.drawString(rand, 13 * i + 6, 16);
			}

			// 将验证码存入SESSION.
			session.put("randomCode", sRand);

			// 图象生效.
			graphic.dispose();
			ByteArrayOutputStream output = new ByteArrayOutputStream();
			ImageOutputStream imageOut = ImageIO
					.createImageOutputStream(output);
			ImageIO.write(image, "JPEG", imageOut);
			imageOut.close();
			ByteArrayInputStream input = new ByteArrayInputStream(output
					.toByteArray());
			this.setInputStream(input);
			log.info("=== randomCode image create success ===");
		} catch (Exception e)
		{
			log
					.info("*** randomCode image create error, please refresh page ***");
			this.addActionError(new String(
					"\u9a8c\u8bc1\u7801\u751f\u6210\u9519"
							+ "\u8bef\uff0c\u8bf7\u5237\u65b0"
							+ "\u672c\u9875\u9762\uff01"));
			return ERROR;
		}
		return SUCCESS;
	}

	/**
	 * @param acmFc
	 *            fc.
	 * @param acmBc
	 *            bc.
	 * @return Color randColor. 给定范围获得随机颜色.
	 */
	private Color getRandColor(final int acmFc, final int acmBc)
	{
		int fc = acmFc;
		int bc = acmBc;
		Random random = new Random();
		if (fc > 255)
		{
			fc = 255;
		}
		if (bc > 255)
		{
			bc = 255;
		}
		int red = fc + random.nextInt(bc - fc);
		int green = fc + random.nextInt(bc - fc);
		int blue = fc + random.nextInt(bc - fc);
		return new Color(red, green, blue);
	}

	/**
	 * @param inputStreams
	 *            is .
	 */
	public final void setInputStream(final ByteArrayInputStream inputStreams)
	{
		this.inputStream = inputStreams;
	}

	/**
	 * @return ByteArrayInputStream.
	 */
	public final ByteArrayInputStream getInputStream()
	{
		return inputStream;
	}
}
