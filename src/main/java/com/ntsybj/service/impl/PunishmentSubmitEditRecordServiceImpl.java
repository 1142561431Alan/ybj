package com.ntsybj.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ntsybj.common.utils.PageUtils;
import com.ntsybj.dao.PunishmentSubmitEditRecordDao;
import com.ntsybj.entity.PunishmentSubmitEditRecordEntity;
import com.ntsybj.service.PunishmentSubmitEditRecordService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.ntsybj.entity.Query;


@Service("punishmentSubmitEditRecordService")
public class PunishmentSubmitEditRecordServiceImpl extends ServiceImpl<PunishmentSubmitEditRecordDao, PunishmentSubmitEditRecordEntity> implements PunishmentSubmitEditRecordService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PunishmentSubmitEditRecordEntity> page = this.page(
                new Query<PunishmentSubmitEditRecordEntity>().getPage(params),
                new QueryWrapper<PunishmentSubmitEditRecordEntity>()
        );

        return new PageUtils(page);
    }

}