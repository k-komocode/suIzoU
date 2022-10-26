package koma;

import java.util.ArrayList;

public class GinShou extends KomaClass {
	

	
	public GinShou(int imaGyou, int imaRetsu, boolean teban) {
		super(imaGyou, imaRetsu, teban);
		// TODO 自動生成されたコンストラクター・スタブ
		komaName="銀";
	}

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
