package listdemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TestTreeMap {//treeMAP gives pair in order
// tree map doesnot allow null
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<String,String> countryCurr = new TreeMap<>();
		
		countryCurr.put("IND", "Rupe");
		countryCurr.put("USA", "Dollar");
		countryCurr.put("UK", "Pound");
//		countryCurr.put(null, null);
//		countryCurr.put(null, null);
		System.out.println(countryCurr);
		//countryCurr.g
		
		System.out.println(countryCurr.get("IND"));
		
		countryCurr.put("IND", "Rupee");// value can overriden by searching the key
		System.out.println(countryCurr);
		
		System.out.println(countryCurr.size());
		System.out.println(countryCurr.containsKey("UK"));
		System.out.println(countryCurr.containsValue("Pound"));
		
		//HashMap has 3 views
		// 1 key view
		
		Set<String> keys= countryCurr.keySet();
		System.out.println(keys);
		for(String key:keys) {
			System.out.println(key);
		}
		
		// 2 value view
		
		Collection<String> values = countryCurr.values();
		
	//	Set<String> v=countryCurr.values();
		
		for(String value:values) {
			System.out.println(value);
		}
		// 3 key value set we cALL It as entry set
		
		Set<Entry<String,String>> entries= countryCurr.entrySet();
		for(Entry<String,String> entry:entries) {
			System.out.println(entry);
		}
	}

}
