package com.ntsybj.controller;

import java.util.Arrays;
import java.util.Map;

import com.ntsybj.common.utils.PageUtils;
import com.ntsybj.entity.PunishmentQueryEntity;
import com.ntsybj.service.PunishmentQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.ntsybj.entity.R;




/**
 * 处罚信息查询主表
 *
 * @author Alan
 * @email 
 * @date 2022-07-12 15:44:50
 */
@RestController
@RequestMapping("ybj/punishmentquery")
public class PunishmentQueryController {
    @Autowired
    private PunishmentQueryService punishmentQueryService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("ybj:punishmentquery:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = punishmentQueryService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{idYbjPunishmentQuery}")
    //@RequiresPermissions("ybj:punishmentquery:info")
    public R info(@PathVariable("idYbjPunishmentQuery") String idYbjPunishmentQuery){
		PunishmentQueryEntity punishmentQuery = punishmentQueryService.getById(idYbjPunishmentQuery);

        return R.ok().put("punishmentQuery", punishmentQuery);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("ybj:punishmentquery:save")
    public R save(@RequestBody PunishmentQueryEntity punishmentQuery){
		punishmentQueryService.save(punishmentQuery);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("ybj:punishmentquery:update")
    public R update(@RequestBody PunishmentQueryEntity punishmentQuery){
		punishmentQueryService.updateById(punishmentQuery);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("ybj:punishmentquery:delete")
    public R delete(@RequestBody String[] idYbjPunishmentQuerys){
		punishmentQueryService.removeByIds(Arrays.asList(idYbjPunishmentQuerys));

        return R.ok();
    }

}
