/**
 * 主窗口
 * @author penghui
 *
 */

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.*;

public class MainFrame extends JFrame
{
		
	public ArrayList<Student> students ;
	
   private static final int DEFAULT_WIDTH = 500;
   private static final int DEFAULT_HEIGHT = 400;
   private JButton fileMenu =  new JButton("简单");
   private JButton editMenu = new JButton("复杂");
   private JButton helpMenu = new JButton("得分情况");

   public MainFrame( final ArrayList<Student> students)
   {
	   this.students = students;
	  setLocationRelativeTo(null); 
      setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
       JMenuBar menuBar = new JMenuBar();
       setJMenuBar(menuBar);
 	    menuBar.add(fileMenu);
 	    fileMenu.addActionListener(new ActionListener()
 	    {
          public void actionPerformed(ActionEvent event)
          {
             if(event.getSource()==fileMenu)
             {
            	 setVisible(false);
            	 final JFrame win = new JFrame("学生信息");
            	 final JPanel pan = new JPanel();
            	 new NameFrame(win,pan,students);
             }
          }
       });
      	menuBar.add(editMenu);
      	editMenu.addActionListener(new ActionListener()
 	    {
          public void actionPerformed(ActionEvent event)
          {
        	  
             if(event.getSource()== editMenu)
             {
            	 setVisible(false);
            	 final JFrame win = new JFrame("小学生四则运算");
            	 final JPanel pan = new JPanel();
            	 new NameFrame2(win,pan,students);
            	 	
            	   /* JTextField name = new JTextField(10);
            		JTextField number = new JTextField(10);
            		JButton btn = new JButton("确定");
            		
            		final JPanel pan1 = new JPanel();
            		JLabel[] judge = new JLabel[10];
            		
        	 
            	final String name11 = new String(name.getText());
               	final String number11 = new String(number.getText());
          
               	final JFrame win1 = new JFrame("小学生四则运算");
             	final JPanel pan11 = new JPanel();
             	try {
					new fuzha(win,pan1,name11,number11,actors);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
             	win.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
             	win.setVisible(true);
             	win.setLocationRelativeTo(null);*/
             }
          }
       });
      
      	menuBar.add(helpMenu);
      	helpMenu.addActionListener(new ActionListener()
 	    {
          public void actionPerformed(ActionEvent event)
          {
             if(event.getSource()== helpMenu)
             {
            	 	 final int DEFAULT_WIDTH = 500;
            	 	 final int DEFAULT_HEIGHT = 400;
            		 JTextArea out1 = new JTextArea();
            		 JLabel pan1 = new JLabel();
            	     JButton btn = new JButton("继续");
            	     JButton sort = new JButton("排名");
            	  
        			 JLabel lab4 = new JLabel("学生"+"成绩为：");
        			 JLabel lab5 = new JLabel("编号");
        			 JLabel lab6 = new JLabel("姓名");
        			 JLabel lab7 = new JLabel("分数");
        			 lab5.setBounds(100,30,200,20);
        			 lab6.setBounds(200,30,200,20);
        			 lab7.setBounds(300,30,200,20);
            			 
             	 	 final JFrame win = new JFrame("小学生四则运算");
                 	 final JPanel pan = new JPanel();
                 
                 	 win.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
                 	 win.setVisible(true);
                 	 win.setLocationRelativeTo(null);
                 	 win.add(lab4,BorderLayout.BEFORE_FIRST_LINE);
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
                	win.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
                	win.setVisible(true);
                	win.setLocationRelativeTo(null); 	  
				}
		        }
		     });
   }
}