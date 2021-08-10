package example.aspas.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import example.aspas.entity.Admin;
@Repository

public interface AdminRepo extends JpaRepository<Admin, Integer> {

}
