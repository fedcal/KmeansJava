package org.clustering;

import java.util.Arrays;
import java.util.Collections;

/**
 * Classe per modellare l'insieme di transazioni o tuple
 */
public class Data {
    /**
     * Matrice nXmm di tipo Onject dove ogni riga modella una transazione
     */
    Object data [][];
    /**
     * Cardinalità dell’insieme di transazioni (numero di righe in
     * data)
     */
    int numberOfExamples;
    /**
     * Un vettore degli attributi in ciascuna tupla (schema della
     * tabella di dati)
     */
    Attribute attributeSet[];

    /**
     * Costruttore di classe che popola gli attributi
     */
    public Data(){
        data = new Object [14][5];

        data[0][0]=new String ("sunny");
        data[1][0]=new String ("sunny");
        data[2][0]=new String ("sunny");
        data[3][0]=new String ("rain");
        data[4][0]=new String ("rain");
        data[5][0]=new String ("rain");
        data[6][0]=new String ("rain");
        data[7][0]=new String ("rain");
        data[8][0]=new String ("rain");
        data[9][0]=new String ("rain");
        data[10][0]=new String ("overcast");
        data[11][0]=new String ("overcast");
        data[12][0]=new String ("overcast");
        data[13][0]=new String ("overcast");

        data[0][1]=new String ("hot");
        data[1][1]=new String ("hot");
        data[2][1]=new String ("hot");
        data[3][1]=new String ("mild");
        data[4][1]=new String ("mild");
        data[5][1]=new String ("mild");
        data[6][1]=new String ("mild");
        data[7][1]=new String ("mild");
        data[8][1]=new String ("mild");
        data[9][1]=new String ("mild");
        data[10][1]=new String ("cold");
        data[11][1]=new String ("cold");
        data[12][1]=new String ("cold");
        data[13][1]=new String ("cold");

        data[0][2]=new String ("high");
        data[1][2]=new String ("high");
        data[2][2]=new String ("high");
        data[3][2]=new String ("normal");
        data[4][2]=new String ("normal");
        data[5][2]=new String ("normal");
        data[6][2]=new String ("normal");
        data[7][2]=new String ("normal");
        data[8][2]=new String ("normal");
        data[9][2]=new String ("normal");
        data[10][2]=new String ("high");
        data[11][2]=new String ("high");
        data[12][2]=new String ("high");
        data[13][2]=new String ("high");


        data[0][3]=new String ("weak");
        data[1][3]=new String ("weak");
        data[2][3]=new String ("weak");
        data[3][3]=new String ("strong");
        data[4][3]=new String ("strong");
        data[5][3]=new String ("strong");
        data[6][3]=new String ("strong");
        data[7][3]=new String ("strong");
        data[8][3]=new String ("strong");
        data[9][3]=new String ("strong");
        data[10][3]=new String ("strong");
        data[11][3]=new String ("strong");
        data[12][3]=new String ("strong");
        data[13][3]=new String ("strong");


        data[0][4]=new String ("no");
        data[1][4]=new String ("no");
        data[2][4]=new String ("no");
        data[3][4]=new String ("yes");
        data[4][4]=new String ("yes");
        data[5][4]=new String ("yes");
        data[6][4]=new String ("yes");
        data[7][4]=new String ("yes");
        data[8][4]=new String ("yes");
        data[9][4]=new String ("yes");
        data[10][4]=new String ("yes");
        data[11][4]=new String ("yes");
        data[12][4]=new String ("yes");
        data[13][4]=new String ("yes");

        numberOfExamples= data.length;

        attributeSet = new Attribute[5];

        String outLookValues[]=new String[]{"overcast","rain","sunny"};
        attributeSet[0] = new DiscreteAttribute("Outlook",0, outLookValues);

        String temperaturesValues[]=new String[]{"hot","mild","cool"};
        attributeSet[1] = new DiscreteAttribute("Temperature",1, temperaturesValues);

        String humidityValues[]=new String[]{"high","normal"};
        attributeSet[2] = new DiscreteAttribute("Humidity",2, humidityValues);

        String windValues[]=new String[]{"weak","strong"};
        attributeSet[3] = new DiscreteAttribute("Wind",3, windValues);

        String playTennisValues[]=new String[]{"no","yes"};
        attributeSet[4] = new DiscreteAttribute("PlayTennis",4, playTennisValues);
    }

    /**
     * Restituisce il numero di esempi presenti nel dataset
     * @return int
     */
    public int getNumberOfExamples(){
        return this.numberOfExamples;
    }

    /**
     * Restituisce il numero di attributi
     * @return int
     */
    int getNumberOfAttributes(){
        return this.attributeSet.length;
    }

    /**
     * Restituisce l'esempio indicizzto dagli indici in input
     * @param exampleIndex int - indice di riga riferito all'esempio
     * @param attributeIndex int - indice di colonna relativa all'attributo
     * @return Object
     */
    Object getAttributeValue(int exampleIndex, int attributeIndex){
        return this.data[exampleIndex][attributeIndex];
    }

    /**
     * Restituisce l'attributo indicizzato dall'index
     * @param index int - indice
     * @return Attribute
     */
    Attribute getAttribute(int index){
        return this.attributeSet[index];
    }

    /**
     * Metodo che sovrascrive il metodo toString eriditato dalla classe Object
     * @return String
     */
    @Override
    public String toString(){
        String x="";
        for(int i=0; i<this.attributeSet.length;i++){
            x+=attributeSet[i].getName()+",";
        }
        x+=attributeSet[attributeSet.length-1]+"\n";
        for (int i=0;i< data.length;i++){
            for (int j=0;j<attributeSet.length;j++){
                x+=this.data[i][j]+",";
            }
            x+="\n";
        }

        return x;
    }



    public static void main(String args[]){
        Data trainingSet=new Data();
        System.out.println(trainingSet);
    }
}
