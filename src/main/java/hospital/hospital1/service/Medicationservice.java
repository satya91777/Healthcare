package hospital.hospital1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hospital.hospital1.DAO.Medicationdao;
import hospital.hospital1.pojo.Medication;

@Service
public class Medicationservice {
	
	@Autowired
	private Medicationdao dao;
	public void saveMedication(Medication medication){
		dao.save(medication);
	}

}
