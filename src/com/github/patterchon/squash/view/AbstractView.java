package com.github.patterchon.squash.view;

import processing.core.PApplet;

public abstract class AbstractView {
	
	protected PApplet display;
	
	public abstract void update(Object value);

	public AbstractView(PApplet display) {
		this.display = display;
	}
	
}
