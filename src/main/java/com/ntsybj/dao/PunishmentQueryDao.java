package com.ntsybj.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ntsybj.entity.PunishmentQueryEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 处罚信息查询主表
 * 
 * @author Alan
 * @email 
 * @date 2022-07-12 15:44:50
 */
@Mapper
public interface PunishmentQueryDao extends BaseMapper<PunishmentQueryEntity> {
	
}
