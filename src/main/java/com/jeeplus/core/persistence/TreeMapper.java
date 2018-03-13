/**
 \* Copyright &copy; 2018-2020 <a href="http://www.shshinesun.cn/">Tool</a> All rights reserved.
 */
package com.jeeplus.core.persistence;

import java.util.List;

/**
 * DAO支持类实现
 * @author jeeplus
 * @version 2017-05-16
 * @param <T>
 */
public interface TreeMapper<T extends TreeEntity<T>> extends BaseMapper<T> {

	/**
	 * 找到所有子节点
	 * @param entity
	 * @return
	 */
	public List<T> findByParentIdsLike(T entity);

	/**
	 * 更新所有父节点字段
	 * @param entity
	 * @return
	 */
	public int updateParentIds(T entity);
	
	
	public int updateSort(T entity);
	
	public List<T> getChildren(String parentId);
	
	
}