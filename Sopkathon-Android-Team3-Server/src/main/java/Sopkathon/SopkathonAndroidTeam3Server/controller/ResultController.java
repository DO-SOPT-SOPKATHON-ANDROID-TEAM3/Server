package Sopkathon.SopkathonAndroidTeam3Server.controller;

import Sopkathon.SopkathonAndroidTeam3Server.service.ResultService;
import Sopkathon.SopkathonAndroidTeam3Server.util.BaseApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/result")
@RequiredArgsConstructor
public class ResultController {
    private final ResultService resultService;


    //    @Operation(summary = "책 좋아요/취소 기능", description = "책 좋아요/취소 기능 API입니다.")
//    @ApiResponses({
//            @ApiResponse(responseCode = "200", description = "책 좋아요/취소 기능 처리 완료"),
//            @ApiResponse(responseCode = "400", description = "유효한 책 id를 보냈는지 확인해주세요.")
//    })
    @GetMapping()
    public BaseApiResponse getResult(){
        return new BaseApiResponse("결과 조회 완료", resultService.getResultList());
    }

}
