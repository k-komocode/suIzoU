package banmen;

import java.util.ArrayList;
import java.util.List;

import koma.GinShou;
import koma.Hisya;
import koma.Hohei;
import koma.Kakugyou;
import koma.Keima;
import koma.KinShou;
import koma.KomaClass;
import koma.Kyousya;
import koma.OuShou;

//盤の上に何があり、何が駒台にあるのかはこいつが管理。
public class Banmen {
	
	public List<KomaClass> komaList = new ArrayList<KomaClass>();
	
	
	public Banmen() {
		super();
		startGame();
	}


	//ゲームスタート。駒オブジェクトを生成し、初期配置に。
	public void startGame() {
		for(int i = 1;i<=9;i++) {
			komaList.add(new Hohei(7,i,true));
			komaList.add(new Hohei(7,i,false));
		}
		for(int i = -1; i<2; i=i+2) {
			komaList.add(new KinShou(9,5+i,true));
			komaList.add(new KinShou(9,5+i,false));
			komaList.add(new GinShou(9,5+i*2,true));
			komaList.add(new GinShou(9,5+i*2,false));
			komaList.add(new Keima(9,5+i*3,true));
			komaList.add(new Keima(9,5+i*3,false));
			komaList.add(new Kyousya(9,5+i*4,true));
			komaList.add(new Kyousya(9,5+i*4,false));

		}
		komaList.add(new OuShou(9, 5, true));
		komaList.add(new OuShou(9, 5, false));
		
		komaList.add(new Kakugyou(8, 8, true));
		komaList.add(new Kakugyou(8, 8, false));
		
		komaList.add(new Hisya(8, 2, true));
		komaList.add(new Hisya(8, 2, false));
		
	}

}
