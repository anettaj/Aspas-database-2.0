package example.aspas.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import example.aspas.entity.Epass;
import example.aspas.repository.EpassRepo;
@Service
public class EpassService {
	@Autowired
	EpassRepo repo;
	
	public Epass save(Epass epass) {
		return repo.save(epass);
	}

	public List<Epass> getAllEpass() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}


}
