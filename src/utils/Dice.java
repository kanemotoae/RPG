package utils;

import java.util.Random;

// 乱数を作成する便利なクラス
public class Dice {

	// 乱数インスタンスの生成、Random rは乱数を作るためのツール
	private static Random r = new Random();

	// minからmaxまでの間で整数値のサイコロを振り、その値を戻り値とするメソッド、getメソッドはminからmaxまでの乱数(ランダムな数)を生成して返す。
	public static int get(int min, int max) {
		return r.nextInt(max - min + 1) + min;
	}
}