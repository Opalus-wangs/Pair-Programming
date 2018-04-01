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
		//��������ͳ��ͼ
		private Random ran;
		public picture(ArrayList<Actor> actors)
		{
			super();
			ran = new Random();
			setName("��������ͼ");
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
			int leftMargin = 2;//����ͼ��߽�
			int topMargin = 5;//����ͼ�ϱ߽�
			Graphics2D g2 = (Graphics2D) g;
			int ruler = Height-topMargin-5;
			int rulerStep = ruler/10;//����ǰ�ĸ߶�����Ϊ10����λ
			g2.setColor(Color.WHITE);//���ư�ɫ����
			g2.fillRect(0, 0, Width, Height);//���ƾ���ͼ
			g2.setColor(Color.LIGHT_GRAY);
			for(int i=0;i<=10;i++){//���ƻ�ɫ���ߺͰٷֱ�
				g2.drawString((100-10*i)+"%", 5, topMargin+rulerStep*i);//д�°ٷֱ�
				g2.drawLine(5, topMargin+rulerStep*i, Width, topMargin+rulerStep*i);//���ƻ�ɫ����
			}
			g2.setColor(Color.RED);

			for(int i=1;i<j;i++){//��������ͼ
				int value = a[i];
				int step = (i+1)*20;//����ÿ������ͼ��ˮƽ���Ϊ40
				//���ƾ���
				g2.fillRoundRect(leftMargin+step*2, Height-value, 10, value, 10, 10);
				//�г���Ʒ�ı��
				g2.drawString("C"+(i), leftMargin+step*2, Height-value);
			}
		}
		
			
		}
	



