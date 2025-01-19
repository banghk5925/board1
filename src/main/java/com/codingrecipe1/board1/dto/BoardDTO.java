package com.codingrecipe1.board1.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardDTO {
    private Long id; //id=> 글번호

    private String boardWriter;  //boardWriter => 작성자

    private String boardPass;  //boardPass => 게시글 비번

    private String boardTitle;   //boardTitle => 제목

    private String boardContents;    //boardContents => 내용

    private int boardHits;    //boardHits => 조회수

    private  String createdAt;    //createdAt => 작성시간
}
