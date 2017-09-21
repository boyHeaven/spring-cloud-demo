package cn.com.yxb.demo.eureka.repository;

import cn.com.yxb.demo.eureka.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created on 2017/9/21.
 *
 * @author frank.
 */
public interface UserRepository extends JpaRepository<Users, Long> {

    Users findByName(String name);
}
