package com.ntsybj.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.ntsybj.common.utils.PageUtils;
import com.ntsybj.entity.PunishedFileEntity;

import java.util.Map;

/**
 * 处罚附件信息表
 *
 * @author Alan
 * @email 
 * @date 2022-07-12 15:44:50
 */
public interface PunishedFileService extends IService<PunishedFileEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

