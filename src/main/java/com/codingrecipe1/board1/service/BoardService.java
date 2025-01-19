package com.codingrecipe1.board1.service;

import com.codingrecipe1.board1.dto.BoardDTO;
import com.codingrecipe1.board1.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public void save(BoardDTO boardDTO) {
        boardRepository.save(boardDTO);
    }
}
