import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of rings: ");
        int rings = scanner.nextInt();

        int moves = towerOfHanoi(rings);

        if (moves == -1) {
        	 System.out.println("Invalid input. Must be 3 or more rings.");
    	 } else {
            System.out.println("Minimum number of moves: " + moves);
        }
    }

	public static int towerOfHanoi(int num) {
        if (num < 3) {
            return -1;
        }
		
        if (num == 3) {
            return 7;
        }

        return 2 * towerOfHanoi(num - 1) + 1;
    }

	public static void q1() {
		//Write question 1 code here
	}

	public static void q2() {
		//Write question 2 code here
	}

	public static void q3() {
		//Write question 3 code here
	}

	public static void q4() {
		//Write question 4 code here
	}

	public static void q5() {
		//Write question 5 code here
	}

}
