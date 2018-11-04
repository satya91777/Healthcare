package hospital.hospital1.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="appointement")
public class Appointement {
	
	private Long id;
	private Date datetime;
	private String prmaryreason;
	
	private Patient patient;
	@ManyToOne()
	@JoinColumn(name="pid")
	
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDatetime() {
		return datetime;
	}
	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	public String getPrmaryreason() {
		return prmaryreason;
	}
	public void setPrmaryreason(String prmaryreason) {
		this.prmaryreason = prmaryreason;
	}
	

}
