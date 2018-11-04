package hospital.hospital1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hospital.hospital1.pojo.Appointement;
import hospital.hospital1.service.Appointementservice;

@RestController
@RequestMapping("appointement")
public class Appointementcontroller {
	
	
	@Autowired
	private Appointementservice ser;
	
	@PostMapping
	public void saveAppdata(@RequestBody Appointement app){
		ser.saveAppdata(app);
	}

}
