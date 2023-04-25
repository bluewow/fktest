package com.example.fkentity.noFk;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional
@Service
public class PostService {

    private final PostRepository postRepository;

    public void service() {
        List<Post> all = postRepository.findAll();

        System.out.println(all);
    }
}
