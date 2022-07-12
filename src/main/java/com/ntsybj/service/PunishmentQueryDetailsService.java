package com.ntsybj.service;



import com.baomidou.mybatisplus.extension.service.IService;
import com.ntsybj.common.utils.PageUtils;
import com.ntsybj.entity.PunishmentQueryDetailsEntity;

import java.util.Map;

/**
 * 处罚信息查询详情表
 *
 * @author Alan
 * @email 
 * @date 2022-07-12 15:44:50
 */
public interface PunishmentQueryDetailsService extends IService<PunishmentQueryDetailsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

