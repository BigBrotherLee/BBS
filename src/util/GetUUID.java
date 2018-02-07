package util;

import java.util.UUID;

public class GetUUID {
	public String getUUID() {
		return UUID.randomUUID().toString().replace("-", "").toUpperCase();
	}
	
}
