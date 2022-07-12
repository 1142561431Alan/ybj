package com.ntsybj.controller;

import java.util.Arrays;
import java.util.Map;

import com.ntsybj.common.utils.PageUtils;
import com.ntsybj.entity.PunishedInfoEntity;
import com.ntsybj.service.PunishedInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.ntsybj.entity.R;




/**
 * 处罚信息表
 *
 * @author Alan
 * @email 
 * @date 2022-07-12 15:44:50
 */
@RestController
@RequestMapping("ybj/punishedinfo")
public class PunishedInfoController {
    @Autowired
    private PunishedInfoService punishedInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("ybj:punishedinfo:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = punishedInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{idYbjPunishedInfo}")
    //@RequiresPermissions("ybj:punishedinfo:info")
    public R info(@PathVariable("idYbjPunishedInfo") Integer idYbjPunishedInfo){
		PunishedInfoEntity punishedInfo = punishedInfoService.getById(idYbjPunishedInfo);

        return R.ok().put("punishedInfo", punishedInfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("ybj:punishedinfo:save")
    public R save(@RequestBody PunishedInfoEntity punishedInfo){
		punishedInfoService.save(punishedInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("ybj:punishedinfo:update")
    public R update(@RequestBody PunishedInfoEntity punishedInfo){
		punishedInfoService.updateById(punishedInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("ybj:punishedinfo:delete")
    public R delete(@RequestBody Integer[] idYbjPunishedInfos){
		punishedInfoService.removeByIds(Arrays.asList(idYbjPunishedInfos));

        return R.ok();
    }

}
