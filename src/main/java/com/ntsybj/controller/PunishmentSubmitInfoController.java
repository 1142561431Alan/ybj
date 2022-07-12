package com.ntsybj.controller;

import java.util.Arrays;
import java.util.Map;

import com.ntsybj.common.utils.PageUtils;
import com.ntsybj.entity.PunishmentSubmitInfoEntity;
import com.ntsybj.service.PunishmentSubmitInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.ntsybj.entity.R;



/**
 * 处罚报送表
 *
 * @author Alan
 * @email 
 * @date 2022-07-12 15:44:50
 */
@RestController
@RequestMapping("ybj/punishmentsubmitinfo")
public class PunishmentSubmitInfoController {
    @Autowired
    private PunishmentSubmitInfoService punishmentSubmitInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("ybj:punishmentsubmitinfo:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = punishmentSubmitInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{idYbjPunishmentSubmitInfo}")
    //@RequiresPermissions("ybj:punishmentsubmitinfo:info")
    public R info(@PathVariable("idYbjPunishmentSubmitInfo") String idYbjPunishmentSubmitInfo){
		PunishmentSubmitInfoEntity punishmentSubmitInfo = punishmentSubmitInfoService.getById(idYbjPunishmentSubmitInfo);

        return R.ok().put("punishmentSubmitInfo", punishmentSubmitInfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("ybj:punishmentsubmitinfo:save")
    public R save(@RequestBody PunishmentSubmitInfoEntity punishmentSubmitInfo){
		punishmentSubmitInfoService.save(punishmentSubmitInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("ybj:punishmentsubmitinfo:update")
    public R update(@RequestBody PunishmentSubmitInfoEntity punishmentSubmitInfo){
		punishmentSubmitInfoService.updateById(punishmentSubmitInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("ybj:punishmentsubmitinfo:delete")
    public R delete(@RequestBody String[] idYbjPunishmentSubmitInfos){
		punishmentSubmitInfoService.removeByIds(Arrays.asList(idYbjPunishmentSubmitInfos));

        return R.ok();
    }

}
