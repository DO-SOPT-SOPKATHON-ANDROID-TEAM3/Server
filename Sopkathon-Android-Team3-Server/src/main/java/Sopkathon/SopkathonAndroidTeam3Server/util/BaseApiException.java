package Sopkathon.SopkathonAndroidTeam3Server.util;


import Sopkathon.SopkathonAndroidTeam3Server.util.error.ErrorResponseStatus;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class BaseApiException<T> {

//    @Schema(example = "상태 코드")
    private Integer status;

//    @Schema(example =  "성공 여부")
    private Boolean success;

//    @Schema(example =  "상태 메세지")
    private String message;

    public BaseApiException(ErrorResponseStatus status){
        this.status = status.getCode().value();
        this.success = false;
        this.message = status.getMessage();
    }

    public BaseApiException(HttpStatus code, String message){
        this.status = code.value();
        this.success = false;
        this.message = message;
    }
}
