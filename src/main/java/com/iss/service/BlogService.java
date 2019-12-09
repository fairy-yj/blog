package com.iss.service;

import com.iss.po.Blog;
import com.iss.vo.BlogQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

public interface BlogService {

    Blog getBlog(Long id);

    // 用于前端的展示
    Blog getAndConvert(Long id);

    Page<Blog> listBlog(Pageable pageable,BlogQuery blog);

    Page<Blog> listBlog(Pageable pageable);

    // 根据标签id查询博客
    Page<Blog> listBlog(Long tagId, Pageable pageable);

    // 搜索页面的查询
    Page<Blog> listBlog(String query,Pageable pageable);

    // 博客首页的最新推荐
    List<Blog> listRecommendBlogTop(Integer size);

    // 归档
    Map<String,List<Blog>> archiveBlog();

    // 归档中定义博客数量
    Long countBlog();

    Blog saveBlog(Blog blog);

    Blog updateBlog(Long id,Blog blog);

    void deleteBlog(Long id);

}
