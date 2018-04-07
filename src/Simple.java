import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Area;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.text.Caret;

import other.FormatException1;

public class Simple extends JFrame
{ 
	int [] k1 =new int [20];
	Calculate calculate =new Calculate();
	int count=0;
	int w=0;
	private static final int DEFAULT_WIDTH = 500;
	private static final int DEFAULT_HEIGHT = 400;

	
	int [] kk =new int[20];
	private JButton btn = new JButton("确定提交");
	int i=0;
	
	
	Readtext read =new Readtext();
	final JPanel pan = new JPanel();
	JLabel[] judge = new JLabel[10];
	 String[] READ=new String[20];
	  final JTextField Time = new JTextField(10);

	  JTextField name1 = new JTextField(10);
	  JTextField name2 = new JTextField(10);
	  
	  JTextField name3 = new JTextField(10);
	  JTextField name4 = new JTextField(10);
	  
	  JTextField name5 = new JTextField(10);
	  JTextField name6 = new JTextField(10);
	  JTextField name7 = new JTextField(10);
	  JTextField name8 = new JTextField(10);
	  JTextField name9= new JTextField(10);
	  JTextField name10 = new JTextField(10);
	  
	  JTextField name111 = new JTextField(10);
	  JTextField name12 = new JTextField(10);
	  
	  JTextField name13 = new JTextField(10);
	  JTextField name14 = new JTextField(10);
	  
	  JTextField name15 = new JTextField(10);
	  JTextField name16 = new JTextField(10);
	  JTextField name17 = new JTextField(10);
	  JTextField name18 = new JTextField(10);
	  JTextField name19= new JTextField(10);
	  JTextField name20 = new JTextField(10);
	  
	  JTextField na1 = new JTextField(5);
	  JTextField na2 = new JTextField(5);
	  
	  JTextField na3 = new JTextField(5);
	  JTextField na4 = new JTextField(5);
	  
	  JTextField na5 = new JTextField(5);
	  JTextField na6 = new JTextField(5);
	  
	  JTextField na7 = new JTextField(5);
	  JTextField na8 = new JTextField(5);
	  
	  JTextField na9= new JTextField(5);
	  JTextField na10 = new JTextField(5);
	  
	  JTextField na111 = new JTextField(5);
	  JTextField na12 = new JTextField(5);
	  
	  JTextField na13 = new JTextField(5);
	  JTextField na14 = new JTextField(5);
	  
	  JTextField na15 = new JTextField(5);
	  JTextField na16 = new JTextField(5);
	  
	  JTextField na17 = new JTextField(5);
	  JTextField na18 = new JTextField(5);
	  
	  JTextField na19= new JTextField(5);
	  JTextField na20 = new JTextField(5);

	
	  
	public Simple(final JFrame win,final JPanel pan,final String name11,final String number11,final ArrayList<Student> students) throws IOException
	{ 
		JLabel stuname = new JLabel("学生:  "+name11+"  ");
		JLabel stunumber = new JLabel("编号:  "+number11+"  ");
		JLabel space = new JLabel("                                                                                         ");
	  
	  JLabel lab1 = new JLabel("01");
	  JLabel lab2 = new JLabel("02");
	  JLabel lab3 = new JLabel("03");
	  JLabel lab4 = new JLabel("04");
	  JLabel lab5 = new JLabel("05");
	  JLabel lab6 = new JLabel("06");
	  JLabel lab7 = new JLabel("07");
	  JLabel lab8 = new JLabel("08");
	  JLabel lab9 = new JLabel("09");
	  JLabel lab10 = new JLabel("10");
	  JLabel lab11 = new JLabel("11");
	  JLabel lab12 = new JLabel("12");
	  JLabel lab13 = new JLabel("13");
	  JLabel lab14 = new JLabel("14");
	  JLabel lab15 = new JLabel("15");
	  JLabel lab16 = new JLabel("16");
	  JLabel lab17 = new JLabel("17");
	  JLabel lab18 = new JLabel("18");
	  JLabel lab19 = new JLabel("19");
	  JLabel lab20 = new JLabel("20");
	  JLabel lab21 = new JLabel("Time"); 
	  pan.add(stuname);
	  pan.add(stunumber);
	  pan.add(space);
	  pan.add(name1);
	  pan.add(na1);
	  pan.add(lab1);
	  
	  pan.add(name2);
	  pan.add(na2);
	  pan.add(lab2);
	  
	  pan.add(name3);
	  pan.add(na3);
	  pan.add(lab3);
	  
	  pan.add(name4);
	  pan.add(na4);
	  pan.add(lab4);
	  
	  pan.add(name5);
	  pan.add(na5);
	  pan.add(lab5);
	  
	  pan.add(name6);
	  pan.add(na6);
	  pan.add(lab6);
	  
	  pan.add(name7);
	  pan.add(na7);
	  pan.add(lab7);
	  
	  pan.add(name8);
	  pan.add(na8);
	  pan.add(lab8);
	  
	  pan.add(name9);
	  pan.add(na9);
	  pan.add(lab9);
	  
	  pan.add(name10);
	  pan.add(na10);
	  pan.add(lab10);
	  
	  pan.add(name111);
	  pan.add(na111);
	  pan.add(lab11);
	  
	  pan.add(name12);
	  pan.add(na12);
	  pan.add(lab12);
	  
	  pan.add(name13);
	  pan.add(na13);
	  pan.add(lab13);
	  
	  pan.add(name14);
	  pan.add(na14);
	  pan.add(lab14);
	  
	  pan.add(name15);
	  pan.add(na15);
	  pan.add(lab15);
	  
	  pan.add(name16);
	  pan.add(na16);
	  pan.add(lab16);
	  
	  pan.add(name17);
	  pan.add(na17);
	  pan.add(lab17);
	  
	  pan.add(name18);
	  pan.add(na18);
	  pan.add(lab18);
	  
	  pan.add(name19);
	  pan.add(na19);
	  pan.add(lab19);
	  
	  pan.add(name20);
	  pan.add(na20);
	  pan.add(lab20);
	  
	  
	  win.add(pan);
	  
	  
	  JButton button1 = new JButton("开始计时");
	  Dimension preferredSize = new Dimension(100,30);//设置尺寸
	  button1.setPreferredSize(preferredSize );
	  pan.add(button1);
	  pan.setBounds(0,0, 400, 300);
	  pan.setVisible(true); 
	  
	  btn.setPreferredSize(preferredSize );
	  pan.setBounds(0,0, 800, 300);
	  pan.add(btn);
	  pan.add(lab21);
	  pan.add(Time);
	  
	
	  	File file = new File("F:\\小学生四则运算\\小学生四则运算\\result.txt");//Text文件
		BufferedReader br = new BufferedReader(new FileReader(file));//构造一个BufferedReader类来读取文件
		String s = null;
		while((s = br.readLine())!=null)
		{
			READ[i]=s;
			i++;
		
		}
		br.close();;
		String s1 =READ[1].toString();
		name1.setText(s1);
		 try {
			 	
				name1.setText(READ[0].toString()+"=");
				name2.setText(READ[1].toString()+"=");
				name3.setText(READ[2].toString()+"=");
				name4.setText(READ[3].toString()+"=");
				name5.setText(READ[4].toString()+"=");
				name6.setText(READ[5].toString()+"=");
				name7.setText(READ[6].toString()+"=");
				name8.setText(READ[7].toString()+"=");
				name9.setText(READ[8].toString()+"=");
				name10.setText(READ[9].toString()+"=");
				
				name111.setText(READ[10].toString()+"=");
				name12.setText(READ[11].toString()+"=");
				name13.setText(READ[12].toString()+"=");
				name14.setText(READ[13].toString()+"=");
				name15.setText(READ[14].toString()+"=");
				name16.setText(READ[15].toString()+"=");
				name17.setText(READ[16].toString()+"=");
				name18.setText(READ[17].toString()+"=");
				name19.setText(READ[18].toString()+"=");
				name20.setText(READ[19].toString()+"=");
				
		 
		 
		 } catch(NullPointerException e) {
	           System.out.println("读入文件有错！");
	           
	        }
	
		 button1.addActionListener(new ActionListener()
		    {
	        public void actionPerformed(ActionEvent event)
	        {
	        	
	        	final time time=new time();
	        	new Thread(new Runnable(){
			 	    @Override
			 	    public void run() {
			 	        try {
			 	            for(int i=0;i<1000;i++) {
			 	                Time.setText(String.format(time.a, i));
			 	                Thread.sleep(1000);    
			 	            }
			 	        } catch (InterruptedException e) {
			 	            e.printStackTrace();
			 	        }
			 	    }
			 	}).start();
	        	//记录开始测试的时间
	        }
	     });
		    
		
		
	  btn.addActionListener(new ActionListener()
	    {
		  String [] S =new String[20];

		public void actionPerformed(ActionEvent event)
        {
        	try
			  {
        			
        		
				    S[0] = na1.getText();
				    S[1] = na2.getText();
				    S[2] = na3.getText();
				    S[3] = na4.getText();
				    S[4] = na5.getText();
				    S[5] = na6.getText();
				    S[6] = na7.getText();
				    S[7] = na8.getText();
				    S[8] = na9.getText();
				    S[9]= na10.getText();
				    S[10] =na111.getText();
				    S[11] =na12.getText();
				    S[12]= na13.getText();
				    S[13] = na14.getText();
				    S[14] = na15.getText();
				    S[15] = na16.getText();
				    S[16] = na17.getText();
				    S[17] = na18.getText();
				    S[18] = na19.getText();
				    S[19] = na20.getText();
				    	
					if(S[0].equals("")||S[1].equals("")||S[2].equals("")||S[3].equals("")||S[4].equals("")||S[5].equals("")||S[6].equals("")||S[7].equals("")||S[8].equals("")||S[9].equals("")
						||S[10].equals("")||S[11].equals("")||S[12].equals("")||S[13].equals("")||S[14].equals("")||S[15].equals("")||S[16].equals("")||S[17].equals("")||S[18].equals("")||S[19].equals("")	
							
							)
					{
						throw new FormatException1();
						
					}
			  }
			  catch(FormatException1 a)
			  {
				 JOptionPane.showMessageDialog(null,"请输入计算结果");
			  }
         
            
        	 
        	 for(int k=0;k<20;k++)
        	 {
        		k1[k]=calculate.arithmetic(READ[k]);
        		
        	 }
        	 
        		win.setVisible(false);
        		
        		for(int t=0;t<20;t++)
        		{
        			if(k1[t]!=Integer.parseInt(S[t]))
        			{      				
        				kk[count]=t;
        				
						count ++;
        			}
        			
        			
        		}
        		
        	Student ug = new Student(name11,number11,kk, count);
        	students.add(ug);
            
        	final JFrame win = new JFrame("小学生四则运算");
           	final JPanel pan = new JPanel();
           	new SeeFrame(win,pan,name11,number11,kk,count,students);
           	win.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
           	win.setVisible(true);
           	win.setLocationRelativeTo(null);
           }
        
     });
	
  }

	
}
