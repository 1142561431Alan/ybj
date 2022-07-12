package com.ntsybj.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.ntsybj.common.utils.PageUtils;
import com.ntsybj.entity.AuditConfigEntity;

import java.util.Map;

/**
 * 审核配置表
 *
 * @author Alan
 * @email 
 * @date 2022-07-12 15:44:50
 */
public interface AuditConfigService extends IService<AuditConfigEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

