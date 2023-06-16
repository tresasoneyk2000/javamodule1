package problem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class luckynum {

	public static void main(String[] args) {
		int[] arr= {1,2,2,3,3,3};
		int count=0;
		
		Map<Integer,Integer> m=new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
            if(m.containsKey(arr[i])){
                int n=m.get(arr[i])+1;
                m.put(arr[i],n);
            }
            else{
                m.put(arr[i],1);
            }
        }
        System.out.println(m);
        int max=0;
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
        	int key=entry.getKey();
        	int val=entry.getValue();
        	if(key==val) {
        		if(key>max) {
        			max=key;
        		}
        	}
        	}
       System.out.println(max);
        
       Set<Integer> mySet = new HashSet<>();
       mySet.add(1);
       mySet.add(2);
       mySet.add(3);

       Integer[] myArray = new Integer[mySet.size()];
       mySet.toArray(myArray);
       for(int i=0;i<myArray.length;i++) {
    	   System.out.println(myArray[i]);
       }
       for(int i:myArray) {
    	   System.out.println(i);
    	   
       }
        	
       
	}

}
