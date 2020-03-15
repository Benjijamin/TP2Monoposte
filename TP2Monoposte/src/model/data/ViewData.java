package model.data;

import javafx.scene.paint.Color;
import model.forme.TypeForme;

public class ViewData {
public TypeForme type;
public Color couleur;
public boolean effet;
public double posX;
public double posY;
public double hauteur;
public double largeur;
public double coteC;
public float opacite;
public ViewData() {};
public ViewData(TypeForme type, Color couleur, boolean effet, double posX, double posY, double hauteur, double largeur,
		double coteC, float opacite) {
	this.type = type;
	this.couleur = couleur;
	this.effet = effet;
	this.posX = posX;
	this.posY = posY;
	this.hauteur = hauteur;
	this.largeur = largeur;
	this.coteC = coteC;
	this.opacite = opacite;
}
}
