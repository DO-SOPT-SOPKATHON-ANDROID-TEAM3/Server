package Sopkathon.SopkathonAndroidTeam3Server.service;


import Sopkathon.SopkathonAndroidTeam3Server.domain.GoodDay;
import Sopkathon.SopkathonAndroidTeam3Server.domain.User;
import Sopkathon.SopkathonAndroidTeam3Server.dto.response.ResultResponse;
import Sopkathon.SopkathonAndroidTeam3Server.dto.response.ResultResponseToFullString;
import Sopkathon.SopkathonAndroidTeam3Server.dto.response.SlotItemResponse;
import Sopkathon.SopkathonAndroidTeam3Server.repository.SlotRepository;
import Sopkathon.SopkathonAndroidTeam3Server.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ResultService {
    private final UserRepository userRepository;
    private final SlotRepository slotRepository;


    public HashMap<String, Object>  getResultList(){
        int count = 0;

        HashMap <String, Object> resultList = new HashMap<>();
        List<GoodDay> goodDays = slotRepository.findAll();

        List<ResultResponseToFullString> resultResponseToFullString = new ArrayList<ResultResponseToFullString>();
        List<ResultResponse> resultResponse = new ArrayList<ResultResponse>();



        for(GoodDay goodDay : goodDays){ //2~
            if(count == 0) {
                count = 1;
                resultResponse.add(ResultResponse.of(goodDay.getUser(), goodDay));
            } else{
                resultResponseToFullString.add(ResultResponseToFullString.of(goodDay.getUser(), goodDay));
            }
        }
        resultList.put("fistUser",resultResponse.get(0));
        resultList.put("Other",resultResponseToFullString);


        return resultList;

    }


}
