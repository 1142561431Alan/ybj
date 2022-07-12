package com.ntsybj.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ntsybj.common.utils.PageUtils;
import com.ntsybj.dao.ConfigSequenceDao;
import com.ntsybj.entity.ConfigSequenceEntity;
import com.ntsybj.service.ConfigSequenceService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.ntsybj.entity.Query;


@Service("configSequenceService")
public class ConfigSequenceServiceImpl extends ServiceImpl<ConfigSequenceDao, ConfigSequenceEntity> implements ConfigSequenceService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ConfigSequenceEntity> page = this.page(
                new Query<ConfigSequenceEntity>().getPage(params),
                new QueryWrapper<ConfigSequenceEntity>()
        );

        return new PageUtils(page);
    }

}