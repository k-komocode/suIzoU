package koma;

import java.util.ArrayList;

public class GinShou extends KomaClass {
	

	
	public void kikiAcu(int gyou,int retsu){
		ArrayList<int[]> retList = new ArrayList<int[]>();
		retList.add(new int[]{gyou++,retsu});
		retList.add(new int[]{gyou++,retsu++});
		retList.add(new int[]{gyou++,retsu--});
		retList.add(new int[]{gyou--,retsu--});
		retList.add(new int[]{gyou--,retsu++});
		
		
		if(teban) {
			kiki=retList;
		}else {
			tenchi(retList);
		}
	} ;
}
