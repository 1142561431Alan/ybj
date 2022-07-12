package com.ntsybj.controller;

import java.util.Arrays;
import java.util.Map;

import com.ntsybj.common.utils.PageUtils;
import com.ntsybj.entity.PunishmentSubmitEditRecordEntity;
import com.ntsybj.service.PunishmentSubmitEditRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ntsybj.entity.R;




/**
 * 处罚报送详情变更记录表
 *
 * @author Alan
 * @email 
 * @date 2022-07-12 15:44:50
 */
@RestController
@RequestMapping("ybj/punishmentsubmiteditrecord")
public class PunishmentSubmitEditRecordController {
    @Autowired
    private PunishmentSubmitEditRecordService punishmentSubmitEditRecordService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("ybj:punishmentsubmiteditrecord:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = punishmentSubmitEditRecordService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{idYbjPunishmentSubmitEditRecord}")
    //@RequiresPermissions("ybj:punishmentsubmiteditrecord:info")
    public R info(@PathVariable("idYbjPunishmentSubmitEditRecord") Integer idYbjPunishmentSubmitEditRecord){
		PunishmentSubmitEditRecordEntity punishmentSubmitEditRecord = punishmentSubmitEditRecordService.getById(idYbjPunishmentSubmitEditRecord);

        return R.ok().put("punishmentSubmitEditRecord", punishmentSubmitEditRecord);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("ybj:punishmentsubmiteditrecord:save")
    public R save(@RequestBody PunishmentSubmitEditRecordEntity punishmentSubmitEditRecord){
		punishmentSubmitEditRecordService.save(punishmentSubmitEditRecord);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("ybj:punishmentsubmiteditrecord:update")
    public R update(@RequestBody PunishmentSubmitEditRecordEntity punishmentSubmitEditRecord){
		punishmentSubmitEditRecordService.updateById(punishmentSubmitEditRecord);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("ybj:punishmentsubmiteditrecord:delete")
    public R delete(@RequestBody Integer[] idYbjPunishmentSubmitEditRecords){
		punishmentSubmitEditRecordService.removeByIds(Arrays.asList(idYbjPunishmentSubmitEditRecords));

        return R.ok();
    }

}
