package cn.com.yxb.demo.eureka.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created on 2017/9/21.
 *
 * @author frank.
 */
@Data
@Entity
public class Users {

    @Id
    private Long id;

    private String name;

    private String password;

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
