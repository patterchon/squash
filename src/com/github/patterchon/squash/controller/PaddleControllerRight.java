package com.github.patterchon.squash.controller;

import com.github.patterchon.squash.model.Paddle;

public class PaddleControllerRight implements Controller {

	Paddle paddle;
	
	public PaddleControllerRight(Paddle paddle) {
		this.paddle = paddle;
	}
	
	@Override
	public void handleEvent() {
		paddle.raiseCount();
	}
	
}
