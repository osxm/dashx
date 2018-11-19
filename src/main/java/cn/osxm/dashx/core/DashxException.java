/**
 * @Title: DashxException.java
 * @Package cn.osxm.dashx.core
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018年11月20日 上午5:28:41
 * @version V1.0
 */

package cn.osxm.dashx.core;

/**
 * @ClassName: DashxException
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class DashxException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DashxException(String errMsg) {
		super(errMsg);
	}
}
