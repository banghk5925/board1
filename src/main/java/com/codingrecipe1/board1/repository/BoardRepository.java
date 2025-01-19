package com.codingrecipe1.board1.repository;

import com.codingrecipe1.board1.dto.BoardDTO;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class BoardRepository {
    private final SqlSession sql;

    public void save(BoardDTO boardDTO) {
        sql.insert("Board.save", boardDTO);
    }
}
