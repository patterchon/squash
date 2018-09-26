package com.github.patterchon.squash.model;

public class Paddle {
	
	private int paddlePos = 425;
	
	private int ballPosX = 450;
	private int ballPosY = 520;
	private boolean ballDirXRight = true;
	private boolean ballDirYDown = false;
	
	public int getCount() {
		return paddlePos;
	}

	public void raiseCount() {
		paddlePos += 10;
		if (paddlePos > 850) {
			paddlePos = 850;
		}
	}
	
	public void decreaseCount() {
		paddlePos -= 10;
		if (paddlePos < 0) {
			paddlePos = 0;
		}
	}

	public int getPosX() {
		return ballPosX;
	}
	
	public int getPosY() {
		return ballPosY;
	}

	public boolean getPosDirX() {
		return ballDirXRight;
	}

	public boolean getPosDirY() {
		return ballDirYDown;
	}
	
	public void updateBall() {
		if (ballDirXRight) {
			ballPosX += 10;
			if (ballPosX > 1000) {
				ballDirXRight = false;
			} 
		} else {
			ballPosX -= 10;
			if (ballPosX < 0) {
				ballDirXRight = true;
			}
		}
		
		if (ballDirYDown) {
			ballPosY += 10;
			if ((ballPosY > 950) && (ballPosY < 970)) {
				if ((ballPosX < paddlePos + 150) && (ballPosX > paddlePos)) {
					ballDirYDown = false;
				} else {
					ballDirYDown = true;
				}
			} else if (ballPosY >= 1050) {
				ballPosY = 1050;
			}
		} else {
			ballPosY -= 10;
			if (ballPosY < 0) {
				ballDirYDown = true;
			}
		}
	}
	
	public void resetBall() {
		ballPosX = 450;
		ballPosY = 520;
		ballDirYDown = false;
	}
	
}
