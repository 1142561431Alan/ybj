package com.ntsybj.controller;

import java.util.Arrays;
import java.util.Map;

import com.ntsybj.common.utils.PageUtils;
import com.ntsybj.entity.PunishmentQueryDetailsEntity;
import com.ntsybj.service.PunishmentQueryDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ntsybj.entity.R;




/**
 * 处罚信息查询详情表
 *
 * @author Alan
 * @email 
 * @date 2022-07-12 15:44:50
 */
@RestController
@RequestMapping("ybj/punishmentquerydetails")
public class PunishmentQueryDetailsController {
    @Autowired
    private PunishmentQueryDetailsService punishmentQueryDetailsService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("ybj:punishmentquerydetails:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = punishmentQueryDetailsService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{idYbjPunishmentQueryDetails}")
    //@RequiresPermissions("ybj:punishmentquerydetails:info")
    public R info(@PathVariable("idYbjPunishmentQueryDetails") Integer idYbjPunishmentQueryDetails){
		PunishmentQueryDetailsEntity punishmentQueryDetails = punishmentQueryDetailsService.getById(idYbjPunishmentQueryDetails);

        return R.ok().put("punishmentQueryDetails", punishmentQueryDetails);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("ybj:punishmentquerydetails:save")
    public R save(@RequestBody PunishmentQueryDetailsEntity punishmentQueryDetails){
		punishmentQueryDetailsService.save(punishmentQueryDetails);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("ybj:punishmentquerydetails:update")
    public R update(@RequestBody PunishmentQueryDetailsEntity punishmentQueryDetails){
		punishmentQueryDetailsService.updateById(punishmentQueryDetails);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("ybj:punishmentquerydetails:delete")
    public R delete(@RequestBody Integer[] idYbjPunishmentQueryDetailss){
		punishmentQueryDetailsService.removeByIds(Arrays.asList(idYbjPunishmentQueryDetailss));

        return R.ok();
    }

}
