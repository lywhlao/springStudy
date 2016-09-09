package service;

import bean.UserEntity;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import persistence.UserDao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 * Created by hzlaojiaqi on 2016/8/17.
 */

@Service
public class UserService implements UserDetailsService{

    @Autowired
    public UserDao userDao;

    public UserEntity getUserByName(String name) {
        UserEntity userEntity = userDao.findUserByName(name);
        return userEntity;
    }

    /**
     * 认证用户
     * @param name
     * @return
     */
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        System.out.println("Getting access details from employee dao !!");
        UserEntity userEntity=userDao.findUserByName(name);
        if(userEntity!=null){
            List<GrantedAuthority> authorities=new ArrayList<GrantedAuthority>();
            authorities.add(new SimpleGrantedAuthority("ROLE_HI"));
            return  new User(userEntity.getUserName(),userEntity.getPassword(),authorities);
        }
        throw  new UsernameNotFoundException("userName"+name+"not found");
    }
}
