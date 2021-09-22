package example.aspas.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import example.aspas.entity.Epass;
import example.aspas.service.EpassService;

@Controller
@RestController
@RequestMapping("epass")


public class EpassController {
	@Autowired
	EpassService service;
	
	@GetMapping
	public List<Epass> getEpass() {

		return service.getAllEpass();

	}

	@PostMapping
    public Epass addEpass(@RequestBody Epass epass) {
		
		return service.save(epass);
	}
	
	

}
