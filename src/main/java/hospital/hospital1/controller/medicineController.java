package hospital.hospital1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hospital.hospital1.pojo.Medicine;
import hospital.hospital1.service.medicineService;

@RestController
public class medicineController {
	@Autowired
	
	private medicineService ser;
	@RequestMapping("saveMdata")
	public void saveMdata(@RequestBody List<Medicine> m){
		ser.saveMdata(m);
	}

}
