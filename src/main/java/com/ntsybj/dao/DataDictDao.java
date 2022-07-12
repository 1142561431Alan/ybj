package com.ntsybj.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ntsybj.entity.DataDictEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 数据字典表
 * 
 * @author Alan
 * @email 
 * @date 2022-07-12 15:44:50
 */
@Mapper
public interface DataDictDao extends BaseMapper<DataDictEntity> {
	
}
