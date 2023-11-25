package Sopkathon.SopkathonAndroidTeam3Server.repository;

import Sopkathon.SopkathonAndroidTeam3Server.domain.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoomRepository extends JpaRepository<Room, Long> {
    Optional<Room> findByCode(String code);

}
