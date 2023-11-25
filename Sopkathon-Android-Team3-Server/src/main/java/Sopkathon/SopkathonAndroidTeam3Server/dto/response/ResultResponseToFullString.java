package Sopkathon.SopkathonAndroidTeam3Server.dto.response;

import Sopkathon.SopkathonAndroidTeam3Server.domain.GoodDay;
import Sopkathon.SopkathonAndroidTeam3Server.domain.User;

public record ResultResponseToFullString(
        String name,
        String todo
) {
    public static ResultResponseToFullString of(User user, GoodDay goodDay) {
        return new ResultResponseToFullString(
                user.getName(),
                goodDay.getRandomWho() + " " + goodDay.getRandomWhere() + " "  + goodDay.getRandomWhat()
        );
    }

}