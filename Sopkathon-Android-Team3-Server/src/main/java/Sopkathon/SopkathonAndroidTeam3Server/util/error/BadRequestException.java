package Sopkathon.SopkathonAndroidTeam3Server.util.error;

public class BadRequestException extends RuntimeException{
    public BadRequestException(ErrorResponseStatus status){
        super(status.getMessage());
    }
}