package pt.c02oo.s03relacionamento.s04restaum;

public class    AppRestaUm {

    public static void main(String[] args) {
        AppRestaUm.executaJogo(null, null);
    }

    public static void executaJogo(String arquivoEntrada, String arquivoSaida) {
        Toolkit tk = Toolkit.start(arquivoEntrada, arquivoSaida);

        String commands[] = tk.retrieveCommands();

        for (int l = 0; l < commands.length; l++)
            System.out.println(commands[l]);

        Tabuleiro board = new Tabuleiro();
        tk.writeBoard("Tabuleiro inicial", board.PrintaTabuleiro());
        for(int i = 0; i < commands.length;i++) {
            if (board.verificarsepossivel(commands[i])) {
                board.jogada(commands[i]);
                tk.writeBoard("source: " + commands[i].substring(0, 2) + " target: " + commands[i].substring(3, 5) + "\n", board.PrintaTabuleiro());
            } else {
                tk.writeBoard("source: " + commands[i].substring(0, 2) + " target: " + commands[i].substring(3, 5) + " é uma jogada impossivel", board.PrintaTabuleiro());
            }
        }
        tk.stop();
    }

}