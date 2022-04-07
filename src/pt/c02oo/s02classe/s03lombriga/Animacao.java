package pt.c02oo.s02classe.s03lombriga;
public class Animacao{
    String animacao;
    AquarioLombriga lombriga;
    int i = 6;
    public Animacao(String animacao){
        this.animacao = animacao;
    }
    public String apresenta(){
        return lombriga.apresenta();

    }
    public void passo(){
        if(animacao.substring(i, i + 1).equals("M")){
            lombriga.mover();
        }
        if(animacao.substring(i, i + 1).equals("C")){
            lombriga.crescer();
        }
        if(animacao.substring(i, i + 1).equals("V")){
            lombriga.virar();
        }
        i++;
    }

    String criar_lombriga(){
        int tam_aq = Integer.parseInt(animacao.substring(0,2));
        int tam_lomb = Integer.parseInt(animacao.substring(2,4));
        int pos = Integer.parseInt(animacao.substring(4,6));
        this.lombriga = new AquarioLombriga(tam_aq, tam_lomb, pos);
        return "=======";
    }


}