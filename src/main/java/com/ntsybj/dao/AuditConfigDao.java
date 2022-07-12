package com.ntsybj.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ntsybj.entity.AuditConfigEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 审核配置表
 * 
 * @author Alan
 * @email 
 * @date 2022-07-12 15:44:50
 */
@Mapper
public interface AuditConfigDao extends BaseMapper<AuditConfigEntity> {
	
}
