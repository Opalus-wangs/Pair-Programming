import java.util.*;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.GridLayout;
public class FRAME extends JFrame
{
		private JTextArea out1 = new JTextArea();
		private JLabel pan1 = new JLabel();
		public FRAME(final JFrame win,final JPanel pan,final ArrayList<Actor> actors)
		{
			 win.getContentPane().remove(pan);
			 setLayout(new GridLayout(3,1));
			 JLabel lab5 = new JLabel("±àºÅ");
			 JLabel lab6 = new JLabel("ÐÕÃû");
			 JLabel lab7 = new JLabel("·ÖÊý");
			
			 lab5.setBounds(100,30,200,20);
			 lab6.setBounds(200,30,200,20);
			 lab7.setBounds(300,30,200,20);
		
			/* Comparator<Actor> actors1 = new Comparator<Actor>()
					{
					
						public int compare(Actor c1, Actor c2)
						{
							if(c1.getscore()>= c2.getscore())
							{
								return -1;
							}
							else
							{
								return 1;
							}
						}
					};
		
					Collections.sort(actors,actors1);*/
					
					for(int i = 0; i< actors.size();i++)
					{
						out1.append(actors.get(i).getid()+"                          "+actors.get(i).getname()+"                          "+actors.get(i).getscore()+"\n");
						
					}
			 win.add(out1);
			 out1.setBounds(100,60,280,250);
			 win.add(lab5);
			 win.add(lab6);
			 win.add(lab7);
			 win.add(pan);
			 win.add(pan,BorderLayout.SOUTH);
			 win.add(pan1);
			 win.setVisible(true);
		}
	}


