package org.clustering;

/**
 * Classe che estende la classe Attribute e modellla un attributo continuo. Normalizza anche l'attributo del dominio nell'intervallo [0,1]
 * al fine di rendere confrontabili attributi aventi domini diversi.
 */
public class ContinuousAttribute extends Attribute{
    /**
     * Estremo superiore dell'intervallo di valori che l'attributo può realmente assumere
     */
    private double max;
    /**
     * Estremo inferiore dell'intervallo di valori che l'attributo può realmente assumere
     */
    private double min;

    /**
     * Costruttore di classe che valorizza gli attributi della classe concreta e della super classe astratta.
     *
     * @param name Nome simbolico dell'attributo
     * @param index Identificativo numerico dell'attributo
     * @param min Estremo superiore dell'intervallo di valori che l'attributo può realmente assumere
     * @param max Estremo inferiore dell'intervallo di valori che l'attributo può realmente assumere
     */
    public ContinuousAttribute(String name, int index, double min, double max){
        super(name, index);
        this.min=min;
        this.max=max;
    }

    /**
     * Metodo per calcolare il valore normalizzato del parametro passato in input. La normalizzazione ha come codominio
     * l'intervallo [0,1].
     *
     * @param v double - valore da normalizzare
     * @return double - valore normalizzato
     */
    public double getScaledValue(double v){
        return (v-this.min)/(v-this.max);
    }
}
