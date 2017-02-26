



package Training;

import java.io.Serializable;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ticket implements Serializable{

	private int ticketno;String from,to,bustype,date ;
    private int fare,seatreq,busid;
	
	

	public int getTicketno() {
		return ticketno;
	}

	public String getFrom() {
		return from;
	}

	public String getTo() {
		return to;
	}

	public String getBustype() {
		return bustype;
	}

	
	public String getDate() {
		return date;
	}

	public void setTicketno(int ticketno) {
		this.ticketno = ticketno;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public void setBustype(String bustype) {
		this.bustype = bustype;
	}

	

	

	public int getBusid() {
		return busid;
	}

	public void setBusid(int busid) {
		this.busid = busid;
	}

	public Ticket(int ticketno, String from, String to, String bustype,
			String date, int fare, int seatreq, int busid) {
		super();
		this.ticketno = ticketno;
		this.from = from;
		this.to = to;
		this.bustype = bustype;
		this.date = date;
		this.fare = fare;
		this.seatreq = seatreq;
		this.busid = busid;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}

	public void setSeatreq(int seatreq) {
		this.seatreq = seatreq;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getSeatreq() {
		return seatreq;
	}



	
	
}
