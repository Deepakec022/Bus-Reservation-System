package busreserv;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking {
	String passangerName;
	 int busNo;
	  Date date;
  
	  Booking(){
		  Scanner sc =new Scanner (System.in);
		  System.out.println("Enter name of passanger: ");
		  passangerName = sc.next();
		  System.out.println("Enter bus no: ");
		  busNo = sc.nextInt();
		  System.out.println("Enter date dd-mm-yyy");
		  String dateInput = sc.next();
		  SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyy");
		  try {
			  date = dateFormat.parse(dateInput);
		  }
			  catch(ParseException e) {// exception handling
				  e.printStackTrace();
			  }
				   }
	  public boolean isAvailable(ArrayList<Booking>bookings,ArrayList<Bus>buses) {
		  int seats =0;
		  for(Bus bus:buses) {
			  if(bus.getBusNo()==busNo)
				  seats = bus.getseats();
		  }
		  int booked=0;
		  for(Booking b:bookings) {
			  if(b.busNo==busNo && b.date.equals(date)) {
				  booked++;
			  }
		  }
		   return booked<seats?true:false;
		  }
	  }


	 


