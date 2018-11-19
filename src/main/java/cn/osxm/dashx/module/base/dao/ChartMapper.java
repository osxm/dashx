/**
 * @Title: ChartMapper.java
 * @Package cn.oscar.dashx.module.base.dao
 * @Description: TODO
 * @author xueming.chen
 * @date 2018年11月4日 上午9:06:12
 * @version V1.0
 */

package cn.osxm.dashx.module.base.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.osxm.dashx.module.base.model.Chart;

/**
 * @ClassName: ChartMapper
 * @Description: TODO
 * @author xueming.chen
 */

public interface ChartMapper {
	/**
	 * 
	 * @Title: getAllCharts
	 * @Description: TODO
	 * @return
	 */
	@Select("SELECT * FROM base_chart")
	public List<Chart> getAll();

	/**
	 * 
	 * @Title: getChart
	 * @Description: TODO
	 * @param id
	 * @return
	 */
	@Select("SELECT * FROM base_chart WHERE id = #{id}")
	public Chart get(@Param("id") long id);

	/**
	 * 
	 * @Title: add
	 * @Description: Mybatis-Spring defaultAutoCommit is true. so even you not set
	 *               transactionManager in spring, it also commit
	 * @param chart
	 * @return
	 */
	@Insert("insert into base_chart(name,description) values(#{name},#{description})")
	public int add(Chart chart);

	/**
	 * 
	 * @Title: delete
	 * @Description: TODO
	 * @param id
	 * @return
	 */
	@Delete("delete from base_chart where id=#{id}")
	public int delete(long id);

	/**
	 * 
	 * @Title: update
	 * @Description: TODO
	 * @param chart
	 * @return
	 */
	@Update("update base_chart set name=#{name},description=#{description} where id=#{id}")
	public int update(Chart chart);

}
