package Sopkathon.SopkathonAndroidTeam3Server.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional //get API 에만 (readOnly = true) 붙이기
public class MainService {
}
