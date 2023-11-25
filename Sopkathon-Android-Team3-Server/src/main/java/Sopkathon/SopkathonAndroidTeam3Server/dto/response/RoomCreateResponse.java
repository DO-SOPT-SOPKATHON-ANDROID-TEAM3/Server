package Sopkathon.SopkathonAndroidTeam3Server.dto.response;

import Sopkathon.SopkathonAndroidTeam3Server.domain.Room;
import lombok.AllArgsConstructor;

public record RoomCreateResponse(
    Long id,
    String code
) {

    public static RoomCreateResponse of(Room room) {
        return new RoomCreateResponse(
                room.getId(),
                room.getCode()
        );
    }

}
