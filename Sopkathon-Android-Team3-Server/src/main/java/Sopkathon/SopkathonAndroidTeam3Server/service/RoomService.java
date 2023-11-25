package Sopkathon.SopkathonAndroidTeam3Server.service;

import Sopkathon.SopkathonAndroidTeam3Server.domain.Room;
import Sopkathon.SopkathonAndroidTeam3Server.domain.User;
import Sopkathon.SopkathonAndroidTeam3Server.dto.request.UserCreateRequest;
import Sopkathon.SopkathonAndroidTeam3Server.dto.request.UserEnterRequest;
import Sopkathon.SopkathonAndroidTeam3Server.dto.response.RoomCreateResponse;
import Sopkathon.SopkathonAndroidTeam3Server.repository.RoomRepository;
import Sopkathon.SopkathonAndroidTeam3Server.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class RoomService {
    private final RoomRepository roomRepository;
    private final UserRepository userRepository;

    @Transactional
    public RoomCreateResponse createRoom(UserCreateRequest request) {
        String uuid = UUID.randomUUID().toString();
        // 하이픈 제거
        uuid = uuid.replaceAll("-", "");
        Room room = roomRepository.save(
                Room.builder()
                        // 앞에서 6글자 추출
                        .code(uuid.substring(0, 6))
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

    public void enterRoom(UserEnterRequest request) {
        Room room = roomRepository.findByCode(request.code()).orElseThrow(() -> new IllegalArgumentException("잘못된 코드"));

        User user = userRepository.save(
                User.builder()
                        .name(request.name())
                        .room(room)
                        .build()
        );

    }
}
