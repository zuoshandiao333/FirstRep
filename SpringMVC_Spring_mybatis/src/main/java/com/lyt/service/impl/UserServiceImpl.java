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
//�˴����ٽ��д���SqlSession���ύ���񣬶��ѽ���springȥ�����ˡ�  
public class UserServiceImpl implements UserService{

	@Resource
	private UserMapper mapper;
	
    /**  
     	* ��������  
     */  
	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		mapper.save(user); 
	}

    /**  
     	* ���� id �޸Ķ�Ӧ����  
     */  
	@Override
	public boolean update(User user) {
		// TODO Auto-generated method stub
		return mapper.update(user); 
	}

    /**  
     	* ����  id  ɾ�� ����  
     */ 
	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return mapper.delete(id);  
	}

	 /**  
	  	* ���� id ��ѯ ��Ӧ����  
     */ 
	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		User user = mapper.findById(id);  
        return user;
	}

	   /**  
	    	* ��ѯUser��ȫ������  
     */ 
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		List<User> findAllList = mapper.findAll();  
        return findAllList; 
	}

}
