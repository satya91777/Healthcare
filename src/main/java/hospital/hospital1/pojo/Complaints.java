package hospital.hospital1.pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="complaints")
public class Complaints {
	
	
	
	private List<Medication> medication;
	
	@OneToMany(mappedBy="complaints",cascade=CascadeType.ALL)
	public List<Medication> getMedication() {
		return medication;
	}
	public void setMedication(List<Medication> medication) {
		this.medication = medication;
	}
	private Long id;
	
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	private String description;
	
	private List<Disease> disease;
	
	@ManyToMany
	@JoinTable(name="complaint_disease",
	        joinColumns={@JoinColumn(name="cid")},
	        inverseJoinColumns={@JoinColumn(name="did")})
	public List<Disease> getDisease() {
		return disease;
	}
	public void setDisease(List<Disease> disease) {
		this.disease = disease;
	}
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	private Visiting visiting;

	@ManyToOne
	@JoinColumn(name="vid")
	public Visiting getVisiting() {
		return visiting;
	}
	public void setVisiting(Visiting visiting) {
		this.visiting = visiting;
	}

}
