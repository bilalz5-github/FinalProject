package Bilal.java.server.users;





import org.springframework.data.jpa.repository.JpaRepository;





public interface userRepository extends JpaRepository<Users, Long> {
	boolean existsByUsername(String studentID);

	Users findByUsername(String studentID);
    
}
