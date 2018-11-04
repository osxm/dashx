/**
 * @Title: Chart.java
 * @Package cn.oscar.dashx.module.base.model
 * @Description: TODO
 * @author xueming.chen
 * @date 2018年11月4日 上午8:44:31
 * @version V1.0
 */

package cn.oscar.dashx.module.base.model;

/**
 * @ClassName: Chart
 * @Description: TODO
 * @author xueming.chen
 */

public class Chart {

	private Long id;

	private String name;

	private String description;

	public Long getId() {
	
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
	
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
	
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
