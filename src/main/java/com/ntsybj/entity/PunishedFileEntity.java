package com.ntsybj.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 处罚附件信息表
 * 
 * @author Alan
 * @email 
 * @date 2022-07-12 15:44:50
 */
@Data
@TableName("ybj_punished_file")
public class PunishedFileEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	private Integer idYbjPunishedFile;
	/**
	 * 父主键
	 */
	private String idParent;
	/**
	 * 文件名称
	 */
	private String fileName;
	/**
	 * 文件类型(0 报送信息 1 报送原件 2 查询承诺书 3 处罚html模板 4 处罚信息pdf)
	 */
	private String fileType;
	/**
	 * 文件完整路径
	 */
	private String filePath;
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
