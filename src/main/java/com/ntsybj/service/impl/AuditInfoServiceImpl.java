package com.ntsybj.service.impl;

import com.ntsybj.common.utils.PageUtils;
import com.ntsybj.dao.AuditInfoDao;
import com.ntsybj.entity.AuditInfoEntity;
import com.ntsybj.service.AuditInfoService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ntsybj.entity.Query;



@Service("auditInfoService")
public class AuditInfoServiceImpl extends ServiceImpl<AuditInfoDao, AuditInfoEntity> implements AuditInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AuditInfoEntity> page = this.page(
                new Query<AuditInfoEntity>().getPage(params),
                new QueryWrapper<AuditInfoEntity>()
        );

        return new PageUtils(page);
    }

}