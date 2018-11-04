package hospital.hospital1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hospital.hospital1.DAO.Appointementdao;
import hospital.hospital1.pojo.Appointement;

@Service
public class Appointementservice {
	@Autowired
	private Appointementdao appdao;
	public void  saveAppdata(Appointement app){
		appdao.save(app);
	}
	
	

}
