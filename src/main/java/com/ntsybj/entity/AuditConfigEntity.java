package com.ntsybj.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 审核配置表
 * 
 * @author Alan
 * @email 
 * @date 2022-07-12 15:44:50
 */
@Data
@TableName("ybj_audit_config")
public class AuditConfigEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	private Integer idYbjAuditConfig;
	/**
	 * 处罚报送是否需要监管部门审批 1是 0否
	 */
	private String submitStatus;
	/**
	 * 处罚变更是否需要监管部门审批 1是 0否
	 */
	private String editStatus;
	/**
	 * 处罚查询是否需要监管部门审批 1是 0否
	 */
	private String queryStatus;
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
