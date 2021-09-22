package example.aspas.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import example.aspas.entity.Epass;
@Repository



public interface EpassRepo extends JpaRepository<Epass, Integer>{

}