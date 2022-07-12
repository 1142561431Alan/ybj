package com.ntsybj.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ntsybj.common.utils.PageUtils;
import com.ntsybj.dao.PunishmentInfoEditRecordDao;
import com.ntsybj.entity.PunishmentInfoEditRecordEntity;
import com.ntsybj.service.PunishmentInfoEditRecordService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.ntsybj.entity.Query;


@Service("punishmentInfoEditRecordService")
public class PunishmentInfoEditRecordServiceImpl extends ServiceImpl<PunishmentInfoEditRecordDao, PunishmentInfoEditRecordEntity> implements PunishmentInfoEditRecordService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PunishmentInfoEditRecordEntity> page = this.page(
                new Query<PunishmentInfoEditRecordEntity>().getPage(params),
                new QueryWrapper<PunishmentInfoEditRecordEntity>()
        );

        return new PageUtils(page);
    }

}