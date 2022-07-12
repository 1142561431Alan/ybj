package com.ntsybj.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 数据字典表
 * 
 * @author Alan
 * @email 
 * @date 2022-07-12 15:44:50
 */
@Data
@TableName("ybj_data_dict")
public class DataDictEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	private Integer id;
	/**
	 * 业务类型(详见枚举定义)
	 */
	private String businessType;
	/**
	 * 类型(根据业务类型 定义具体类型)
	 */
	private String type;
	/**
	 * 编码
	 */
	private String code;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 父级编码
	 */
	private String parentCode;
	/**
	 * 顺序
	 */
	private Integer sort;
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
