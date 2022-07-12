package com.ntsybj.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ntsybj.common.utils.PageUtils;
import com.ntsybj.dao.AuditConfigDao;
import com.ntsybj.entity.AuditConfigEntity;
import com.ntsybj.entity.Query;
import com.ntsybj.service.AuditConfigService;
import org.springframework.stereotype.Service;
import java.util.Map;



@Service("auditConfigService")
public class AuditConfigServiceImpl extends ServiceImpl<AuditConfigDao, AuditConfigEntity> implements AuditConfigService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AuditConfigEntity> page = this.page(
                new Query<AuditConfigEntity>().getPage(params),
                new QueryWrapper<AuditConfigEntity>()
        );

        return new PageUtils(page);
    }

}