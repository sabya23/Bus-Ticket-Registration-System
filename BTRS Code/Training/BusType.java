package Training;

import java.io.Serializable;

public class BusType implements Serializable{
	
	
	
	
	
	
	private  String bustype,busfrom,busto,busdepart;
	private int bustotalseat,busfare;
	private int busid;
	public BusType( String bustype, String busfrom,
			String busto, String busdepart, int bustotalseat, int busfare,
			int busid) {
		super();
		this.busdepart=busdepart;
		this.bustype = bustype;
		this.busfrom = busfrom;
		this.busto = busto;
		this.bustotalseat = bustotalseat;
		this.busfare = busfare;
		this.busid = busid;
	}
	public String getBusdepart() {
		return busdepart;
	}
	public String getBustype() {
		return bustype;
	}
	public String getBusfrom() {
		return busfrom;
	}
	public String getBusto() {
		return busto;
	}
	
	public int getBustotalseat() {
		return bustotalseat;
	}
	public int getBusfare() {
		return busfare;
	}
	public int getBusid() {
		return busid;
	}
	public void setBustype(String bustype) {
		this.bustype = bustype;
	}
	public void setBusfrom(String busfrom) {
		this.busfrom = busfrom;
	}
	public void setBusto(String busto) {
		this.busto = busto;
	}
	public void setBusdepart(String busdepart) {
		this.busdepart = busdepart;
	}
	public void setBustotalseat(int bustotalseat) {
		this.bustotalseat = bustotalseat;
	}
	public void setBusfare(int busfare) {
		this.busfare = busfare;
	}
	public void setBusid(int busid) {
		this.busid = busid;
	}
	
	
	
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	


