package com.pthienquan1.security.repository;

import com.pthienquan1.security.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by quan0
 * Date 5/30/2023 - 4:10 PM
 * Description: ...
 */
public interface UserRepository extends JpaRepository<User,Integer>  {

   Optional<User> findByEmail(String email);
}
