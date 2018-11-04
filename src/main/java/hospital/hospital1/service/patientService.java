package hospital.hospital1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import hospital.hospital1.DAO.patientDao;
import hospital.hospital1.pojo.Patient;


@Service
public class patientService {
	
	@Autowired
	private patientDao dao;
	
	public void savePdata(@RequestBody Patient p){
		dao.save(p);
	}

}
