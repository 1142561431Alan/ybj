package com.ntsybj.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ntsybj.entity.PunishedFileEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 处罚附件信息表
 * 
 * @author Alan
 * @email 
 * @date 2022-07-12 15:44:50
 */
@Mapper
public interface PunishedFileDao extends BaseMapper<PunishedFileEntity> {
	
}
