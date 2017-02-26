package Training;
import java.io.Serializable;

public class Seat1 implements Serializable{
	private int busid,bkdseat;
	private String date;
	public Seat1(int busid, int bkdseat, String date) {
		super();
		this.busid = busid;
		this.bkdseat = bkdseat;
		this.date = date;
	}
	
	public int getBusid() {
		return busid;
	}
	public int getBkdseat() {
		return bkdseat;
	}
	public String getDate() {
		return date;
	}
	public void setBusid(int busid) {
		this.busid = busid;
	}
	public void setBkdseat(int bkdseat) {
		this.bkdseat = bkdseat;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	

}
