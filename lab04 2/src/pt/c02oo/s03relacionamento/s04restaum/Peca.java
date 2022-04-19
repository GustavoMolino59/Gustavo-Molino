package pt.c02oo.s03relacionamento.s04restaum;

public class Peca {
    int linhaPeca;
    int colunaPeca;
    String colunas[] = {"a" , "b" , "c", "d", "e", "f", "g"};
    String colunaletra = "";
    boolean existência = true;

    //Cria uma peca//
    Peca(int linhaPeca, int colunaPeca, boolean existência){
        this.linhaPeca = linhaPeca;
        this.colunaPeca = colunaPeca;
        this.colunaletra = colunas[colunaPeca];
        this.existência = existência;
    }
    //Muda o estado atual de existencia de uma peça//
    public void jogada(boolean atual){
        this.existência = atual;
    }

    //Retorna o estado atual de uma peça//
    public boolean Existe(){
        return existência;
    }
}
