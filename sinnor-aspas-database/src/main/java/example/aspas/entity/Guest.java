package example.aspas.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;
@Entity

public class Guest {
	@Id
	@Column
	private int guest_id;
	// defining id as column ID
	@Column
	private String guest_name;
	// defining id as column ID
	@Column
	private int mobileNo;
	// defining id as column ID
	public int getGuest_id() {
		return guest_id;
	}
	public void setGuest_id(int guest_id) {
		this.guest_id = guest_id;
	}
	public String getGuest_name() {
		return guest_name;
	}
	public void setGuest_name(String guest_name) {
		this.guest_name = guest_name;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "Guest [guest_id=" + guest_id + ", guest_name=" + guest_name + ", mobileNo=" + mobileNo + "]";
	}
	public Guest(int guest_id, String guest_name, int mobileNo) {
		super();
		this.guest_id = guest_id;
		this.guest_name = guest_name;
		this.mobileNo = mobileNo;
	}
	public Guest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
