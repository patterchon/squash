package com.github.patterchon.squash.controller;

import com.github.patterchon.squash.model.Paddle;

public class PaddleControllerLeft implements Controller {

	Paddle paddle;
	
	public PaddleControllerLeft(Paddle paddle) {
		this.paddle = paddle;
	}
	
	@Override
	public void handleEvent() {
		paddle.decreaseCount();
	}
	
}
