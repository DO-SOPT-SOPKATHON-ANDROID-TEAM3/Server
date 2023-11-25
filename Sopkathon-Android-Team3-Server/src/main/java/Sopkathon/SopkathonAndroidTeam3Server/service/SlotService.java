package Sopkathon.SopkathonAndroidTeam3Server.service;


import Sopkathon.SopkathonAndroidTeam3Server.domain.GoodDay;
import Sopkathon.SopkathonAndroidTeam3Server.domain.User;
import Sopkathon.SopkathonAndroidTeam3Server.dto.request.SlotSetRequest;
import Sopkathon.SopkathonAndroidTeam3Server.dto.response.SlotItemResponse;
import Sopkathon.SopkathonAndroidTeam3Server.repository.SlotRepository;
import Sopkathon.SopkathonAndroidTeam3Server.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class SlotService {

    private final SlotRepository slotRepository;
    private final UserRepository userRepository;

    public SlotItemResponse getSlotItem(){
        List<SlotItemResponse> slotItemResponse = slotRepository.findAll().stream().map(SlotItemResponse::of)
                .collect(Collectors.toList());

        return slotItemResponse.get(5);

    }

    public void setSlotToNextUser(SlotSetRequest request){
        int userId = request.userId();
        int slotId = request.slotId();

        //다음 유저 가져욤
        User user = userRepository.findById(Long.valueOf(userId+1)).orElseThrow(()-> new EntityNotFoundException("해당하는 유저가 없습니다."));
        GoodDay goodDay = slotRepository.findById(Long.valueOf(slotId)).orElseThrow(()-> new EntityNotFoundException("해당하는 슬롯이 없습니다."));
        goodDay.setUser(user);
        slotRepository.save(goodDay);

    }
}
