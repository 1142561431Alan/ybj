package com.ntsybj.service;



import com.baomidou.mybatisplus.extension.service.IService;
import com.ntsybj.common.utils.PageUtils;
import com.ntsybj.entity.DataDictEntity;

import java.util.Map;

/**
 * 数据字典表
 *
 * @author Alan
 * @email 
 * @date 2022-07-12 15:44:50
 */
public interface DataDictService extends IService<DataDictEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

