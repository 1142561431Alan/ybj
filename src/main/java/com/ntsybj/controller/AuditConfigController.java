package com.ntsybj.controller;

import java.util.Arrays;
import java.util.Map;

import com.ntsybj.common.utils.PageUtils;
import com.ntsybj.entity.AuditConfigEntity;
import com.ntsybj.entity.R;
import com.ntsybj.service.AuditConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;





/**
 * 审核配置表
 *
 * @author Alan
 * @email 
 * @date 2022-07-12 15:44:50
 */
@RestController
@RequestMapping("ybj/auditconfig")
public class AuditConfigController {
    @Autowired
    private AuditConfigService auditConfigService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("ybj:auditconfig:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = auditConfigService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{idYbjAuditConfig}")
    //@RequiresPermissions("ybj:auditconfig:info")
    public R info(@PathVariable("idYbjAuditConfig") Integer idYbjAuditConfig){
		AuditConfigEntity auditConfig = auditConfigService.getById(idYbjAuditConfig);

        return R.ok().put("auditConfig", auditConfig);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("ybj:auditconfig:save")
    public R save(@RequestBody AuditConfigEntity auditConfig){
		auditConfigService.save(auditConfig);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("ybj:auditconfig:update")
    public R update(@RequestBody AuditConfigEntity auditConfig){
		auditConfigService.updateById(auditConfig);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("ybj:auditconfig:delete")
    public R delete(@RequestBody Integer[] idYbjAuditConfigs){
		auditConfigService.removeByIds(Arrays.asList(idYbjAuditConfigs));

        return R.ok();
    }

}
