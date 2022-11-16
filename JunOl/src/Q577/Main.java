package Q577;

import java.util.Scanner;

public class Main {
	void end1(int x, int y){
		int result1,result2;
		if(x>y)
		{
			result1 = x/2;
			result2 = y*2;
			System.out.println(result1+" "+result2);
		}
		else
		{
			result2 = y/2;
			result1 = x*2;
			System.out.println(result1+" "+result2);
		}
	}

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		int inp1 = inp.nextInt();
		int inp2 = inp.nextInt();
		inp.close();
		
		Main com = new Main();
		
		com.end1(inp1, inp2);		
	}
}