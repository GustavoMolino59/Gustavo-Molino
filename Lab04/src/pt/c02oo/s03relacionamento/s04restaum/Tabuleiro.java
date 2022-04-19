package pt.c02oo.s03relacionamento.s04restaum;

//A clase tabuleiro realiza todas as ações, baseada apenas no estado de existencia e localização
// de cada uma das peças//
public class Tabuleiro {
    private String colunas[] = {"a" , "b" , "c", "d", "e", "f", "g"};
    private char board[][] = {
            {' ', ' ', 'P', 'P', 'P', ' ', ' '},
            {' ', ' ', 'P', 'P', 'P', ' ', ' '},
            {'P', 'P', 'P', 'P', 'P', 'P', 'P'},
            {'P', 'P', 'P', '-', 'P', 'P', 'P'},
            {'P', 'P', 'P', 'P', 'P', 'P', 'P'},
            {' ', ' ', 'P', 'P', 'P', ' ', ' '},
            {' ', ' ', 'P', 'P', 'P', ' ', ' '}
    };
    private Peca pecas[][] = new Peca[7][7];

    //cria os objetos peca em cada coordenada do tabuleiro//
    private void CriarPecas() {
        for (int i = 0; i < 7; i++) {
            for (int n = 0; n < 7; n++) {
                if( i < 2 || i > 4){
                    if(n >= 2 && n <= 4){
                        pecas[i][n] = new Peca(i, n, true);
                    }
                }
                else{
                    if(i == 3 && n == 3){
                        pecas[i][n] = new Peca(i, n, false);
                    }
                    else {
                        pecas[i][n] = new Peca(i, n, true);
                    }
                }
            }
        }
    }

    //realiza uma jogada sem verificar se ela é possivel//
    public void jogada(String movimento){
        String inicial = movimento.substring(0, 2);
        String fim = movimento.substring(3, 5);
        int coluna_atual = 0;
        int linha_atual = ((Integer.parseInt(inicial.substring(1,2))-1)-6)*(-1);
        int proxima_coluna = 0;
        int proxima_linha = ((Integer.parseInt(fim.substring(1,2))-1)-6)*(-1);
            for(int i = 0; i < colunas.length; i++){
                if(colunas[i].equals(inicial.substring(0,1))){
                    coluna_atual = i;
                }
            }
            pecas[linha_atual][coluna_atual].jogada(false);
            for(int i = 0; i < colunas.length; i++){
                if(colunas[i].equals(fim.substring(0,1))){
                    proxima_coluna = i;
                }
            }
            pecas[proxima_linha][proxima_coluna].jogada(true);
            if(proxima_coluna == coluna_atual){
                if(proxima_linha < linha_atual){
                    pecas[linha_atual - 1][coluna_atual].jogada(false);
                }
                else{
                    pecas[proxima_linha - 1][coluna_atual].jogada(false);
                }
            }
            else{
                if(proxima_coluna < coluna_atual){
                    pecas[linha_atual][coluna_atual - 1].jogada(false);
                }
                else{
                    pecas[linha_atual][proxima_coluna -  1].jogada(false);
                }
            }
    }
    //Verifica se a jogada é possivel e pode ser feita//
    public boolean verificarsepossivel(String movimento){
        String inicial = movimento.substring(0, 2);
        String fim = movimento.substring(3, 5);
        int coluna_atual = 0;
        int linha_atual = ((Integer.parseInt(inicial.substring(1,2))-1)-6)*(-1);
        int proxima_coluna = 0;
        int proxima_linha = ((Integer.parseInt(fim.substring(1,2))-1)-6)*(-1);
        try {
            for (int i = 0; i < colunas.length; i++) {
                if (colunas[i].equals(inicial.substring(0, 1))) {
                    coluna_atual = i;
                }
                if (colunas[i].equals(fim.substring(0, 1))) {
                    proxima_coluna = i;
                }
            }
            if (pecas[proxima_linha][proxima_coluna].Existe() == false) {
                if (proxima_coluna == coluna_atual) {
                    if(proxima_linha - linha_atual == 2 || proxima_linha - linha_atual == -2) {
                        if (proxima_linha < linha_atual && pecas[linha_atual - 1][coluna_atual].Existe() == true) {
                            return true;
                        } else if (pecas[proxima_linha - 1][coluna_atual].Existe() == true) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                } else {
                    if(proxima_coluna - coluna_atual == 2 || proxima_coluna - coluna_atual == -2) {
                        if (proxima_coluna < coluna_atual && pecas[linha_atual][coluna_atual - 1].Existe() == true) {
                            return true;
                        } else if (pecas[linha_atual][proxima_coluna - 1].Existe() == true) {
                            return true;
                        }
                    }
                }
            } else {
                return false;
            }
            return false;
        }catch (Exception e){
            return false;
        }
    }

    //printa o tabuleiro dado o estado atual de cada um dos objetos peça//
    public char[][] PrintaTabuleiro(){
        for (int i = 0; i < 7; i++) {
            for (int n = 0; n < 7; n++) {
                if( i < 2 || i > 4){
                    if(n >= 2 && n <= 4){
                        if(pecas[i][n].Existe() == true){
                            board[i][n] = 'P';
                        }
                        else{
                            board[i][n] = '-';
                        }
                    }
                }
                else{
                    if(pecas[i][n].Existe() == true){
                        board[i][n] = 'P';
                    }
                    else{
                        board[i][n] = '-';
                    }
                }
            }
        }
        return board;
    }

    //Cria o tabuleiro//
    Tabuleiro(){
        CriarPecas();
    }
}
