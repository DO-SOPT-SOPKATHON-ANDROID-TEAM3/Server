package Sopkathon.SopkathonAndroidTeam3Server.dto.request;

import Sopkathon.SopkathonAndroidTeam3Server.domain.Room;

public record UserEnterRequest(
        String code, 
        String name
) {

}
