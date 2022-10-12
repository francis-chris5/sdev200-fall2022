
package fileio;

import java.io.Serializable;


public class MyData implements Serializable {
    private int myNumber;
    private String myWords;
    private boolean myTruth;

    public MyData(int myNumber, String myWords, boolean myTruth) {
        this.myNumber = myNumber;
        this.myWords = myWords;
        this.myTruth = myTruth;
    }

    public MyData() {
    }

    public int getMyNumber() {
        return myNumber;
    }

    public void setMyNumber(int myNumber) {
        this.myNumber = myNumber;
    }

    public String getMyWords() {
        return myWords;
    }

    public void setMyWords(String myWords) {
        this.myWords = myWords;
    }

    public boolean isMyTruth() {
        return myTruth;
    }

    public void setMyTruth(boolean myTruth) {
        this.myTruth = myTruth;
    }

    @Override
    public String toString() {
        return "here's my object";
    }
    
    
    
    
    
    
}
