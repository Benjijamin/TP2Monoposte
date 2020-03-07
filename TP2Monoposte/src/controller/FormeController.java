package controller;

import view.FormeView;

public class FormeController {
	private FormeView view;
	
	public FormeController() {
		this.view = new FormeView(this);
	}
	
	public FormeView getView() {
		return this.view;
	}

}
