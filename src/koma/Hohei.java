package koma;

import java.util.ArrayList;

public class Hohei extends KomaClass {

	public Hohei(int imaGyou, int imaRetsu, boolean teban) {
		super(imaGyou, imaRetsu, teban);
		// TODO 自動生成されたコンストラクター・スタブ
		
		komaName = "歩";
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
