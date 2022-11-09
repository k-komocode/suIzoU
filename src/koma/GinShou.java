package koma;

import java.util.ArrayList;

public class GinShou extends KomaClass {
	

	
	public GinShou(int imaGyou, int imaRetsu, boolean teban) {
		super(imaGyou, imaRetsu, teban);
		// TODO 自動生成されたコンストラクター・スタブ
		komaName="銀";
	}

	public void kikiAcu(){
		ArrayList<int[]> imaRetList = new ArrayList<int[]>();
		ArrayList<int[]> retList = new ArrayList<int[]>();
		
		//先に利く全てのマスを指定。
		//仮に盤外になっても指定
		imaRetList.add(new int[]{imaGyou++,imaRetsu});
		imaRetList.add(new int[]{imaGyou++,imaRetsu++});
		imaRetList.add(new int[]{imaGyou++,imaRetsu--});
		imaRetList.add(new int[]{imaGyou--,imaRetsu--});
		imaRetList.add(new int[]{imaGyou--,imaRetsu++});
		
		
		//ここで余計なものを削る。
		//例えば盤外に利いてる分とか
		
		for(int [] masu :imaRetList) {
			if(banmenHantei(masu, teban).length == 2) {
				retList.add(masu);
			}
		}
		
		if(teban) {
			kiki=retList;
		}else {
			kiki = tenchi(retList);
		}
	} ;
}
