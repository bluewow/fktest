package com.example.fkentity.fk;

import com.example.fkentity.fk.FkPost;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@Transactional
@RestController
public class FkController {

    private final FkMemberRepository fkMemberRepository;
    private final FkPostRepository fkPostRepository;

    @PostMapping("/post/create")
    public Long create(@RequestBody PostDto postDto) {

        FkMember member = new FkMember("member");
        FkPost post = new FkPost(postDto.getTitle(), member);
        fkMemberRepository.save(member);
        FkPost fkpost = fkPostRepository.save(post);

        return fkpost.getId();
    }

    @GetMapping("/post/{postId}")
    public PostDto get(@PathVariable Long postId) {
        FkPost fkpost = fkPostRepository.findById(postId).get();

        return new PostDto(fkpost);
    }

}
