package com.ntsybj.controller;

import java.util.Arrays;
import java.util.Map;

import com.ntsybj.common.utils.PageUtils;
import com.ntsybj.entity.PunishmentInfoEditRecordEntity;
import com.ntsybj.service.PunishmentInfoEditRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.ntsybj.entity.R;




/**
 * 处罚信息变更记录表
 *
 * @author Alan
 * @email 
 * @date 2022-07-12 15:44:50
 */
@RestController
@RequestMapping("ybj/punishmentinfoeditrecord")
public class PunishmentInfoEditRecordController {
    @Autowired
    private PunishmentInfoEditRecordService punishmentInfoEditRecordService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("ybj:punishmentinfoeditrecord:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = punishmentInfoEditRecordService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{idYbjPunishmentInfoEditRecord}")
    //@RequiresPermissions("ybj:punishmentinfoeditrecord:info")
    public R info(@PathVariable("idYbjPunishmentInfoEditRecord") Integer idYbjPunishmentInfoEditRecord){
		PunishmentInfoEditRecordEntity punishmentInfoEditRecord = punishmentInfoEditRecordService.getById(idYbjPunishmentInfoEditRecord);

        return R.ok().put("punishmentInfoEditRecord", punishmentInfoEditRecord);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("ybj:punishmentinfoeditrecord:save")
    public R save(@RequestBody PunishmentInfoEditRecordEntity punishmentInfoEditRecord){
		punishmentInfoEditRecordService.save(punishmentInfoEditRecord);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("ybj:punishmentinfoeditrecord:update")
    public R update(@RequestBody PunishmentInfoEditRecordEntity punishmentInfoEditRecord){
		punishmentInfoEditRecordService.updateById(punishmentInfoEditRecord);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("ybj:punishmentinfoeditrecord:delete")
    public R delete(@RequestBody Integer[] idYbjPunishmentInfoEditRecords){
		punishmentInfoEditRecordService.removeByIds(Arrays.asList(idYbjPunishmentInfoEditRecords));

        return R.ok();
    }

}
