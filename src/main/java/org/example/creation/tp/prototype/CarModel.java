package org.example.creation.tp.prototype;

public class CarModel extends Model3D {
    public CarModel(int taille, String couleur, String texture) {
        super(taille, couleur, texture);
    }

    @Override
    public CarModel clone() {
        return new CarModel(this.getTaille(), this.getCouleur(), this.getTexture());
    }
}