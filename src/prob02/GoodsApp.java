package prob02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Goods[] goodsArray = new Goods[COUNT_GOODS];
		
		for(int i = 0; i < COUNT_GOODS; i++) {
			int goodsNum = 1;
			String info = scanner.nextLine();
			String[] data = info.split(" ");
			
			String name = data[0];
			int price = Integer.parseInt(data[1]);	//누운글씨 : static 메소드.
			int countStock = Integer.parseInt(data[2]);
			
			goodsArray[i] = new Goods(name, price, countStock);
		}
		
		for(int j = 0; j < COUNT_GOODS; j++) {
			String name = goodsArray[j].getName();
			int price = goodsArray[j].getPrice();
			int countStock = goodsArray[j].getCountStock();
			
			System.out.println(name+"(가격:"+price+")이 "+countStock+"개 입고 되었습니다.");
		}		
		
		scanner.close();
	}
}
