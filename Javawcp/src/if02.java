
public class if02 {
	public static void main(String[] args) {
		int n = 200000000;
		if (n < 5) {
			System.out.println(n + "５未満です");
		} else if (n < 10) {
			System.out.println(n + "１０未満です");
		} else if (n < 15) {
			System.out.println(n + "１５未満だよ");
		} else {
			System.out.println(n + "１５未満ではない");
		}
	}
}
