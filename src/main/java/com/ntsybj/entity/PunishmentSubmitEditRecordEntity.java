package com.ntsybj.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 处罚报送详情变更记录表
 * 
 * @author Alan
 * @email 
 * @date 2022-07-12 15:44:50
 */
@Data
@TableName("ybj_punishment_submit_edit_record")
public class PunishmentSubmitEditRecordEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	private Integer idYbjPunishmentSubmitEditRecord;
	/**
	 * 处罚报送信息表主键
	 */
	private String idYbjPunishmentSubmitInfo;
	/**
	 * 变更项目
	 */
	private String changeProject;
	/**
	 * 变更前
	 */
	private String beforeChange;
	/**
	 * 变更后
	 */
	private String afterChange;
	/**
	 * 状态 1有效 0无效
	 */
	private String enableStatus;
	/**
	 * 创建时间
	 */
	private Date createDate;
	/**
	 * 创建人
	 */
	private String createBy;
	/**
	 * 更新时间
	 */
	private Date updateDate;
	/**
	 * 更新人
	 */
	private String updateBy;

}
