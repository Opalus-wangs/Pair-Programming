import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JTextArea;

//������״ͼ
public class Picture extends JFormattedTextField
{
		int [] a=new int[20];
		int j=0;
		int i=0;
		int x=0;
		int aa=0;
		//��������ͳ��ͼ
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
			setName("��������ͼ");
			setBounds(100,85,270,210);
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

			for(i=0;i<j;i++){//��������ͼ
				int value =(20-a[i])*10+5;
				int step = (i+1)*20;//����ÿ������ͼ��ˮƽ���Ϊ40
				//���ƾ���
			
				g2.fillRoundRect(leftMargin+step*2, Height-value, 20, value, 20, 20);
				//�г���Ʒ�ı��
				g2.drawString("C"+(i+1)+"-"+(20-a[i])*5+"%", leftMargin+step*2, Height-value-5);
			
			}
		}		
}
	



