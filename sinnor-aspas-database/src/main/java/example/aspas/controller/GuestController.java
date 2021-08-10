package example.aspas.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import example.aspas.entity.Guest;
import example.aspas.service.GuestService;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("guest")

public class GuestController {
	@Autowired
	GuestService service;
	
	@GetMapping
	public List<Guest> getGuest() {

		return service.getAllGuest();

	}

	@PostMapping
	public Guest addUser(@RequestBody Guest guest) {
		
		return service.save(guest);

	}


}
