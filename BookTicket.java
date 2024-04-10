package Java_project;
class Manage{
	int total_s=10;
	 synchronized public void book(int seats) {
		if(total_s>=seats) {
			System.out.println("Your seats are booked succefully:");
			total_s=total_s-seats;
			System.out.println("Remaing seats:"+total_s);
		}
		else {
			System.out.println("Your seats are not booked:");
			System.out.println("Remaing seats:"+total_s);
		}
	}
}


public class BookTicket extends Thread {
	static Manage v;
	int seats;
	public void run() {
		v.book(seats);
	}
	public static void main(String[] args) {
		v=new Manage();
		BookTicket s=new BookTicket();
		s.seats=7;
		s.start();
		
		BookTicket s1=new BookTicket();
		s1.seats=6;
		s1.start();
	}

}

