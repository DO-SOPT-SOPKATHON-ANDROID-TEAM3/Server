package Sopkathon.SopkathonAndroidTeam3Server.service;


import Sopkathon.SopkathonAndroidTeam3Server.dto.response.SlotItemResponse;
import Sopkathon.SopkathonAndroidTeam3Server.repository.SlotRepository;
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

    public SlotItemResponse getSlotItem(){
        List<SlotItemResponse> slotItemResponse = slotRepository.findAll().stream().map(SlotItemResponse::of)
                .collect(Collectors.toList());

        return slotItemResponse.get(0);

    }
}
