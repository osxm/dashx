/**
 * @Title: ChartService.java
 * @Package cn.oscar.dashx.module.base.service.impl
 * @Description: TODO
 * @author xueming.chen
 * @date 2018年11月4日 上午8:53:09
 * @version V1.0
 */

package cn.osxm.dashx.module.base.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.osxm.dashx.core.DashxException;
import cn.osxm.dashx.module.base.dao.ChartMapper;
import cn.osxm.dashx.module.base.model.Chart;
import cn.osxm.dashx.module.base.service.ChartServiceI;

/**
 * @ClassName: ChartService
 * @Description: TODO
 * @author xueming.chen
 */
@Service
public class ChartService implements ChartServiceI {
	private ChartMapper chartMapper;

	@Autowired
	public void setChartMapper(ChartMapper chartMapper) {
		this.chartMapper = chartMapper;
	}

	public List<Chart> getAllCharts() {
		return chartMapper.getAll();
	}

	public Chart getChart(long id) {
		Chart chart = chartMapper.get(id);
		return chart;
	}

	public int add(Chart chart) throws DashxException {
		if (chart.getName() == null || chart.getName().trim().length() < 1) {
			throw new DashxException("Chart Name is null.");
		}
		return chartMapper.add(chart);
	}

	public int delete(long id) {
		return chartMapper.delete(id);
	}

	// @Transactional(propagation = Propagation.NOT_SUPPORTED)
	// @Transactional(propagation = Propagation.NEVER)
	public int update(Chart chart) {
		return chartMapper.update(chart);
	}
}
