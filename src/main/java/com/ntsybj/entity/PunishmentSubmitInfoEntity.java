package com.ntsybj.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 处罚报送表
 * 
 * @author Alan
 * @email 
 * @date 2022-07-12 15:44:50
 */
@Data
@TableName("ybj_punishment_submit_info")
public class PunishmentSubmitInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	private String idYbjPunishmentSubmitInfo;
	/**
	 * 被处罚人姓名
	 */
	private String punishedName;
	/**
	 * 性别(0 女,1 男)
	 */
	private String gender;
	/**
	 * 用工身份
	 */
	private String employmentStatus;
	/**
	 * 证书类型
	 */
	private String certificateType;
	/**
	 * 证件号码
	 */
	private String idNumber;
	/**
	 * 最高学历
	 */
	private String highestEducation;
	/**
	 * 政治面貌
	 */
	private String politicsStatus;
	/**
	 * 处罚机构名称
	 */
	private String punishOrgName;
	/**
	 * 所在机构层级
	 */
	private String occurredOrgLevel;
	/**
	 * 被处罚行为发生场所在机构名称
	 */
	private String punishedOccurredOrgName;
	/**
	 * 被处罚行为发生场所在部门
	 */
	private String punishedOccurredDeptName;
	/**
	 * 被处罚时岗位、职务
	 */
	private String punishedOccurredPost;
	/**
	 * 是否具有董(理)事、监事、高管任职资格
	 */
	private String seniorExecutiveState;
	/**
	 * 董(理)事、监事、高管任职文件
	 */
	private String seniorExecutiveFile;
	/**
	 * 董(理)事、监事、高管任职开始时间
	 */
	private String seniorExecutiveDate;
	/**
	 * 违法违规违纪基本事实
	 */
	private String illegalBrassTacks;
	/**
	 * 处罚依据
	 */
	private String punishedBasis;
	/**
	 * 填报部门
	 */
	private String fillDept;
	/**
	 * 填报时间
	 */
	private Date fillDate;
	/**
	 * 填报人
	 */
	private String informant;
	/**
	 * 联系电话
	 */
	private String phone;
	/**
	 * 填报部门负责人
	 */
	private String fillDeptHead;
	/**
	 * 联系电话
	 */
	private String mobilePhone;
	/**
	 * 审核状态(null为未提交,0为审核中，1为审核失败，2为审核通过)
	 */
	private String auditStatus;
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
