package com.zzc2422.push_stones_to_go;

public final class GameOverException extends Exception {
	public final int SCORE;
	
	public GameOverException(int score) {
		SCORE = score;
	}
}