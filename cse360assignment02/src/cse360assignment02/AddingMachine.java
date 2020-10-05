package cse360assignment02;

public class AddingMachine {
	private int total;
	private String history = "0 ";


	public AddingMachine() {
		total = 0; // not needed - included for clarity
	}

	public int getTotal() {
		return total; // changed to return current total
	}

	public void add(int value) {
		total += value; // changed to add value to total
		history +=  "+ " + value + " ";
	}

	public void subtract(int value) {
		total -= value; // changed to subtract value from total
		history +=  "- " + value + " ";
	}

	public String toString() {
		return history;
	}

	public void clear() {
		history = "0 ";
	}

}
