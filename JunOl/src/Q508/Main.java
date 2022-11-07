package Q508;

public class Main{
	public static void main(String[] args) {
		System.out.printf("%10s%10s%10s\n","item","count","price");
		System.out.printf("%10s%10d%10d\n","pen",20,100);
		System.out.printf("%10s%10d%10d\n","note",5,95);
		System.out.printf("%10s%10d%10d","eraser",110,97);
	} 
}

/* 선생님 풀이 */
//public class Main{
//	public static void main(String[] args) {
//		System.out.printf("%10s%10s%10s\n","item","count","price");
//		System.out.printf("%10s%10s%10s\n","pen","20","100");
//		System.out.printf("%10s%10s%10s\n","note","5","95");
//		System.out.printf("%10s%10s%10s","eraser","110","97");
//	} 
//}

////배열과 반복제어문을 이용하여 풀이
//String[] str = { "item", "count", "price",
//        "pen", "20", "100",
//        "note", "5", "95",
//        "erase", "110", "97" };
//  for (int i = 0; i <= 11; i++) {
//     if ((i % 3) == 0 && i != 0) {
//        System.out.printf("\n");
//     }
//     System.out.printf("%10s", str[i]);
//  }
