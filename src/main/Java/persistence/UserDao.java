package persistence;


import bean.UserEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by hzlaojiaqi on 2016/8/15.
 */
public interface UserDao {


    @Insert("insert into users(username,password,email) values(#{userName},#{password},#{email})")
    public int insertUser(UserEntity userEntity);


    @Select("select * from users")
    public List<UserEntity> getAllUser();


    @Select("select * from users where userName=#{name}")
    public UserEntity findUserByName(String name);


}
