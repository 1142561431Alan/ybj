package com.ntsybj.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ntsybj.common.utils.PageUtils;
import com.ntsybj.dao.PunishedInfoDao;
import com.ntsybj.entity.PunishedInfoEntity;
import com.ntsybj.service.PunishedInfoService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.ntsybj.entity.Query;

@Service("punishedInfoService")
public class PunishedInfoServiceImpl extends ServiceImpl<PunishedInfoDao, PunishedInfoEntity> implements PunishedInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PunishedInfoEntity> page = this.page(
                new Query<PunishedInfoEntity>().getPage(params),
                new QueryWrapper<PunishedInfoEntity>()
        );

        return new PageUtils(page);
    }

}