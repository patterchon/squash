package com.github.patterchon.squash.builder;

import com.github.patterchon.squash.view.AbstractView;

public abstract class InteractiveComponent {
	public abstract void handleEvent();
	protected AbstractView[] views; 
	
	public void update() {
		for (AbstractView view : views) {
			view.update(); 
		}
	}
}
