/**
 * @Title: ChartMapper.java
 * @Package cn.oscar.dashx.module.base.dao
 * @Description: TODO
 * @author xueming.chen
 * @date 2018年11月4日 上午9:06:12
 * @version V1.0
 */

package cn.oscar.dashx.module.base.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cn.oscar.dashx.module.base.model.Chart;

/**
 * @ClassName: ChartMapper
 * @Description: TODO
 * @author xueming.chen
 */

public interface ChartMapper {
	@Select("SELECT * FROM base_chart WHERE id = #{id}")
	Chart getChart(@Param("id") long id);
}
