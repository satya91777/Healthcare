package hospital.hospital1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import hospital.hospital1.DAO.doctorDao;
import hospital.hospital1.pojo.Doctor;

@Service
public class doctorService {
	
	@Autowired
	private doctorDao dao;
	public void saveDdata(@RequestBody List<Doctor> d){
		
		dao.saveAll(d);
	}
}
