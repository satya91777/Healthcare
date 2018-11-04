package hospital.hospital1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hospital.hospital1.pojo.Visiting;
import hospital.hospital1.service.Visitingservice;

@RestController
@RequestMapping("visiting")
public class Visitingcontroller {
	
	@Autowired
	private Visitingservice ser;
	@PostMapping
	public void saveVisiting(@RequestBody Visiting visiting){
		ser.saveVisiting(visiting);
	}
	

}
