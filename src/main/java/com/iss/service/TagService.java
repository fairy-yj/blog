package com.iss.service;

import com.iss.po.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TagService {

    // 新增
    Tag saveTag(Tag tag);

    // 查询
    Tag getTag(Long id);

    Tag getTagByName(String name);

    // 分页
    Page<Tag> listTag(Pageable pageable);

    List<Tag> listTag();

    // 博客首页的显示
    List<Tag> listTagTop(Integer size);

    List<Tag> listTag(String ids);

    // 修改
    Tag updateTag(Long id, Tag tag);

    // 删除
    void deleteTag(Long id);
}
