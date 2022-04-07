package pt.c02oo.s02classe.s03lombriga;

   public class AppLombriga {

      public static void main(String[] args) {
         Toolkit tk = Toolkit.start();
         int i = 0;
         String lombrigas[] = tk.recuperaLombrigas();
         Animacao animacao1 = new Animacao(lombrigas[0]);
         Animacao animacao2 = new Animacao(lombrigas[1]);
         Animacao animacao3 = new Animacao(lombrigas[2]);
         Animacao animacao4 = new Animacao(lombrigas[3]);
         Animacao animacao5 = new Animacao(lombrigas[4]);
         Animacao animacao6 = new Animacao(lombrigas[5]);
         Animacao animacao7 = new Animacao(lombrigas[6]);
         Animacao animacao8 = new Animacao(lombrigas[7]);
         Animacao animacao9 = new Animacao(lombrigas[8]);
         Animacao animacao10 = new Animacao(lombrigas[9]);
         tk.gravaPasso(animacao1.criar_lombriga());
         for(i = 0; i < lombrigas[0].length() - 6; i++){
            tk.gravaPasso(animacao1.apresenta());
            animacao1.passo();
         }

         tk.gravaPasso(animacao2.criar_lombriga());
         for(i = 0; i < lombrigas[1].length() - 6; i++){
            tk.gravaPasso(animacao2.apresenta());
            animacao2.passo();
         }

         tk.gravaPasso(animacao3.criar_lombriga());
         for(i = 0; i < lombrigas[2].length() - 6; i++){
            tk.gravaPasso(animacao3.apresenta());
            animacao3.passo();
         }

         tk.gravaPasso(animacao4.criar_lombriga());
         for(i = 0; i < lombrigas[3].length() - 6; i++){
            tk.gravaPasso(animacao4.apresenta());
            animacao4.passo();
         }

         tk.gravaPasso(animacao5.criar_lombriga());
         for(i = 0; i < lombrigas[4].length() - 6; i++){
            tk.gravaPasso(animacao5.apresenta());
            animacao5.passo();
         }

         tk.gravaPasso(animacao6.criar_lombriga());
         for(i = 0; i < lombrigas[5].length() - 6; i++){
            tk.gravaPasso(animacao6.apresenta());
            animacao6.passo();
         }
         tk.stop();

         tk.gravaPasso(animacao7.criar_lombriga());
         for(i = 0; i < lombrigas[6].length() - 6; i++){
            tk.gravaPasso(animacao7.apresenta());
            animacao7.passo();
         }

         tk.gravaPasso(animacao8.criar_lombriga());
         for(i = 0; i < lombrigas[7].length() - 6; i++){
            tk.gravaPasso(animacao8.apresenta());
            animacao8.passo();
         }

         tk.gravaPasso(animacao9.criar_lombriga());
         for(i = 0; i < lombrigas[8].length() - 6; i++){
            tk.gravaPasso(animacao9.apresenta());
            animacao9.passo();
         }

         tk.gravaPasso(animacao10.criar_lombriga());
         for(i = 0; i < lombrigas[9].length() - 6; i++){
            tk.gravaPasso(animacao10.apresenta());
            animacao10.passo();
         }
      }

   }
