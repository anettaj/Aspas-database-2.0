package example.aspas.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import example.aspas.entity.Admin;
import example.aspas.service.AdminService;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("admin")


public class AdminController {
	@Autowired
	AdminService service;
	
	@GetMapping
	public List<Admin> getAdmin() {

		return service.getAllAdmin();

	}

	@PostMapping
	public Admin addAdmin(@RequestBody Admin admin) {
		
		return service.save(admin);

	}

}
