package com.example.fkentity.domain;

import com.example.fkentity.noFk.Member;
import com.example.fkentity.noFk.MemberRepository;
import com.example.fkentity.noFk.Post;
import com.example.fkentity.noFk.PostRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FkTest {

    @Autowired
    private FkMemberRepository fkmemberRepository;

    @Autowired
    private FkPostRepository fkPostRepository;

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private PostRepository postRepository;

    @Test
    void fkTest() {
        FkMember member = fkmemberRepository.save(new FkMember(4L, "member"));
        fkPostRepository.save(new FkPost(3l, "title", member));

    }

    @Test
    void fkTestGet() {
        FkPost fkPost = fkPostRepository.findById(4L).get();
        System.out.println(fkPost);
    }

    @Test
    void nonfkTest() {
        Member member = new Member(1L, "member");
        memberRepository.save(member);
        Post post = new Post(2l, "title", member);
        postRepository.save(post);
    }

    @Test
    void nonFkTestGet() {
        Post post = postRepository.findById(2L).get();
        System.out.println(post);
    }
}
