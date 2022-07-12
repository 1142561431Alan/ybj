package com.ntsybj.controller;

import java.util.Arrays;
import java.util.Map;

import com.ntsybj.common.utils.PageUtils;
import com.ntsybj.entity.AuditInfoEntity;
import com.ntsybj.entity.R;
import com.ntsybj.service.AuditInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




/**
 * 审核信息表
 *
 * @author Alan
 * @email 
 * @date 2022-07-12 15:44:50
 */
@RestController
@RequestMapping("ybj/auditinfo")
public class AuditInfoController {
    @Autowired
    private AuditInfoService auditInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("ybj:auditinfo:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = auditInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{idYbjAuditInfo}")
    //@RequiresPermissions("ybj:auditinfo:info")
    public R info(@PathVariable("idYbjAuditInfo") Integer idYbjAuditInfo){
		AuditInfoEntity auditInfo = auditInfoService.getById(idYbjAuditInfo);

        return R.ok().put("auditInfo", auditInfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("ybj:auditinfo:save")
    public R save(@RequestBody AuditInfoEntity auditInfo){
		auditInfoService.save(auditInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("ybj:auditinfo:update")
    public R update(@RequestBody AuditInfoEntity auditInfo){
		auditInfoService.updateById(auditInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("ybj:auditinfo:delete")
    public R delete(@RequestBody Integer[] idYbjAuditInfos){
		auditInfoService.removeByIds(Arrays.asList(idYbjAuditInfos));

        return R.ok();
    }

}
