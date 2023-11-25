package Sopkathon.SopkathonAndroidTeam3Server.service;


import Sopkathon.SopkathonAndroidTeam3Server.domain.GoodDay;
import Sopkathon.SopkathonAndroidTeam3Server.domain.User;
import Sopkathon.SopkathonAndroidTeam3Server.dto.response.ResultResponse;
import Sopkathon.SopkathonAndroidTeam3Server.dto.response.SlotItemResponse;
import Sopkathon.SopkathonAndroidTeam3Server.repository.SlotRepository;
import Sopkathon.SopkathonAndroidTeam3Server.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ResultService {
    private final UserRepository userRepository;
    private final SlotRepository slotRepository;


    public List<ResultResponse> getResultList(){
//        List<SlotItemResponse> slotItemResponse = slotRepository.findAll().stream().map(SlotItemResponse::of)
//                .collect(Collectors.toList());
//
//        return slotItemResponse.get(0);
        List<GoodDay> goodDays = slotRepository.findAll();

        List<ResultResponse> ResultResponseList = new ArrayList<ResultResponse>();

        for(GoodDay goodDay : goodDays){
            ResultResponseList.add(ResultResponse.of(goodDay.getUser(), goodDay));
        }

        return ResultResponseList;

    }


}
