package com.socialmedia.activity.Repository;

import com.socialmedia.activity.Entity.Social;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocialRepository extends JpaRepository<Social,Integer> {
}
