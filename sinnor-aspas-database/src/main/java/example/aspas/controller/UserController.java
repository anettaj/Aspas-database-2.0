package example.aspas.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import example.aspas.entity.User;
import example.aspas.service.UserService;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	UserService service;
	
	@GetMapping
	public List<User> getUser() {

		return service.getAllUser();

	}

	@PostMapping
    public User addUser(@RequestBody User user) {
		
		return service.save(user);
	}

}
