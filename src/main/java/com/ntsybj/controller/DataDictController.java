package com.ntsybj.controller;

import java.util.Arrays;
import java.util.Map;

import com.ntsybj.common.utils.PageUtils;
import com.ntsybj.entity.DataDictEntity;
import com.ntsybj.entity.R;
import com.ntsybj.service.DataDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;





/**
 * 数据字典表
 *
 * @author Alan
 * @email 
 * @date 2022-07-12 15:44:50
 */
@RestController
@RequestMapping("ybj/datadict")
public class DataDictController {
    @Autowired
    private DataDictService dataDictService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("ybj:datadict:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = dataDictService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("ybj:datadict:info")
    public R info(@PathVariable("id") Integer id){
		DataDictEntity dataDict = dataDictService.getById(id);

        return R.ok().put("dataDict", dataDict);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("ybj:datadict:save")
    public R save(@RequestBody DataDictEntity dataDict){
		dataDictService.save(dataDict);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("ybj:datadict:update")
    public R update(@RequestBody DataDictEntity dataDict){
		dataDictService.updateById(dataDict);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("ybj:datadict:delete")
    public R delete(@RequestBody Integer[] ids){
		dataDictService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
