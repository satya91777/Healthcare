package hospital.hospital1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hospital.hospital1.pojo.Disease;
import hospital.hospital1.service.diseaseService;

@RestController
public class diseaseController {
	
	
	@Autowired
	
	private diseaseService ser;
	@RequestMapping("saveDiseasedata")
	public void saveDiseasedata(@RequestBody List<Disease> di){
	ser.saveDiseasedata(di);
	}
}
