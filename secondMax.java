import java.io.*;
import java.util.Scanner;

public class secondMax {
	public static void main(String args[]) throws IOException {
		Scanner scanner = new Scanner(new File("test.inp"));
		BufferedWriter out = new BufferedWriter(new FileWriter("test.out"));

		int tmp;
		int inpNum;
		int[] result = {0, 0};
		int N;

		N = scanner.nextInt();

		System.out.println(N);

		for(int i = 0; i < N; i++) {
			inpNum = scanner.nextInt();
			if(result[0] < inpNum) {
				tmp = result[0];
				result[0] = inpNum;
				result[1] = tmp;
			} else if(result[1] < inpNum) {
				result[1] = inpNum;
			}
		}

		System.out.println(result[0] + " " + result[1]);
		out.write(result[0] + " " + result[1]);
		out.close();
	}
}
