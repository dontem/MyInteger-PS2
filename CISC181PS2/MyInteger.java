package MainPackage;

//Class name is MyInteger

public class MyInteger {
	private int value;

	// MyInteger object has a specified value
	public MyInteger(int a) {
		this.value = a;

	}

	// Get method will return the value
	public int GetValue() {
		return value;
	}

	// Even method returns false if not divisible by 2
	public boolean isEven() {
		if (GetValue() % 2 != 0) {
			return false;

			// Returns true if even
		} else
			return true;

	}

	// Odd method returns false if divisible by 2
	public boolean isOdd() {
		if (GetValue() % 2 == 0) {
			return false;
			// Returns true if odd
		} else
			return true;

	}

	// Prime method checks if value is divisible by itself.
	public boolean isPrime() {

		// For loop runs from 2 and increments by 1 until value is reached
		for (int i = 2; i < this.GetValue(); i++) {
			// Statement returns false if value is not divisible by itself
			if (GetValue() % i == 0) {
				return false;
			}

			// Returns true if prime
		}
		return true;
	}

	// Same even method as previous code but with parameter d
	public static boolean isEven(int d) {
		if (d % 2 != 0) {
			return false;

		} else
			return true;

	}

	// Same odd method as previous code but with parameter d
	public static boolean isOdd(int d) {
		if (d % 2 == 0) {
			return false;

		} else
			return true;

	}

	// Same prime method as previous code but with parameter d
	public static boolean isPrime(int d) {
		for (int i = 2; i < d; i++) {
			if (d % i == 0) {
				return false;
			}
		}
		return true;

	}

	// Even method now takes in a value from MyInteger object
	public static boolean isEven(MyInteger b) {
		if (b.GetValue() % 2 != 0) {
			return false;

		} else
			return true;

	}

	// Odd Method now takes a value from MyInteger object
	public static boolean isOdd(MyInteger b) {
		if (b.GetValue() % 2 == 0) {
			return false;

		} else
			return true;

	}

	// Prime method now takes in a value from MyInteger object
	public static boolean isPrime(MyInteger b) {
		for (int i = 2; i < b.GetValue(); i++) {
			if (b.GetValue() % i == 0) {
				return false;
			}
		}
		return true;
	}

	// Equals method compares parameter c to value from get method
	public boolean equals(int c) {
		if (c == this.GetValue())
			return true;

		else
			return false;
	}

	// Equals method compares value from MyInteger object to value from get
	// method
	public boolean equals(MyInteger b) {
		if (b.GetValue() == this.GetValue())
			return true;

		else
			return false;
	}

	// Takes in numeric character within the array
	public static int parseInt(char[] arr) {
		int a = 0;

		// Checks each numeric character in array
		for (int y = 0; y < arr.length;)
			a = arr[y];

		// Adds onto the numeric character
		a++;
		return a;
	}

	// Takes in string
	public static int parseInt(String s) {

		// Returns value of string
		return s.length();

	}
}
