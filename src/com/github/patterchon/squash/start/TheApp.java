package com.github.patterchon.squash.start;

import com.github.patterchon.squash.controller.PaddleControllerLeft;
import com.github.patterchon.squash.controller.PaddleControllerRight;
import com.github.patterchon.squash.model.Paddle;
import com.github.patterchon.squash.view.AbstractView;
import com.github.patterchon.squash.view.PaddleView;

import processing.core.PApplet;

public class TheApp extends PApplet {

	private Paddle paddle;
	private AbstractView paddleView;
	private PaddleControllerRight paddleControllerRight;
	private PaddleControllerLeft paddleControllerLeft;
	
	@Override
	public void settings() {
		size(1000, 1000);
	}

	@Override
	public void setup() {  // setup() runs once
		frameRate(30);
		paddle = new Paddle();
		paddleView = new PaddleView(this);
		paddleControllerRight = new PaddleControllerRight(paddle);
		paddleControllerLeft = new PaddleControllerLeft(paddle);
	}

	@Override
	public void draw() {
		background(204);
		paddle.updateBall();
		ellipse(paddle.getPosX(), paddle.getPosY(), 25, 25);
		paddleView.update(paddle.getCount());
	}  // draw() loops forever, until stopped

	@Override
	public void keyPressed() {
		switch (keyCode) {
		case RIGHT:
			paddleControllerRight.handleEvent();
			break;
		case LEFT:
			paddleControllerLeft.handleEvent();
			break;
		default:
			break;
		}
	}
	
	@Override
	public void mouseClicked() {
		paddle.resetBall();
	}
}
