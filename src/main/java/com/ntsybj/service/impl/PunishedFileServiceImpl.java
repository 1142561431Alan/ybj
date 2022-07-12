package com.ntsybj.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ntsybj.common.utils.PageUtils;
import com.ntsybj.dao.PunishedFileDao;
import com.ntsybj.entity.PunishedFileEntity;
import com.ntsybj.service.PunishedFileService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.ntsybj.entity.Query;


@Service("punishedFileService")
public class PunishedFileServiceImpl extends ServiceImpl<PunishedFileDao, PunishedFileEntity> implements PunishedFileService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PunishedFileEntity> page = this.page(
                new Query<PunishedFileEntity>().getPage(params),
                new QueryWrapper<PunishedFileEntity>()
        );

        return new PageUtils(page);
    }

}