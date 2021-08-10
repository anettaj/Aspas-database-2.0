package example.aspas.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import example.aspas.entity.User;
import example.aspas.repository.UserRepo;

@Service

public class UserService {
	@Autowired
	UserRepo repo;
	
	public User save(User user) {
		return repo.save(user);
	}

	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
}
