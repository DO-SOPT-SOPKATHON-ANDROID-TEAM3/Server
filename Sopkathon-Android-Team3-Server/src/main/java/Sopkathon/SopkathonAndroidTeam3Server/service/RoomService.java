package Sopkathon.SopkathonAndroidTeam3Server.service;

import Sopkathon.SopkathonAndroidTeam3Server.domain.Room;
import Sopkathon.SopkathonAndroidTeam3Server.domain.User;
import Sopkathon.SopkathonAndroidTeam3Server.dto.request.UserCreateRequest;
import Sopkathon.SopkathonAndroidTeam3Server.dto.response.RoomCreateResponse;
import Sopkathon.SopkathonAndroidTeam3Server.repository.RoomRepository;
import Sopkathon.SopkathonAndroidTeam3Server.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class RoomService {
    private final RoomRepository roomRepository;
    private final UserRepository userRepository;

    @Transactional
    public RoomCreateResponse createRoom(UserCreateRequest request) {
        Room room = roomRepository.save(
                Room.builder()
                        .code("Gooday")
                        .build()
        );

        User user = userRepository.save(
                User.builder()
                        .name(request.name())
                        .room(room)
                        .build()
        );

        return RoomCreateResponse.of(room);
    }
}
