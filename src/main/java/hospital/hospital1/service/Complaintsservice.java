package hospital.hospital1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hospital.hospital1.DAO.Complaintsdao;
import hospital.hospital1.pojo.Complaints;
import hospital.hospital1.pojo.Medication;

@Service
public class Complaintsservice {
	
	@Autowired
	public Complaintsdao dao;
	
	public void saveComplaint(Complaints complaint){
		List<Medication> medicationlist= complaint.getMedication();
		for (Medication medication : medicationlist) {
			
			medication.setComplaints(complaint);
		}
		dao.save(complaint);
	}
	

}
