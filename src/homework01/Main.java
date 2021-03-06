package homework01;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		// 処理時間計測用
		long start;
		long end;

		// 1.干支を取得
		System.out.println("1.干支を取得");
		start = System.nanoTime();
		System.out.println(Eto.getEto(2017));
		end = System.nanoTime();
		System.out.println("処理時間 : " + String.valueOf((end - start) / 1000000000f) + "秒");
		System.out.println();

		// 2.素数を取得
		System.out.println("2.素数を取得？");
		start = System.nanoTime();
		List<Integer> PrimeNumberList = Sosu.getPrimeNumberList(10, 100);
		for (Integer primeNumber : PrimeNumberList) {
			System.out.println(primeNumber.toString());
		}
		end = System.nanoTime();
		System.out.println("処理時間 : " + String.valueOf((end - start) / 1000000000f) + "秒");
		System.out.println();

		// 3. フィボナッチ数列を取得
		System.out.println("3.フィボナッチ数列を取得");
		start = System.nanoTime();
		List<Integer> FibonacciNumberList = Fibonacci.getFibonacciNumberList(2);
		for (Integer fibonacciNumber : FibonacciNumberList) {
			System.out.println(fibonacciNumber.toString());
		}
		end = System.nanoTime();
		System.out.println("処理時間 : " + String.valueOf((end - start) / 1000000000f) + "秒");
		System.out.println();

		// 4.進捗どうですか？出力
		System.out.println("4-1.進捗どうですか？(StringBuilder)");
		start = System.nanoTime();
		System.out.println(SinchokuDodesuka.getSinchokuDodesuka());
		end = System.nanoTime();
		System.out.println("処理時間 : " + String.valueOf((end - start) / 1000000000f) + "秒");
		System.out.println();

		System.out.println("4-2.進捗どうですか？(String)");
		start = System.nanoTime();
		System.out.println(SinchokuDodesuka.getSinchokuDodesukaString());
		end = System.nanoTime();
		System.out.println("処理時間 : " + String.valueOf((end - start) / 1000000000f) + "秒");
		System.out.println();

		System.out.println("4-3.進捗どうですか？(StringBufferr)");
		start = System.nanoTime();
		System.out.println(SinchokuDodesuka.getSinchoduDodesukaStringBuffer());
		end = System.nanoTime();
		System.out.println("処理時間 : " + String.valueOf((end - start) / 1000000000f) + "秒");
		System.out.println();

		// 5.カレンダー出力
		System.out.println("5.カレンダー出力");
		start = System.nanoTime();
		MyCalendar.outputCalendar(-1017, 7);
		end = System.nanoTime();
		System.out.println("処理時間 : " + String.valueOf((end - start) / 1000000000f) + "秒");
		System.out.println();

		// 6.フォルダツリー表示
		System.out.println("6.フォルダツリー表示");
		start = System.nanoTime();
		FolderTree.outputTree("D:\\WorkSpace\\VisualBasic");
		end = System.nanoTime();
		System.out.println("処理時間 : " + String.valueOf((end - start) / 1000000000f) + "秒");
		System.out.println();

		// 7.テキスト検索
		System.out.println("7.テキスト検索");
		start = System.nanoTime();
		SearchText.outputMatches("D:\\testdata\\7.txt", "いろはに");
		end = System.nanoTime();
		System.out.println("処理時間 : " + String.valueOf((end - start) / 1000000000f) + "秒");
		System.out.println();

		// 8.テキストエンコード変換
		System.out.println("8.テキストエンコード変換");
		start = System.nanoTime();
		UTF8EncodeTextFile.encodeUTF8("D:\\testdata\\7.txt");
		end = System.nanoTime();
		System.out.println("処理時間 : " + String.valueOf((end - start) / 1000000000f) + "秒");
		System.out.println();

	}

}
