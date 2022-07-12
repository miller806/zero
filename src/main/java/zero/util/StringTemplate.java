package zero.util;

import zero.PropertiesProvider;

import java.util.Iterator;
import java.util.Map;

/**
 * 
 * @author miller
 * @email miller(a)gmail.com
 */
public class StringTemplate {

	private String str;
	private Map params;
	
	public StringTemplate(String str, Map params) {
		this.str = str;
		this.params = params;
	}

	public String toString() {
		String  result = str;
		for(Iterator it = params.entrySet().iterator(); it.hasNext(); ) {
			Map.Entry entry = (Map.Entry)it.next();
			String key = (String)entry.getKey();
			Object value = entry.getValue();
			String strValue = value == null ? "" : value.toString();
			if("className".equals(key)){
				strValue = strValue.replace(PropertiesProvider.getProperty("prefix"), "");
			}
			result = StringHelper.replace(result, "${"+key+"}", strValue);
		}
		return result;
	}
	
	
}
