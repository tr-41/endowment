package com.example.endowment.mapper;

import com.example.endowment.domain.Euser;
import com.example.endowment.domain.EuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EuserMapper {
    long countByExample(EuserExample example);

    int deleteByExample(EuserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Euser record);

    int insertSelective(Euser record);

    List<Euser> selectByExample(EuserExample example);

    Euser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Euser record, @Param("example") EuserExample example);

    int updateByExample(@Param("record") Euser record, @Param("example") EuserExample example);

    int updateByPrimaryKeySelective(Euser record);

    int updateByPrimaryKey(Euser record);
}