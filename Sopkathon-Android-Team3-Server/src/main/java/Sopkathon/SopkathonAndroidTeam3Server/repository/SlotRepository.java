package Sopkathon.SopkathonAndroidTeam3Server.repository;

import Sopkathon.SopkathonAndroidTeam3Server.domain.GoodDay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SlotRepository extends JpaRepository<GoodDay,Long> {
}
