package curriculum23;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Lion lion = new Lion();
		//setterで値を取得
		lion.setName("ライオン", 2.1, 80);
		//getterで値を取得
		System.out.println("動物名: " + lion.getname());
		System.out.println("体長: " + lion.getlength() + "m");
		System.out.println("速度: " + lion.getspeed() + "km/h");
	}

}
//動物名：ライオン
//体長：2.1m
//速度：80km/h