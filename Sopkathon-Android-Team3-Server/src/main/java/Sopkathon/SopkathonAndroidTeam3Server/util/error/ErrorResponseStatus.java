package Sopkathon.SopkathonAndroidTeam3Server.util.error;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@RequiredArgsConstructor
@Getter
public enum ErrorResponseStatus {
    BAD_REQUEST_MISSING_VALUE(HttpStatus.BAD_REQUEST, "유효한 id를 보냈는지 확인해주세요.");

    private final HttpStatus code;
    private final String message;
}
