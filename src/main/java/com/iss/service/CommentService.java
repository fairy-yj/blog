package com.iss.service;

import com.iss.po.Comment;

import java.util.List;

public interface CommentService {

    // 获取列表
    List<Comment> listCommentByBlogId(Long blogId);

    // 保存
    Comment saveComment(Comment comment);

}
