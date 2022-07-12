package com.ntsybj.controller;

import java.util.Arrays;
import java.util.Map;

import com.ntsybj.common.utils.PageUtils;
import com.ntsybj.entity.PunishedFileEntity;
import com.ntsybj.service.PunishedFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.ntsybj.entity.R;




/**
 * 处罚附件信息表
 *
 * @author Alan
 * @email 
 * @date 2022-07-12 15:44:50
 */
@RestController
@RequestMapping("ybj/punishedfile")
public class PunishedFileController {
    @Autowired
    private PunishedFileService punishedFileService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("ybj:punishedfile:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = punishedFileService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{idYbjPunishedFile}")
    //@RequiresPermissions("ybj:punishedfile:info")
    public R info(@PathVariable("idYbjPunishedFile") Integer idYbjPunishedFile){
		PunishedFileEntity punishedFile = punishedFileService.getById(idYbjPunishedFile);

        return R.ok().put("punishedFile", punishedFile);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("ybj:punishedfile:save")
    public R save(@RequestBody PunishedFileEntity punishedFile){
		punishedFileService.save(punishedFile);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("ybj:punishedfile:update")
    public R update(@RequestBody PunishedFileEntity punishedFile){
		punishedFileService.updateById(punishedFile);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("ybj:punishedfile:delete")
    public R delete(@RequestBody Integer[] idYbjPunishedFiles){
		punishedFileService.removeByIds(Arrays.asList(idYbjPunishedFiles));

        return R.ok();
    }

}
