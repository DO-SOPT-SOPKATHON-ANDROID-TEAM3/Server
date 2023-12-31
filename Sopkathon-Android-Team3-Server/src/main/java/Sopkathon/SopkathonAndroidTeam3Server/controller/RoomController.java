package Sopkathon.SopkathonAndroidTeam3Server.controller;


import Sopkathon.SopkathonAndroidTeam3Server.dto.request.UserCreateRequest;
import Sopkathon.SopkathonAndroidTeam3Server.dto.request.UserEnterRequest;
import Sopkathon.SopkathonAndroidTeam3Server.dto.response.RoomCreateResponse;
import Sopkathon.SopkathonAndroidTeam3Server.service.RoomService;
import Sopkathon.SopkathonAndroidTeam3Server.util.BaseApiException;
import Sopkathon.SopkathonAndroidTeam3Server.util.BaseApiResponse;
import Sopkathon.SopkathonAndroidTeam3Server.util.BaseApiResponseNonData;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/room")
@RequiredArgsConstructor
public class RoomController {

    private final RoomService roomService;

    @PostMapping("/create")
    public BaseApiResponse<RoomCreateResponse> createRoom(@RequestBody UserCreateRequest request) {
        return new BaseApiResponse<>("방 생성 완료", roomService.createRoom(request));
    }

    @PostMapping("/enter")
    public BaseApiResponseNonData enter (@RequestBody UserEnterRequest request) {
        roomService.enterRoom(request);
        return new BaseApiResponseNonData("방 입장하기 완료");
    }

}
