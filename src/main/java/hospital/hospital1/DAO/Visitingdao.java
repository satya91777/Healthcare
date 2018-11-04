package hospital.hospital1.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hospital.hospital1.pojo.Visiting;

@Repository
public interface Visitingdao extends JpaRepository<Visiting,Long> {

}
