package com.ntsybj.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 处罚信息表
 * 
 * @author Alan
 * @email 
 * @date 2022-07-12 15:44:50
 */
@Data
@TableName("ybj_punished_info")
public class PunishedInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	private Integer idYbjPunishedInfo;
	/**
	 * 处罚报送信息表主键
	 */
	private String idYbjPunishmentSubmitInfo;
	/**
	 * 处罚类别
	 */
	private String punishCategory;
	/**
	 * 处罚种类
	 */
	private String punishType;
	/**
	 * 处罚时间
	 */
	private String punishDate;
	/**
	 * 处罚期限
	 */
	private String penaltyTerm;
	/**
	 * 解除时间
	 */
	private String liftTime;
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
