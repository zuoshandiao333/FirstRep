package com.lyt.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lyt.mapper.UserMapper;
import com.lyt.model.User;
import com.lyt.service.UserService;

@Service
@Transactional
//此处不再进行创建SqlSession和提交事务，都已交由spring去管理了。  
public class UserServiceImpl implements UserService{

	@Resource
	private UserMapper mapper;
	
    /**  
     	* 新增数据  
     */  
	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		mapper.save(user); 
	}

    /**  
     	* 根据 id 修改对应数据  
     */  
	@Override
	public boolean update(User user) {
		// TODO Auto-generated method stub
		return mapper.update(user); 
	}

    /**  
     	* 根据  id  删除 数据  
     */ 
	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return mapper.delete(id);  
	}

	 /**  
	  	* 根据 id 查询 对应数据  
     */ 
	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		User user = mapper.findById(id);  
        return user;
	}

	   /**  
	    	* 查询User的全部数据  
     */ 
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		List<User> findAllList = mapper.findAll();  
        return findAllList; 
	}

}
