package jissen_chapter2.chapter2_3;

//  列挙型を使用したAccountクラス
//  活用例 new Account("0000001", AccountType.FUTSU);
public class Account {
	private String accountNo;
	private int zandaka;
	private AccountType accountType;
	
	public Account(String aNo, AccountType aType) {
		this.accountNo = aNo;
		this.accountType = aType;
	}
	
	public String getAccountNo() {
		return accountNo;
	}
}
