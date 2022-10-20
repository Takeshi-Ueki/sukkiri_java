package jissen_chapter2.chapter2_3;

//  import することで Account.FUTSU から FUTSU に省略できる
import static jissen_chapter2.chapter2_3.AccountType.*;;

public class Main {
	public static void main(String[] args) {
		Account a = new Account("1732050", FUTSU);

		System.out.println(a.getAccountNo());
	}
}
