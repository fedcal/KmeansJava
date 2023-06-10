package org.clustering;

/**
 * Classe concreta che estende la classe astratta Attribute per la realizzazione di attributi discreti o categorici
 */
public class DiscreteAttribute extends Attribute{
    /**
     * Array di Stringhe per ciascun valore dell dominio discreto. I valori del dominio sono memorizzati seguendo un
     * ordine lessicografico.
     */
    private String values[];

    /**
     * Costruttore di classe che richiama il costruttore della super classe e avvalora l'attribute values
     * @param name String - Nome simbolico dell'attributo
     * @param index int - Identificativo numerico dell'attributo
     * @param values array di String - per ciascun valore dell dominio discreto
     */
    public DiscreteAttribute(String name, int index, String values[]){
        super(name,index);
        this.values=values;
    }

    /**
     *  Restituisce il numero di valori discreti nel dominio dell'attributo
     * @return String
     */
    public int getNumberOfDistnctValues(){
        return this.values.length;
    }

    /**
     * Restituisce il valore discreto in posizione “i” di values
     * @param i int - posizione dell'attributo all'interno dell'array
     * @return String
     */
    public String getValues(int i){
        return values[i];
    }
}
