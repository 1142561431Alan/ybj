package com.ntsybj.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ntsybj.common.utils.PageUtils;
import com.ntsybj.entity.AuditInfoEntity;

import java.util.Map;

/**
 * 审核信息表
 *
 * @author Alan
 * @email 
 * @date 2022-07-12 15:44:50
 */
public interface AuditInfoService extends IService<AuditInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

