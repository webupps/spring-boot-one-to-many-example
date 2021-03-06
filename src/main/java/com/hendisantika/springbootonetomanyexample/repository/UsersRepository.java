package com.hendisantika.springbootonetomanyexample.repository;

import com.hendisantika.springbootonetomanyexample.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-one-to-many-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 26/08/18
 * Time: 15.25
 * To change this template use File | Settings | File Templates.
 */
public interface UsersRepository extends JpaRepository<Users, Integer> {
    List<Users> findByName(String name);
}
