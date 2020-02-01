

class for_each{
	public static void main(String[] args) {
		int nums[] = {1, 2, 3, 4, 5, 6};
		for(int x: nums){
			System.out.println(x+1 + " ");
		}


		String names[] = {"Amit", "Priya", "John", "Jane"};
		for(String name: names) {
			System.out.println("Hello "+name+" ");
		}
	}
}