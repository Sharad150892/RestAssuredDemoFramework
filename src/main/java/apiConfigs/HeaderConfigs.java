package apiConfigs;

import java.util.HashMap;
import java.util.Map;

public class HeaderConfigs {

	public Map<String, String> defaultHeaders() {

		Map<String, String> defaultHeaders = new HashMap<String, String>();
		defaultHeaders.put("Content-Type", "application/json");

		return defaultHeaders;

	}

	public Map<String, String> headersWithToken() {

		Map<String, String> defaultHeaders = new HashMap<String, String>();
		defaultHeaders.put("Content-Type", "application/json");
		defaultHeaders.put("Acess_Token", "bshufsjifjsljfsfdsjlsdj");
		defaultHeaders.put("jwt_token", "bshufsfsfsfkmjsljfsfdsjlsdj");
		
		return defaultHeaders;
	}

}
