/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.example.mapper;

import com.example.Dict;


import java.util.List;

/**
 * 字典DAO接口
 * @author ThinkGem
 * @version 2014-05-16
 */

public interface DictDao {

	public List<String> findTypeList(Dict dict);
	
}
