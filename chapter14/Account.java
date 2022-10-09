package chapter14;

public class Account {
	String accountNumber;
	int balance;

	public String toString() {
		return "￥" + this.balance + "(口座番号:" + accountNumber + ")";
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Account) {
			Account a = (Account) obj;
			String an1 = this.accountNumber.trim();
			String an2 = a.accountNumber.trim();
			if (an1.equals(an2)) {
				return true;
			}
		}
		return false;
	}
}
