package hospital.hospital1.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Medication")
public class Medication {

	private Long id;
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	  
	
	private Medicine medicine;
	@ManyToOne
	@JoinColumn(name="mid")
	public Medicine getMedicine() {
		return medicine;
	}
	public void setMedicine(Medicine medicine) {
		this.medicine = medicine;
	}
	
	private String howtouse;
	private Integer quqntity;
	private Integer duration;
	private Complaints complaints;
	
	@ManyToOne
	@JoinColumn(name="cid")
	
	public Complaints getComplaints() {
		return complaints;
	}
	public void setComplaints(Complaints complaints) {
		this.complaints = complaints;
	}
	public String getHowtouse() {
		return howtouse;
	}
	public void setHowtouse(String howtouse) {
		this.howtouse = howtouse;
	}
	public Integer getQuqntity() {
		return quqntity;
	}
	public void setQuqntity(Integer quqntity) {
		this.quqntity = quqntity;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	
	
	
}
