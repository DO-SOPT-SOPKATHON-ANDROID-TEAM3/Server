package Sopkathon.SopkathonAndroidTeam3Server.repository;

import Sopkathon.SopkathonAndroidTeam3Server.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
