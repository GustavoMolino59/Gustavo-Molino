package pt.c02oo.s02classe.s03lombriga;

public class AquarioLombriga{
    //true = esquerda  false = direita//

    int tam_aq, tam_lomb, posi_cabeca;
    boolean lado;
    String lombriga = "";
    AquarioLombriga(int tam_aq, int tam_lomb, int posi_cabeca) {
        this.posi_cabeca = posi_cabeca;
        this.tam_aq = tam_aq;
        this.tam_lomb = tam_lomb;
        this.lado = true;
    }
    void crescer() {
        if(lado == true){
            if(posi_cabeca + tam_lomb <= tam_aq){
                tam_lomb = tam_lomb + 1;
            }
        }
        else{
            if(posi_cabeca - tam_lomb > 0){
                tam_lomb = tam_lomb + 1;
            }
        }
    }
    void mover() {
        if(lado == true) {
            if(posi_cabeca - 1 > 0) {
                posi_cabeca = posi_cabeca - 1;
            }
            else {
                this.virar();
            }
        }

        else {
            if(posi_cabeca + 1 < tam_aq) {
                posi_cabeca = posi_cabeca + 1;
            }
            else {
                this.virar();
            }

        }
    }
    void virar() {
        if(lado == true) {
            posi_cabeca = posi_cabeca + tam_lomb - 1;
            lado = false;
        }
        else {
            posi_cabeca = posi_cabeca - tam_lomb + 1;
            lado = true;
        }
    }
    String apresenta() {
        int i;
        lombriga = "";
        for(i = 1; i <= tam_aq; i++) {
            if(lado == true) {
                if (i == posi_cabeca) {
                    lombriga = lombriga + "o";
                } else if (i < posi_cabeca + tam_lomb && i > posi_cabeca) {
                    lombriga = lombriga + "@";
                } else {
                    lombriga = lombriga + "#";
                }
            }
            else{
                if (i == posi_cabeca) {
                    lombriga = lombriga + "o";
                } else if (i > posi_cabeca - tam_lomb && i < posi_cabeca) {
                    lombriga = lombriga + "@";
                } else {
                    lombriga = lombriga + "#";
                }
            }
        }
        System.out.println(' ');
        return lombriga;
    }
}