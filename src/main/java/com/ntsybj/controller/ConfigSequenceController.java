package com.ntsybj.controller;

import java.util.Arrays;
import java.util.Map;

import com.ntsybj.common.utils.PageUtils;
import com.ntsybj.entity.ConfigSequenceEntity;
import com.ntsybj.entity.R;
import com.ntsybj.service.ConfigSequenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;





/**
 * 流水号配置表
 *
 * @author Alan
 * @email 
 * @date 2022-07-12 15:44:50
 */
@RestController
@RequestMapping("ybj/configsequence")
public class ConfigSequenceController {
    @Autowired
    private ConfigSequenceService configSequenceService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("ybj:configsequence:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = configSequenceService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{tableName}")
    //@RequiresPermissions("ybj:configsequence:info")
    public R info(@PathVariable("tableName") String tableName){
		ConfigSequenceEntity configSequence = configSequenceService.getById(tableName);

        return R.ok().put("configSequence", configSequence);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("ybj:configsequence:save")
    public R save(@RequestBody ConfigSequenceEntity configSequence){
		configSequenceService.save(configSequence);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("ybj:configsequence:update")
    public R update(@RequestBody ConfigSequenceEntity configSequence){
		configSequenceService.updateById(configSequence);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("ybj:configsequence:delete")
    public R delete(@RequestBody String[] tableNames){
		configSequenceService.removeByIds(Arrays.asList(tableNames));

        return R.ok();
    }

}
