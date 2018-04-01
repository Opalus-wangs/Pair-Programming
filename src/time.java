import java.util.Timer;
import java.util.TimerTask;

public  class time {
	
	
	public Timer timer=new Timer();
	public boolean is_pause=false;
	public timetask mytimetask=new timetask();
	public int hh,mm,ss;
	String a;
	
	
	public time(){
		
		timer.scheduleAtFixedRate(mytimetask, 0, 1000);
		
		//timer
	}
	public class timetask extends TimerTask{
		public int count_time=0;
		public String date;
		@Override
		public void run() {
			// TODO Auto-generated method stub
			if(!is_pause){
				count_time++;
				hh=count_time/3600;
				mm=(count_time%3600)/60;
				ss=count_time%60;
				//System.out.println(count_time);
				date=hh+":"+mm+":"+ss;
				
				a=date;
			
				
			}
		}
		
	}
	
	
}