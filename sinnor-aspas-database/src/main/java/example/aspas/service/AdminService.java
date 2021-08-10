package example.aspas.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import example.aspas.entity.Admin;
import example.aspas.repository.AdminRepo;

@Service

public class AdminService {
	@Autowired
	AdminRepo repo;

	public Admin save(Admin admin) {
		Admin myAdmin = repo.save(admin);

		return myAdmin;
	}

	public List<Admin> getAllAdmin() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}


}
