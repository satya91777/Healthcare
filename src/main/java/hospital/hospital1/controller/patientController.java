package hospital.hospital1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hospital.hospital1.pojo.Patient;
import hospital.hospital1.service.patientService;

@RestController
public class patientController {
	
	@Autowired
	private patientService ser;
	@RequestMapping("savePdata")
	public void savePdata(@RequestBody Patient p){
		ser.savePdata(p);
	}
	

}
