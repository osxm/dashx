/**
 * @Title: ChartServiceTest.java
 * @Package cn.osxm.dashx.module.base
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018年11月4日 下午3:29:22
 * @version V1.0
 */

package cn.osxm.dashx.module.base;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import cn.osxm.dashx.module.base.model.Chart;
import cn.osxm.dashx.module.base.service.impl.ChartService;

/**
  * @ClassName: ChartServiceTest
  * @Description: TODO
  * @author osxm:oscarxueming
  */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"}) 
public class ChartServiceTest {

	@Autowired
	private ChartService chartService;
	
	@Test
	public void getChart() {
		Chart chart = chartService.getChart(1);
		assertTrue(chart.getName().equals("Hello World Chart"));
	}
}
