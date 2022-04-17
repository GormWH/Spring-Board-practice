package com.suhong.sp1prac.mapper;

import com.suhong.sp1prac.domain.Board;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BoardMapper {

    void insert(Board board);

    List<Board> selectList(@Param("skip") int skip, @Param("size") int size);
}
