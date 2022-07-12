package com.ntsybj.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ntsybj.common.utils.PageUtils;
import com.ntsybj.dao.PunishmentSubmitInfoDao;
import com.ntsybj.entity.PunishmentSubmitInfoEntity;
import com.ntsybj.service.PunishmentSubmitInfoService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.ntsybj.entity.Query;


@Service("punishmentSubmitInfoService")
public class PunishmentSubmitInfoServiceImpl extends ServiceImpl<PunishmentSubmitInfoDao, PunishmentSubmitInfoEntity> implements PunishmentSubmitInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PunishmentSubmitInfoEntity> page = this.page(
                new Query<PunishmentSubmitInfoEntity>().getPage(params),
                new QueryWrapper<PunishmentSubmitInfoEntity>()
        );

        return new PageUtils(page);
    }

}