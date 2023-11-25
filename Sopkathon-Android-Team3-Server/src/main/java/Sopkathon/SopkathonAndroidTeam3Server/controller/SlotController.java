package Sopkathon.SopkathonAndroidTeam3Server.controller;


import Sopkathon.SopkathonAndroidTeam3Server.service.SlotService;
import Sopkathon.SopkathonAndroidTeam3Server.util.BaseApiResponse;
import Sopkathon.SopkathonAndroidTeam3Server.util.BaseApiResponseNonData;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/slot")
@RequiredArgsConstructor
public class SlotController {

    private final SlotService slotService;

//    @Operation(summary = "책 좋아요/취소 기능", description = "책 좋아요/취소 기능 API입니다.")
//    @ApiResponses({
//            @ApiResponse(responseCode = "200", description = "책 좋아요/취소 기능 처리 완료"),
//            @ApiResponse(responseCode = "400", description = "유효한 책 id를 보냈는지 확인해주세요.")
//    })
    @GetMapping()
    public BaseApiResponse getSlot(){
        return new BaseApiResponse("슬롯 조회 완료", slotService.getSlotItem());
    }
}
