package mainEngine;

import java.util.Arrays;

import banmen.Banmen;
import koma.KomaClass;

public class Main {
	public static void main(String[] args) {
		
		showBan();
	}
	
	
	public static void showBan() {
		String[][] ban = new String[][]{{"□","□","□","□","□","□","□","□","□","□"},
			{"□","□","□","□","□","□","□","□","□","□"},
			{"□","□","□","□","□","□","□","□","□","□"},
			{"□","□","□","□","□","□","□","□","□","□"},
			{"□","□","□","□","□","□","□","□","□","□"},
			{"□","□","□","□","□","□","□","□","□","□"},
			{"□","□","□","□","□","□","□","□","□","□"},
			{"□","□","□","□","□","□","□","□","□","□"},
			{"□","□","□","□","□","□","□","□","□","□"},
			{"□","□","□","□","□","□","□","□","□","□"}};
			
		Banmen banmen = new Banmen();
		for (int i = 1; i<10;i++) {
			ban[i][0] = " "+String.valueOf(i);
			ban[0][i] = " "+String.valueOf(10-i);
			
		}
		
		for (KomaClass k :banmen.komaList) {
			ban[k.getGyou()][k.getRetsu()]=k.getKomaName();
		}
		for(int l = 0;l<10;l++) {
		Arrays.stream(ban[l]).forEach(System.out::print);
		System.out.println();
		}
	}
}
