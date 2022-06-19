/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retest16;

/**
 *
 * @author mac
 */
public class ho {
    private String bleu;
    private String trempe;

    public ho(String bleu, String trempe) {
        this.bleu = bleu;
        this.trempe = trempe;
    }

    public ho() {
    }

    public String getBleu() {
        return bleu;
    }

    public void setBleu(String bleu) {
        this.bleu = bleu;
    }

    public String getTrempe() {
        return trempe;
    }

    public void setTrempe(String trempe) {
        this.trempe = trempe;
    }

    @Override
    public String toString() {
        return "ho{" + "bleu=" + bleu + ", trempe=" + trempe + '}';
    }
    
    
}
