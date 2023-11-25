package Sopkathon.SopkathonAndroidTeam3Server.repository;

import Sopkathon.SopkathonAndroidTeam3Server.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
