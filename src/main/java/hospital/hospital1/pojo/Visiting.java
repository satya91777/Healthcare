package hospital.hospital1.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="visiting")
public class Visiting {

	
	private Long id;
	private Date datetime;
	
	private Doctor doctor;
	@ManyToOne
	@JoinColumn(name="did")
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	
	private Appointement appointement;
	@OneToOne
	@JoinColumn(name="apid")
	public Appointement getAppointement() {
		return appointement;
	}
	public void setAppointement(Appointement appointement) {
		this.appointement = appointement;
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
	
}
