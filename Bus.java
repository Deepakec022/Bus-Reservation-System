package busreserv;

public class Bus {
	private int BusNo;
	 private boolean Ac;
	 private int seats;// get and set//
	 
  Bus(int no,boolean ac,int seats){  // using constructor// 
	  this.BusNo =no;
	  this.Ac= ac;
	  this.seats= seats;
	  
	  
  }
  public int getBusNo() {// accesor method
	  return BusNo;
  }
  public boolean getAc() {// accesor method
	  return Ac;
  }
  public int getseats() {// accesor method
	  return seats;
  }
  public void setAc(boolean val) {// mutator 
	  Ac = val;
  }
  public void setseats(int seats) {// mutator 
	  seats = seats;
  }
  public void displayBusinfo() {
	  System.out.println("Bus No:" + BusNo+ " Ac:" + Ac + " Total seats:"+ seats);
	  
  }
}
