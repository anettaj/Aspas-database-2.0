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
	


}
