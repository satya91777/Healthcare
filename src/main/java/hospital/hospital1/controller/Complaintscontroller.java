package hospital.hospital1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hospital.hospital1.pojo.Complaints;
import hospital.hospital1.service.Complaintsservice;

@RestController

@RequestMapping("complaints")
public class Complaintscontroller {
	
	@Autowired
	private Complaintsservice ser;
	@PostMapping
	public void saveComplaint(@RequestBody Complaints complaint)
	{
		ser.saveComplaint(complaint);
	}

}
