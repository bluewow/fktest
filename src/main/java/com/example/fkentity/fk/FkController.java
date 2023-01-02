package com.example.fkentity.fk;

import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class FkController {

    private final FkPostRepository fkPostRepository;
    private final FkMemberRepository fkMemberRepository;

    @Transactional
    @GetMapping("/test")
    public void test() {
        FkMember fkMember = new FkMember(1L, "member");
        FkPost fkPost = new FkPost(1L, "post", fkMember);

        fkMemberRepository.save(fkMember);
        fkPostRepository.save(fkPost);
    }

    @Transactional
    @GetMapping("/api/test")
    public void testApi() {
        FkMember fkMember = new FkMember(1L, "member");
        FkPost fkPost = new FkPost(1L, "post", fkMember);

        fkMemberRepository.save(fkMember);
        fkPostRepository.save(fkPost);
    }

    @Transactional
    @GetMapping("/api/test/{postId}")
    public List<FkPost> getApi(@PathVariable Long postId) {
        return fkPostRepository.findAll();
    }
}
