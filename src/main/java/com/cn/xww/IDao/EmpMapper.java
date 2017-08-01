package com.cn.xww.IDao;

import org.springframework.stereotype.Repository;

import com.cn.xww.domain.Emp;
@Repository
public interface EmpMapper {
    int deleteByPrimaryKey(Short empno);

    int insert(Emp record);

    int insertSelective(Emp record);

    Emp selectByPrimaryKey(int empno);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);
}