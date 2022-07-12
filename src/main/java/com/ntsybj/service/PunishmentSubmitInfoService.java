package com.ntsybj.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ntsybj.common.utils.PageUtils;
import com.ntsybj.entity.PunishmentSubmitInfoEntity;

import java.util.Map;

/**
 * 处罚报送表
 *
 * @author Alan
 * @email 
 * @date 2022-07-12 15:44:50
 */
public interface PunishmentSubmitInfoService extends IService<PunishmentSubmitInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

