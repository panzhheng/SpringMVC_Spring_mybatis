package com.tgb.mapper;

import java.util.List;

import com.tgb.model.User;
/**
 * 
* @ClassName: UserMapper 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author panzh
* @date 2017-5-23 上午11:06:39 
*
 */
public interface UserMapper {

	void save(User user);
	boolean update(User user);
	boolean delete(int id);
	User findById(int id);
	List<User> findAll();
}
