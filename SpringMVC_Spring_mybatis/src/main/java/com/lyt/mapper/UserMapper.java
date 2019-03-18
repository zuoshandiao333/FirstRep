package com.lyt.mapper;

import java.util.List;

import com.lyt.model.User;

/** 
 * ��Ϊ DAO�Ľӿ� 
 * @author 
 */ 
public interface UserMapper {

	void save(User user);    
    boolean update(User user);    
    boolean delete(int id);    
    User findById(int id);    
    List<User> findAll(); 
}
