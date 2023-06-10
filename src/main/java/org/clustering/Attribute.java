package org.clustering;

/**
 * Classe per la modellazione di un attributo
 */
public abstract class Attribute {
    /**
     * Nome simbolico dell'attributo
     */
    private String name;
    /**
     * Identificativo numerico dell'attributo
     */
    private int index;

    /**
     * Costruttore di classe
     * @param name String - Nome simbolico dell'attributo
     * @param index int - Identificativo numerico dell'attributo
     */
    public Attribute(String name,int index){
        this.name = name;
        this.index = index;
    }

    /**
     * Restituisce il nome simbolico dell'attributo
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * Imposta il nome simbolico dell'attributo
     * @param name String
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Restituisce l'identificativo dell'attributo
     * @return int
     */
    public int getIndex() {
        return index;
    }

    /**
     * Imposta l'identificativo dell'attributo
     * @param index int
     */
    public void setIndex(int index) {
        this.index = index;
    }

    /**
     * Sovrascrittura del metodo toString() della classe Object. Restituisce una stringa contenente solo il nome dell'attributo
     * @return String
     */
    @Override
    public String toString(){
        return this.name;
    }
}
