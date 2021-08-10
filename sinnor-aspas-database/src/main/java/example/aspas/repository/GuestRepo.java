package example.aspas.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import example.aspas.entity.Guest;
@Repository

public interface GuestRepo extends JpaRepository<Guest, Integer>{

}
