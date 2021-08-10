package example.aspas.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import example.aspas.entity.Guest;
import example.aspas.repository.GuestRepo;

@Service


public class GuestService {
	@Autowired
	GuestRepo repo;

	public Guest save(Guest guest) {
		Guest myGuest = repo.save(guest);

		return myGuest;
	}

	public List<Guest> getAllGuest() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}


}
