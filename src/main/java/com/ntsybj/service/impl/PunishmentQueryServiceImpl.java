package com.ntsybj.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ntsybj.common.utils.PageUtils;
import com.ntsybj.dao.PunishmentQueryDao;
import com.ntsybj.entity.PunishmentQueryEntity;
import com.ntsybj.service.PunishmentQueryService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.ntsybj.entity.Query;


@Service("punishmentQueryService")
public class PunishmentQueryServiceImpl extends ServiceImpl<PunishmentQueryDao, PunishmentQueryEntity> implements PunishmentQueryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PunishmentQueryEntity> page = this.page(
                new Query<PunishmentQueryEntity>().getPage(params),
                new QueryWrapper<PunishmentQueryEntity>()
        );

        return new PageUtils(page);
    }

}