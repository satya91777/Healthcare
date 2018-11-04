package hospital.hospital1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import hospital.hospital1.DAO.diseaseDao;
import hospital.hospital1.pojo.Disease;

@Service
public class diseaseService {
	@Autowired
	private diseaseDao dao;
	public void saveDiseasedata(@RequestBody List<Disease> d){
		dao.saveAll(d);
	}

}
