package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Chapter12_2 {
	public static void main(String[] args) {
		FileSystem fs = FileSystems.getDefault();
//		PathクラスのインスタンスをFileSystem.getPathメソッドで生成
		Path inputPath = fs.getPath("resources/input.txt");
		Path outputPath = fs.getPath("resources/output.txt");

//		Java7以降追加の「try-with-resources」文で処理
//		Filesクラスを使用して、BufferedReaderクラスのインスタンスを作成
//		Filesクラスを使用して、BufferedWriterクラスのインスタンスを作成
		try (BufferedReader reader = Files.newBufferedReader(inputPath);
				BufferedWriter writer = Files.newBufferedWriter(outputPath);) {

			String line = null;
//			BufferedReader.readLineメソッドを使用して、１行ずつ処理
//			読み込む行が無くなるまでループする
			while ((line = reader.readLine()) != null) {
//				文字数が5以外の場合はスキップ
				if (line.length() != 5) {
					continue;
				}
//				読み込んだ１行を出力
				writer.write(line);
//				改行がないので改行を追加
				writer.newLine();
			}

//			例外処理を記述
//			printStackTraceで例外を出力
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("出力処理終了");
		}
	}
}
