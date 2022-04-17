package com.suhong.sp1prac.mapper;

import com.suhong.sp1prac.domain.Board;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/root-context.xml")
public class BoardMapperTests {

    @Autowired
    BoardMapper boardMapper;

    @Test
    public void testInsert() {
        Board board = Board.builder()
                .title("테스트 제목")
                .content("test content")
                .writer("!SuHong!")
                .build();
        boardMapper.insert(board);
    }

    @Test
    public void testSelectList() {
        List<Board> boardList = boardMapper.selectList(10, 10);
        boardList.forEach(board -> log.info(board));
    }

}
