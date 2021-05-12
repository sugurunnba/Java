package pra;

import java.io.IOException;

public class lesson5 {

	public static void main(String[] args) throws IOException {
//		5-1
//		BufferedReader br = new BufferedReader(
//				new InputStreamReader(System.in));
//		System.out.println("10個の数値を入力ください。入力した数値を2倍にして表示していきます。");
//		for(int i = 1; i <= 10; i++) {
//			int x = Integer.parseInt(br.readLine());
//			System.out.println(x * 2);
//		}
//		System.out.println("プログラムを終了します");
//		↓
//		↓
//		↓模範解答
//		BufferedReader br = new BufferedReader(
//				new InputStreamReader(System.in));
//		int values[] = new int[10];
//		System.out.println("10個の数値を入力ください。入力した数値を2倍にして表示していきます。");
//		for(int i = 0; i < 10; i++) {
//			values[i] = Integer.parseInt(br.readLine());
//		}
//		System.out.println();
//
//		for(int i = 0; i < 10; i++) {
//			System.out.println(values[i] * 2);
//		}

//		5-2
//		BufferedReader br = new BufferedReader(
//				new InputStreamReader(System.in));
//		int values[] = new int[10];
//		for(int i = 0; i < 10; i++) {
//			values[i] = Integer.parseInt(br.readLine());
//		}
//		for(int i = 9; i > -1; i--) {
//			System.out.println(values[i]);
//		}

//		5-3
//		BufferedReader br = new BufferedReader(
//				new InputStreamReader(System.in));
//		int values[] = new int[10];
//
//		for(int i = 0; i < 10; i++) {
//			values[i] = Integer.parseInt(br.readLine());
//		}
//		System.out.print("\n偶数:");
//		for(int n: values)
//			if((n % 2) == 0)
//				System.out.print(n + " ");
//		System.out.print("\n奇数:");
//		for(int n : values)
//			if(n % 2 != 0)
//				System.out.print(n + " ");

//		5-4
//		BufferedReader br = new BufferedReader(
//				new InputStreamReader(System.in));
//		int values[] = new int[10];
//		int total = 0;
//		int count = 0;
//		for(count = 0; count < 10 && total <= 100; count++) {
//			values[count] = Integer.parseInt(br.readLine());
//			total += values[count];
//		}
//
//		for(int i = 0; i < 10; i++ ) {
//			System.out.print("\n" + values[i]);
//		}

//		5-5
//		?
//		BufferedReader br = new BufferedReader(
//                new InputStreamReader( System.in ) );
//		int value = Integer.parseInt( br.readLine() );
//
//		int binary[] = new int[16];
//
//		for( int i = 15 ; i >= 0 ; i--, value /= 2 )
//		binary[i] = value % 2;
//
//		for( int i = 0 ; i < 16 ; i++ )
//		System.out.print( binary[i] );
		
//		5-6
//		答えを見て理解
//		BufferedReader br = new BufferedReader(
//                new InputStreamReader( System.in ) );
//		int kuku[][] = new int[9][];
//		
//		for( int i = 0 ; i < 9 ; i++ ){
//			kuku[i] = new int[9];
//			for( int j = 0 ; j < 9 ; j++ ) {
//				kuku[i][j] = ( i + 1 ) * ( j + 1 );
//			}
//		}
//		
//		for( int i = 0 ; i < 9 ; i++ ){
//			for( int j = 0 ; j < 9 ; j++ ) {
//				System.out.printf( " %2d", kuku[i][j] );
//				System.out.println();
//			}
//		}
		
//		5-7
//		BufferedReader br = new BufferedReader(
//				new InputStreamReader(System.in));
//		int kuku[][] = new int[9][];
//		
//		for(int i = 0; i < 9; i++) {
//			kuku[i] = new int[9];
//			for(int j = 0; j < 9; j++) {
//				kuku[i][j] = (i + 1) * (j + 1);
//			}
//		}
//		System.out.println("1 桁の数値（ 1 ～ 9 に限定）を２つ入力ください。入力した数値を掛け合わした結果を出力します。");
//		int left = Integer.parseInt(br.readLine());
//		int right = Integer.parseInt(br.readLine());
//		System.out.println(kuku[left - 1][right - 1]);
		
//		5-8
//		???
//		BufferedReader br = new BufferedReader(
//                new InputStreamReader( System.in ) );
//		int values[] = new int[10];
//		
//		for( int i = 0 ; i < 10 ; i++ )
//		values[i] = Integer.parseInt( br.readLine() );
//		
//		for( int i = 0 ; i < 10 ; i++ )
//		{
//		for( int j = i + 1 ; j < 10 ; j++ )
//		{
//		if( values[i] > values[j] ){
//		    int t = values[i];
//		    values[i] = values[j];
//		    values[j] = t;
//		}
//		}
//		}
//		
//		for( int i = 0 ; i < 10 ; i++ )
//		System.out.print( values[i] + " " );
	}
}
//BufferedReader br = new BufferedReader(
//		new InputStreamReader(System.in));
//System.out.println();