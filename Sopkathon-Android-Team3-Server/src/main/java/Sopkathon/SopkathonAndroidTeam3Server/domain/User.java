package Sopkathon.SopkathonAndroidTeam3Server.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "user")
public class User extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;


    @ManyToOne(fetch = FetchType.LAZY)
    private Room room;

    @Builder
    public User(String name, Room room) {
        this.name = name;
        this.room = room;
    }
}
