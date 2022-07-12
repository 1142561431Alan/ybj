package com.ntsybj.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ntsybj.common.utils.PageUtils;
import com.ntsybj.dao.DataDictDao;
import com.ntsybj.entity.DataDictEntity;
import com.ntsybj.service.DataDictService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.ntsybj.entity.Query;


@Service("dataDictService")
public class DataDictServiceImpl extends ServiceImpl<DataDictDao, DataDictEntity> implements DataDictService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<DataDictEntity> page = this.page(
                new Query<DataDictEntity>().getPage(params),
                new QueryWrapper<DataDictEntity>()
        );

        return new PageUtils(page);
    }

}