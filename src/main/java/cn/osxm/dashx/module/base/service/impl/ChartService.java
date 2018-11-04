/**
 * @Title: ChartService.java
 * @Package cn.oscar.dashx.module.base.service.impl
 * @Description: TODO
 * @author xueming.chen
 * @date 2018年11月4日 上午8:53:09
 * @version V1.0
 */

package cn.osxm.dashx.module.base.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import cn.osxm.dashx.module.base.dao.ChartMapper;
import cn.osxm.dashx.module.base.model.Chart;
import cn.osxm.dashx.module.base.service.ChartServiceI;

/**
  * @ClassName: ChartService
  * @Description: TODO
  * @author xueming.chen
  */

public class ChartService implements ChartServiceI {
	  public ChartMapper chartMapper;    

	    @Autowired
	    public void setChartMapper(ChartMapper chartMapper) {
	      this.chartMapper = chartMapper;
	    }
	    
	    public Chart getChart(long id) {
	    	Chart chart = chartMapper.getChart(id);
	    	return chart;
	    }
}
