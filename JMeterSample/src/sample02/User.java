package sample02;

public class User {

	int count = 0;
	User(int count) {
		this.count += count;
	}
	
	public int getCount() {
		return this.count;
	}
}
