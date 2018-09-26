package com.github.patterchon.squash.view;

import processing.core.PApplet;

public class PaddleView extends AbstractView {
	
	public PaddleView(PApplet display) {
		super(display);
		update(425);
	}
	
	@Override
	public void update(Object value) {
		display.fill(0);
		display.rect((int)value, 950, 150, 25);
		display.redraw();
	}
	
}
