package com.suhong.sp1prac.mapper;

import com.suhong.sp1prac.domain.Board;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GenericMapper <K, V>{

    void insert(K board);

    List<K> selectList(@Param("skip") V skip, @Param("size") V size);

    void delete(V bno);

    K selectOne(V bno);

    void update(K board);

}
