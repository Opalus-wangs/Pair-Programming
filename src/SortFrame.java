/**
 * 排名窗口
 * @author penghui
 *
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.*;

public class SortFrame extends JFrame
{ 
	private Random ran;
	private static final int DEFAULT_WIDTH = 500;
	private static final int DEFAULT_HEIGHT = 400; 
	protected ArrayList<SortFrame> OUT ;
	private JTextArea out1 = new JTextArea();
	private JLabel pan1 = new JLabel();
	private JButton btn = new JButton("继续");
	private JButton sort = new JButton("排名");
	public SortFrame(final JFrame win,final JPanel pan,final String name11,final String number11,int[] kk,final int count,final ArrayList<Actor> actors)
	{
		
		
		int w=100-count*5;
	
		String ab="";
		win.getContentPane().remove(pan);
		setLayout(new GridLayout(3,1));
		for(int c=0;c<count;c++)
		{	
			ab=ab+kk[c]+".";
		}
		 JLabel lab4 = new JLabel("学生"+name11+"成绩为："+w);
		 if(ab!=null)
		 {
			 JLabel lab41 = new JLabel("错误的题号为："+ab);
			 lab41.setBounds(0,15,1500,20);
			 win.add(lab41);
		}
		 
		 JLabel lab5 = new JLabel("编号");
		 JLabel lab6 = new JLabel("姓名");
		 JLabel lab7 = new JLabel("分数");
		 
		 
		
		 
		 lab5.setBounds(100,30,200,20);
		 lab6.setBounds(200,30,200,20);
		 lab7.setBounds(300,30,200,20);
		 win.add(lab4,BorderLayout.BEFORE_FIRST_LINE);
		
		Actor ug = new Actor(name11,number11,kk, w);
	    actors.add(ug);
	    	
		 for(Actor e: actors )
		 {
			 out1.append(e.getid()+"                          "+ e.getname() +"                           " + w+"\n");
			 win.add(out1);
		 }
		 
		 picture pic =new picture(actors);

		 pic.setVisible(true);
		 win.add(pic);
		 
		 win.add(out1);
		 
		 
		 out1.setBounds(100,60,280,250);
		 
		 pan.add(btn);
		 pan.add(sort);
		 win.add(lab5);
		 win.add(lab6);
		 win.add(lab7);
		 win.add(pan);
		 win.add(pan,BorderLayout.SOUTH);
		 
		 win.add(pan1);
		 win.setVisible(true);
		
		 
		 
		 btn.addActionListener(new ActionListener()		 
		    {
		        public void actionPerformed(ActionEvent event)
		        {
		           if(event.getSource()==btn)
		           {
		        	 OUT= new ArrayList<SortFrame>();
		        	 win.setVisible(false);
		        	 JFrame win = new JFrame("选手信息");
	           	     JPanel pan = new JPanel();
		        	 new NameFrame(win,pan,actors);
		           	 win.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		           	 win.setVisible(true);
		           }
		        }
		     });
		 sort.addActionListener(new ActionListener()
		    {
		        public void actionPerformed(ActionEvent event)
		        {
		           if(event.getSource()==sort)
		           {
		        	   OUT= new ArrayList<SortFrame>();
		        	   JFrame win = new JFrame("选手排名");
		           	   JPanel pan = new JPanel();
			           new FRAME(win,pan,actors);
			           win.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
			           win.setVisible(true);
			           win.setLocationRelativeTo(null);
		           }
		        }
		     });
	}
}