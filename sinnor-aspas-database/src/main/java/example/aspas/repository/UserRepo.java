package example.aspas.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import example.aspas.entity.User;
@Repository

public interface UserRepo extends JpaRepository<User, Integer>{

}
