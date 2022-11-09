package koma;

import java.util.ArrayList;
import java.util.List;

import banmen.Banmen;

public abstract class KomaClass {
	// imaフィールドは仮想の座標
	// 先手の駒はこれをそのまま使い、後手番はこれを点対象にひっくり返したものを座標とする
	// 思考部分では実際の座標を入れるが、
	// オブジェクト内で済ませる利きの計算なんかはここを使って後でひっくり返す。
	int imaGyou ;
	int imaRetsu ;
	int gyou ;
	int retsu ;
	
	String komaName;
	//以上の四つはいずれも1～9の数字しか入らない。
	
	//どっちの手番の物かを示すフィールド
	//falseなら後手
	boolean teban ; 
	
	//成りか不成か示すフィールド
	//trueだと成っている。
	boolean nari = false;
	
	//
	
	List<int[]> kiki = new ArrayList<int[]>();
	
	
	
	public KomaClass(int imaGyou, int imaRetsu, boolean teban) {
		super();
		this.imaGyou = imaGyou;
		this.imaRetsu = imaRetsu;
		this.teban = teban;
		
		if(teban) {
			gyou = imaGyou;
			retsu = imaRetsu;
		}else {
			gyou = tenchi(imaGyou);
			retsu = tenchi(imaRetsu);
		}
	}
	
	public void move(int gyou,int retsu) {
		if (kiki.contains(new int[] {gyou,retsu})) {
			this.gyou = gyou;
			this.retsu = retsu;
			if (!teban){
				imaGyou = tenchi(gyou);
				imaRetsu = tenchi(retsu);
			} else {
				imaGyou = gyou;
				imaRetsu = retsu;
			}
		} else {
			System.out.println("error");
		}
		
		
	};
	
	
	//駒の利きを計算する。
	abstract void kikiAcu() ;
	
	
	//後手の場合、これで座標をひっくり返す。
	ArrayList<int[]> tenchi(ArrayList<int[]>imaKikiList){
		int i = 0;
		ArrayList<int[]> retList = new ArrayList<int[]>();
		while(true) {
			int [] tuple = imaKikiList.get(i); 
			retList.add(new int[] {10-tuple[0],10-tuple[1]});
			i++;
			if(i == imaKikiList.size()) {
				break;
			}
		}
		return retList;
		
	}
	int tenchi(int zahyo) {
		return 10-zahyo;
	}

	int[] banmenHantei(int[] tuple,boolean teban) {
		
		if(!(tuple[0]<10 && tuple[0]>0)&&(tuple[1]<10 && tuple[1]>0)) {
			return new int[] {};
	
		}
		if(teban) {
			if(Banmen.senteKomaSonzaiList.contains(tuple)) {
				return new int[] {};
			}
		}else {
			if(Banmen.goteKomaSonzaiList.contains(tuple)) {
				return new int[] {};
			}
			
		}
		return tuple;
		
			
		
	}
	
	
	
	//ここからゲッター
	public int getImaGyou() {
		return imaGyou;
	}

	public int getImaRetsu() {
		return imaRetsu;
	}

	public int getGyou() {
		return gyou;
	}

	public int getRetsu() {
		return retsu;
	}

	public String getKomaName() {
		return komaName;
	}

	public boolean isTeban() {
		return teban;
	}

	public boolean isNari() {
		return nari;
	}

	public List<int[]> getKiki() {
		return kiki;
	}
	
	
	

}
