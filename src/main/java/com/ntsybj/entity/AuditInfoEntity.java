package com.ntsybj.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 审核信息表
 * 
 * @author Alan
 * @email 
 * @date 2022-07-12 15:44:50
 */
@Data
@TableName("ybj_audit_info")
public class AuditInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	private Integer idYbjAuditInfo;
	/**
	 * 处罚报送信息表主键
	 */
	private String idYbjPunishmentSubmitInfo;
	/**
	 * 审核类型(0 submit,1 edit, 2 query)
	 */
	private String auditType;
	/**
	 * 审核状态(0为审核中，1为审核失败，2为审核通过)
	 */
	private String auditStatus;
	/**
	 * 审核人um
	 */
	private String auditUm;
	/**
	 * 审核人姓名
	 */
	private String auditName;
	/**
	 * 审核人描述
	 */
	private String auditDesc;
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
