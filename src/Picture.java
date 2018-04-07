import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JTextArea;

//绘制柱状图
public class Picture extends JFormattedTextField
{
		int [] a=new int[20];
		int j=0;
		int i=0;
		int x=0;
		int aa=0;
		//绘制柱形统计图
		private Random ran;
		public Picture(ArrayList<Student> students)
		{	
			super();
			for(Student e: students )
			 {
					a[j]=(e.getw());
					j++;	
			 }
			ran = new Random();
			setName("绘制柱形图");
			setBounds(100,85,270,210);
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

			for(i=0;i<j;i++){//绘制柱形图
				int value =(20-a[i])*10+5;
				int step = (i+1)*20;//设置每隔柱形图的水平间隔为40
				//绘制矩形
			
				g2.fillRoundRect(leftMargin+step*2, Height-value, 20, value, 20, 20);
				//列出产品的编号
				g2.drawString("C"+(i+1)+"-"+(20-a[i])*5+"%", leftMargin+step*2, Height-value-5);
			
			}
		}		
}
	



