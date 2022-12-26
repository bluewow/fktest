package com.example.fkentity.fk;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
public class PostDto {

    public Long id;
    public String title;
    public String memberName;

    public PostDto(FkPost fkpost) {
        id = fkpost.getId();
        title = fkpost.getTitle();
        memberName = fkpost.getFkMember().name;
    }
}
