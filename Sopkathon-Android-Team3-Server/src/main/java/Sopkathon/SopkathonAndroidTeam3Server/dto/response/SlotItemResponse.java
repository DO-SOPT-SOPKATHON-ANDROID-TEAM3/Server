package Sopkathon.SopkathonAndroidTeam3Server.dto.response;

import Sopkathon.SopkathonAndroidTeam3Server.domain.GoodDay;


public record SlotItemResponse(
        Long id,
        String who,
        String where,
        String what
) {
    public static SlotItemResponse of(GoodDay goodDay) {
        return new SlotItemResponse(
                goodDay.getId(),
                goodDay.getRandomWho(),
                goodDay.getRandomWhere(),
                goodDay.getRandomWhat()
        );
    }
}
