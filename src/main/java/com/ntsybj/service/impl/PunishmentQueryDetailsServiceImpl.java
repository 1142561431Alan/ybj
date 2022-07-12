package com.ntsybj.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ntsybj.common.utils.PageUtils;
import com.ntsybj.dao.PunishmentQueryDetailsDao;
import com.ntsybj.entity.PunishmentQueryDetailsEntity;
import com.ntsybj.service.PunishmentQueryDetailsService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.ntsybj.entity.Query;


@Service("punishmentQueryDetailsService")
public class PunishmentQueryDetailsServiceImpl extends ServiceImpl<PunishmentQueryDetailsDao, PunishmentQueryDetailsEntity> implements PunishmentQueryDetailsService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PunishmentQueryDetailsEntity> page = this.page(
                new Query<PunishmentQueryDetailsEntity>().getPage(params),
                new QueryWrapper<PunishmentQueryDetailsEntity>()
        );

        return new PageUtils(page);
    }

}