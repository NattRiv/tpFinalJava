package Classes;

import Abstract.Arma;
import Interface.Comparable;

public class Larga extends Arma implements Comparable {
    private String justifUso;
    private int nivelArma;
    private boolean tieneSello;

    public Larga(int cantMuniciones, double alcance, String marca, int calibre, String estado, Policia poli, String justifUso, int nivelArma, boolean tieneSello) {
        super(cantMuniciones, alcance, marca, calibre, estado, poli);
        this.justifUso = justifUso;
        this.nivelArma = nivelArma;
        this.tieneSello = tieneSello;
    }
    public String getJustifUso() {
        return justifUso;
    }

    public void setJustifUso(String justifUso) {
        this.justifUso = justifUso;
    }

    public int getNivelArma() {
        return nivelArma;
    }

    public void setNivelArma(int nivelArma) {
        this.nivelArma = nivelArma;
    }

    public boolean isTieneSello() {
        return tieneSello;
    }

    public void setTieneSello(boolean tieneSello) {
        this.tieneSello = tieneSello;
    }

    @Override
    public String toString() {
        return "Larga{" +
                "justifUso='" + justifUso + '\'' +
                ", nivelArma=" + nivelArma +
                ", tieneSello=" + tieneSello +
                ", cantMuniciones=" + cantMuniciones +
                ", alcance=" + alcance +
                ", marca='" + marca + '\'' +
                ", calibre=" + calibre +
                ", estado='" + estado + '\'' +
                '}';
    }


    @Override
    public boolean enCondicion() {
        if (this.estado.equalsIgnoreCase("en uso") & this.calibre >=9){
            return true;
        }
        return false;
    }

    @Override
    public void compareTo(Larga larga) {
        if (this.nivelArma > larga.getNivelArma()){
            System.out.println("El arma: " + this.getMarca() + ", nivel: "+ this.getNivelArma() + " es mayor a " + larga.getMarca() + ", nivel: "+ larga.getNivelArma());
        } else {
            System.out.println("El arma: " + larga.getMarca() + ", nivel: "+ larga.getNivelArma() + " es mayor a " + this.getMarca() + ", nivel: "+ this.getNivelArma());
        }
    }

}
