package koma;

import java.util.ArrayList;

public class Hohei extends KomaClass {

	
	public void move() {
		this.retsu++; 
	}
	
	public void kikiAcu(){
		kiki.clear();
		ArrayList<int[]> retList = new ArrayList<int[]>();
		retList.add(new int[]{gyou++,retsu});
		
		if(teban) {
			kiki=retList;
		}else {
			tenchi(retList);
		}
		
	} ;
}
