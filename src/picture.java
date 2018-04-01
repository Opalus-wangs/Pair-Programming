import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class picture extends JFormattedTextField{

		int [] a=new int[20];
		int j=0;
		//绘制柱形统计图
		private Random ran;
		public picture(ArrayList<Actor> actors)
		{
			super();
			ran = new Random();
			setName("绘制柱形图");
			setBounds(100,80,270,210);
			
			for(Actor e: actors )
			 {
				a[j]=e.getw();
				j++;
			 }
		}
		@Override
		public void paint(Graphics g){
			int Width = getWidth();
			int Height = getHeight();
			int leftMargin = 2;//柱形图左边界
			int topMargin = 5;//柱形图上边界
			Graphics2D g2 = (Graphics2D) g;
			int ruler = Height-topMargin-5;
			int rulerStep = ruler/10;//将当前的高度评分为10个单位
			g2.setColor(Color.WHITE);//绘制白色背景
			g2.fillRect(0, 0, Width, Height);//绘制矩形图
			g2.setColor(Color.LIGHT_GRAY);
			for(int i=0;i<=10;i++){//绘制灰色横线和百分比
				g2.drawString((100-10*i)+"%", 5, topMargin+rulerStep*i);//写下百分比
				g2.drawLine(5, topMargin+rulerStep*i, Width, topMargin+rulerStep*i);//绘制灰色横线
			}
			g2.setColor(Color.RED);

			for(int i=1;i<j;i++){//绘制柱形图
				int value = a[i];
				int step = (i+1)*20;//设置每隔柱形图的水平间隔为40
				//绘制矩形
				g2.fillRoundRect(leftMargin+step*2, Height-value, 10, value, 10, 10);
				//列出产品的编号
				g2.drawString("C"+(i), leftMargin+step*2, Height-value);
			}
		}
		
			
		}
	



