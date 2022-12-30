package com.example.fkentity.fk;

import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class FkController {

    private final FkCommentRepository fkCommentRepository;
    private final FkPostRepository fkPostRepository;
    private final FkMemberRepository fkMemberRepository;

    @Transactional
    @GetMapping("/test")
    public void test() {
        FkMember fkMember = new FkMember(1L, "member");
        FkPost fkPost = new FkPost(1L, "post", fkMember);
        FkComment fkComment = new FkComment(1L, "comment", fkPost.getFkMember());

        fkMemberRepository.save(fkMember);
        fkPostRepository.save(fkPost);
        fkCommentRepository.save(fkComment);
    }
}
