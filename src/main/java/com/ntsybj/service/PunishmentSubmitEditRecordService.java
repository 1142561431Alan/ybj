package com.ntsybj.service;



import com.baomidou.mybatisplus.extension.service.IService;
import com.ntsybj.common.utils.PageUtils;
import com.ntsybj.entity.PunishmentSubmitEditRecordEntity;

import java.util.Map;

/**
 * 处罚报送详情变更记录表
 *
 * @author Alan
 * @email 
 * @date 2022-07-12 15:44:50
 */
public interface PunishmentSubmitEditRecordService extends IService<PunishmentSubmitEditRecordEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

