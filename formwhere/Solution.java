package helpinstudy.com.formwhere;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {
			Map<String, String> map = new HashMap<>();
			map.put("name", "Ivanov");
			map.put("country", "Ukraine");
			map.put("city", "Kiev");
			map.put("age", null);
			StringBuilder str = getCondition(map);
			System.out.println(str.toString());
	}

	public static StringBuilder getCondition(Map<String, String> params) {
        StringBuilder strBld = new StringBuilder();
        int i = 0;
        for(Map.Entry<String, String> pair : params.entrySet()) {
        	if(pair.getKey() != null && pair.getValue() != null) {
        		if (i > 0)
        			strBld.append(" and ");
        		i++;
        		String str = String.format("%s = '%s'", pair.getKey(), pair.getValue());
        		strBld.append(str);
        	}
        }
        return strBld;
    }
}
