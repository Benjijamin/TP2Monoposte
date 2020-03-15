package model.forme;

import javafx.scene.paint.Color;
public abstract class Forme {
	public TypeForme type;
	private Color couleur;
	private boolean effet;
	private double posX;
	private double posY;
	private double hauteur;
	private double largeur;
	private float opacite;
	public Color getCouleur() {
		return couleur;
	}
	public void setCouleur(Color couleur) {
		this.couleur = couleur;
	}
	public boolean isEffet() {
		return effet;
	}
	public void setEffet(boolean effet) {
		this.effet = effet;
	}
	public double getPosX() {
		return posX;
	}
	public void setPosX(double posX) {
		this.posX = posX;
	}
	public double getPosY() {
		return posY;
	}
	public void setPosY(double posY) {
		this.posY = posY;
	}
	public double getHauteur() {
		return hauteur;
	}
	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}
	public double getLargeur() {
		return largeur;
	}
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}
	public float getOpacite() {
		return opacite;
	}
	public void setOpacite(float opacite) {
		this.opacite = opacite;
	}
}
