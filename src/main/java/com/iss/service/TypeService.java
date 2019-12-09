package com.iss.service;

import com.iss.po.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TypeService {

    // 新增
    Type saveType(Type type);

    // 查询
    Type getType(Long id);

    Type getTypeByName(String name);

    // 分页
    Page<Type> listType(Pageable pageable);

    List<Type> listType();

    // 博客首页 类型展示
    List<Type> listTypeTop(Integer size);

    // 修改
    Type updateType(Long id,Type type);

    // 删除
    void deleteType(Long id);
}
