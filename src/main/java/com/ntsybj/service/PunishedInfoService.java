package com.ntsybj.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.ntsybj.common.utils.PageUtils;
import com.ntsybj.entity.PunishedInfoEntity;

import java.util.Map;

/**
 * 处罚信息表
 *
 * @author Alan
 * @email 
 * @date 2022-07-12 15:44:50
 */
public interface PunishedInfoService extends IService<PunishedInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

