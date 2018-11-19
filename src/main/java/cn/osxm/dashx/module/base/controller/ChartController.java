/**
 * @Title: ChartController.java
 * @Package cn.osxm.dashx.module.base.controller
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018年11月20日 上午5:36:32
 * @version V1.0
 */

package cn.osxm.dashx.module.base.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.osxm.dashx.core.DashxException;
import cn.osxm.dashx.module.base.model.Chart;
import cn.osxm.dashx.module.base.service.impl.ChartService;

/**
 * @ClassName: ChartController
 * @Description: TODO
 * @author osxm:oscarxueming
 */
@Controller
@RequestMapping("/chart")
public class ChartController {
	@Autowired
	private ChartService chartService;

	@RequestMapping("/list")
	public ModelAndView list(ModelAndView modelAndView) {
		List<Chart> charts = chartService.getAllCharts();
		modelAndView.addObject("charts", charts);
		modelAndView.setViewName("ChartList");
		return modelAndView;
	}

	@RequestMapping("/add")
	public ModelAndView add(ModelAndView modelAndView) {
		modelAndView.setViewName("ChartAdd");
		return modelAndView;
	}

	@RequestMapping("/addPost")
	public ModelAndView addPost(Chart chart, ModelAndView modelAndView) {
		modelAndView.setViewName("ChartAdd");
		try {
			chartService.add(chart);
		} catch (DashxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		modelAndView.addObject("chart", chart);
		return modelAndView;
	}
}
