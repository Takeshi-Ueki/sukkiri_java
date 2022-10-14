package jissen_chapter1;

public class Account {
	String accountNo;
	
	public boolean equals(Object obj) {
		if (obj == this) return true;
		if (obj == null) return false;
		if (!(obj instanceof Account)) return false;
		Account r = (Account)obj;
		if  (!this.accountNo.trim().equals(r.accountNo.trim())) {
			return false;
		}
		return true;
	}
}
