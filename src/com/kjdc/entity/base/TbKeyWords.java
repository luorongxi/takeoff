package com.kjdc.entity.base;

import java.sql.Timestamp;

/**  
 * @类功能说明：  关键字过滤实体类.
 * @类修改者：  
 * @修改日期： 
 * @修改说明：  
 * @公司名称：****信息科技有限公司  
 * @作者：lrx  
 * @创建时间：2015-4-17 下午12:35:33  
 * @版本：V1.0  
 */
public class TbKeyWords implements java.io.Serializable {

	/**  
	 * @Fields  serialVersionUID : versionUID
	 */
	private static final long serialVersionUID = -5095236716565215903L;
	// Fields

	/**  
	 * @Fields  id : 主键id
	 */
	private Integer id;
	/**  
	 * @Fields  keyWord : 关键字
	 */
	private String keyWord;
	/**  
	 * @Fields  addTime : 创建时间
	 */
	private Timestamp addTime;

	// Constructors

	/** default constructor */
	public TbKeyWords() {
	}

	/** full constructor */
	public TbKeyWords(String keyWord, Timestamp addTime) {
		this.keyWord = keyWord;
		this.addTime = addTime;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getKeyWord() {
		return this.keyWord;
	}

	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

	public Timestamp getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}

	@Override
	public String toString() {
		return "TbKeyWords [id=" + id + ", keyWord=" + keyWord + ", addTime="
				+ addTime + "]";
	}

}