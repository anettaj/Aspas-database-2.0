package example.aspas.entity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;
@Entity
public class Admin {

	@Column
	private int user_id;
	// defining id as column ID
	@Column
	private String status;
	// defining status as column name
	@Id
	@Column
	private int admin_id;
	// defining id as column ID
	@Column
	private String admin_passwd;
	// defining id as column ID
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	public String getAdmin_passwd() {
		return admin_passwd;
	}
	public void setAdmin_passwd(String admin_passwd) {
		this.admin_passwd = admin_passwd;
	}
	@Override
	public String toString() {
		return "Admin [user_id=" + user_id + ", status=" + status + ", admin_id=" + admin_id + ", admin_passwd="
				+ admin_passwd + "]";
	}
	public Admin(int user_id, String status, int admin_id, String admin_passwd) {
		super();
		this.user_id = user_id;
		this.status = status;
		this.admin_id = admin_id;
		this.admin_passwd = admin_passwd;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
