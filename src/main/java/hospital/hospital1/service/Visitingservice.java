package hospital.hospital1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hospital.hospital1.DAO.Visitingdao;
import hospital.hospital1.pojo.Visiting;

@Service
public class Visitingservice {
	
	@Autowired
	private Visitingdao dao;
	public void saveVisiting(Visiting visiting){
		dao.save(visiting);
	}

}
