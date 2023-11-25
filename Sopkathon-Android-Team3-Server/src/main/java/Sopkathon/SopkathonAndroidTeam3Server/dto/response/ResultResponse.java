package Sopkathon.SopkathonAndroidTeam3Server.dto.response;

import Sopkathon.SopkathonAndroidTeam3Server.domain.GoodDay;
import Sopkathon.SopkathonAndroidTeam3Server.domain.User;

public record ResultResponse(
        String name,
        String who,
        String where,
        String what
) {
    public static ResultResponse of(User user, GoodDay goodDay) {
        return new ResultResponse(
                user.getName(),
                goodDay.getRandomWho(),
                goodDay.getRandomWhere(),
                goodDay.getRandomWhat()
        );
    }
}
