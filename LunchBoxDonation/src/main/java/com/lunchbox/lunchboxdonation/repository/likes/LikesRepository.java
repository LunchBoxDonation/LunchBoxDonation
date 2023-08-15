package com.lunchbox.lunchboxdonation.repository.likes;

import com.lunchbox.lunchboxdonation.entity.Likes;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LikesRepository extends JpaRepository<Likes,Long> {
    @Query("select l from Likes l order by l.createdAt desc")
    List<Likes> findAllLikes(Pageable pageable);
}
