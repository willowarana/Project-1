import java.sql.Date;
import java.util.concurrent.TimeUnit;

import javax.print.DocFlavor.STRING;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeOne
{
	public void dateTimeNow() 
	{
		//Date/time object for date/time
		DateTimeFormatter formattedDateTime = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss  a");
		LocalDateTime showDateTime = LocalDateTime.now();
		String formattedDateTimeFinal = showDateTime.format(formattedDateTime);
	    System.out.println("Current Date/Time: " + formattedDateTimeFinal);	    
	}
	
	public int getValueOfSecond() {
		LocalDateTime time = LocalDateTime.now();
		int seconds = time.getSecond();
		return seconds;
		
	}
	
	public void sleepForThreeSec() throws InterruptedException {
		TimeUnit.SECONDS.sleep(3);
	}
}