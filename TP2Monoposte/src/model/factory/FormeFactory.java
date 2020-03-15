package model.factory;

import model.data.ViewData;
import model.forme.*;

public class FormeFactory {

	public Forme creerForme(ViewData data) {
		switch (data.type) {
		case LIGNE:
			return ligne();

		case OVALE:
			return ovale();

		case RECTANGLE:
			return rectangle();

		case TRIANGLE:
			return triangle();

		default:
			return null;
		}
	}

	private Ligne ligne() {
		return new Ligne();
	}

	private Ovale ovale() {
		return new Ovale();
	}

	private Rectangle rectangle() {
		return new Rectangle();
	}

	private Triangle triangle() {
		return new Triangle();
	}

}
