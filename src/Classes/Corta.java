package Classes;

import Abstract.Arma;

public class Corta extends Arma {
    private boolean esAutomatica;

    public Corta(int cantMuniciones, double alcance, String marca, int calibre, String estado, Policia poli, boolean esAutomatica) {
        super(cantMuniciones, alcance, marca, calibre, estado, poli);
        this.esAutomatica = esAutomatica;
    }

    public boolean isEsAutomatica() {
        return esAutomatica;
    }

    public void setEsAutomatica(boolean esAutomatica) {
        this.esAutomatica = esAutomatica;
    }

    @Override
    public boolean enCondicion() {
        if (this.estado.equalsIgnoreCase("en uso") & this.calibre >=9){
            return true;
        }
        return false;
    }

    public boolean efectividadMts(){
        if (this.alcance > 200) {
            return true;
        }
        return false;
    }
}
