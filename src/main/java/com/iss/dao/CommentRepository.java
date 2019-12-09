package com.iss.dao;

import com.iss.po.Comment;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment,Long> {

//    @Query("select c from Comment c ORDER BY createTime DESC")
    List<Comment> findByBlogIdAndParentCommentNull(Long blogId, Pageable pageable);

}
