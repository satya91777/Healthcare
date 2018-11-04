package hospital.hospital1.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hospital.hospital1.pojo.Medication;

@Repository
public interface Medicationdao extends JpaRepository<Medication, Long> {

}
