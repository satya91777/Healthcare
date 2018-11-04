package hospital.hospital1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import hospital.hospital1.DAO.medicineDao;
import hospital.hospital1.pojo.Medicine;

@Service
public class medicineService {
	
	@Autowired
	private medicineDao dao;
	public void saveMdata(@RequestBody List<Medicine> m){
		dao.saveAll(m);
	}
}
