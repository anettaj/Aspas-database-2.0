package example.aspas.entity;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Epass {
	@Id
	@Column
	private String status;
	// defining status as column name
	@Column
	// @JsonFormat(pattern="YYYY-MM-DD")
	private Date dateFrom;
	// defining dateFrom as column name
	@Column
	// @JsonFormat(pattern="YYYY-MM-DD")
	private Date date_To;
	// defining Date_To as column name
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getDateFrom() {
		return dateFrom;
	}
	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}
	public Date getDate_To() {
		return date_To;
	}
	public void setDate_To(Date date_To) {
		this.date_To = date_To;
	}
	@Override
	public String toString() {
		return "Epass [status=" + status + ", dateFrom=" + dateFrom + ", date_To=" + date_To + "]";
	}
	public Epass(String status, Date dateFrom, Date date_To) {
		super();
		this.status = status;
		this.dateFrom = dateFrom;
		this.date_To = date_To;
	}
	public Epass() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


}
