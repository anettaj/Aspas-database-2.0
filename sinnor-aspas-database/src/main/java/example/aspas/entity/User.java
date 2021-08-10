package example.aspas.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class User {
	@Id
	@Column
	private int user_id;
	// defining id as column ID
	@Column
	private int adharNo;
	// defining adharno as column name
	@Column
	private String address;
	// defining address as column name
	@Column
	private int lnNo;
	// defining lnno as column name
	@Column
	private int mobileNo;
	// defining mobileNo as column name
	@Column
	private String status;
	// defining status as column name
	
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(int adharNo) {
		this.adharNo = adharNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getLnNo() {
		return lnNo;
	}
	public void setLnNo(int lnNo) {
		this.lnNo = lnNo;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", adharNo=" + adharNo + ", address=" + address + ", lnNo=" + lnNo
				+ ", mobileNo=" + mobileNo + ", status=" + status + "]";
	}
	
	
	public User(int user_id, int adharNo, String address, int lnNo, int mobileNo, String status) {
		super();
		this.user_id = user_id;
		this.adharNo = adharNo;
		this.address = address;
		this.lnNo = lnNo;
		this.mobileNo = mobileNo;
		this.status = status;
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
