package com.example.fkentity.noFk;

import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Transactional
@RequiredArgsConstructor
@RestController
public class MemberController {
    
    private final MemberRepository memberRepository;
    
    @GetMapping("/map/test")
    public void test() {
        List<Member> member = memberRepository.findAll();
        System.out.println(member);

    }
}
