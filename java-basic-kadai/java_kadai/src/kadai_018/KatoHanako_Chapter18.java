package kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18 {

	public KatoHanako_Chapter18() {

	}

	//	名前をgevenNameにセットする
	public void setGevenName(String name) {
		this.gevenName = name;
		System.out.println("加藤家の【" + this.gevenName + "】を作成しました。");

	}

	//	個別部分の紹介
	public void eachintroduce() {
		System.out.println("趣味は読書です");
	};

}
