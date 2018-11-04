package hospital.hospital1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hospital.hospital1.pojo.Doctor;
import hospital.hospital1.service.doctorService;

@RestController
public class doctorCotroller {
	
	
	@Autowired
	
	private doctorService ser;
	@RequestMapping("saveDdata")
	public void saveDdata(@RequestBody List<Doctor> d){
		ser.saveDdata(d);
	}
}
