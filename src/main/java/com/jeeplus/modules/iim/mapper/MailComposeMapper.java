/**
 \* Copyright &copy; 2018-2020 <a href="http://www.shshinesun.cn/">Tool</a> All rights reserved.
 */
package com.jeeplus.modules.iim.mapper;

import com.jeeplus.core.persistence.BaseMapper;
import com.jeeplus.core.persistence.annotation.MyBatisMapper;
import com.jeeplus.modules.iim.entity.MailCompose;

/**
 * 发件箱MAPPER接口
 * @author jeeplus
 * @version 2015-11-15
 */
@MyBatisMapper
public interface MailComposeMapper extends BaseMapper<MailCompose> {
	public int getCount(MailCompose entity);
}