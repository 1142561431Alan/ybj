package com.ntsybj.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.ntsybj.common.utils.PageUtils;
import com.ntsybj.entity.ConfigSequenceEntity;

import java.util.Map;

/**
 * 流水号配置表
 *
 * @author Alan
 * @email 
 * @date 2022-07-12 15:44:50
 */
public interface ConfigSequenceService extends IService<ConfigSequenceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

