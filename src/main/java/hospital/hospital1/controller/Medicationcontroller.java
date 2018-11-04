package hospital.hospital1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hospital.hospital1.pojo.Medication;
import hospital.hospital1.service.Medicationservice;

@RestController
@RequestMapping("medication")
public class Medicationcontroller {
@Autowired
private Medicationservice ser;
@PostMapping
public void saveMedication(@RequestBody Medication medication){
	ser.saveMedication(medication);
}
	
}
