
package util;

import java.util.UUID;
/**
 * 得到UUID
 * @author li
 *
 */
public class GetUUID {
	/**
	 * 返回32位UUID，全部大写无分割
	 */
	public String getUUID() {
		return UUID.randomUUID().toString().replace("-", "").toUpperCase();
	}
	
}
