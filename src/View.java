/***
 * Nesta classe se concentra a interface visual, entrada e saida de dados
 * nenhuma regra eh visualizada aqui, apenas interface.
 * @author joaoh
 *
 */






public abstract class  View {

/***
 * Mensagem default em caso de excecao, desistencia sem ganhar nenhuma rodada
 * @author joaoh
 *
 */
  private String erro="\n\nVoce ainda nao ganhou nada, desistir agora eh o mesmo que derrota !!!!!\n\nLOOOOOOSER";
  /***
   * Mensagem default em caso de vitoria, para o caso de jogador ter ganhado premio final
   * @author joaoh
   *
   */
  protected String vitoria="||    PARABENS VOCE GANHOU R$ 1.000.000,00       ||";
  /***
   * String vazia para preenchimento de parametro, caso nao haja mensagem a se passar
   * @author joaoh
   *
   */
  protected String vz="";





  /***
   * Metodo para chamar erro, default
   * @author joaoh
   *
   */
  public void getErro(){
    System.out.println(this.erro);
  }


  /***
   * Breve introducao sobre o jogo
   * @author joaoh
   *
   */
  public void intro(){
    System.out.println("\n\n\n");
    System.out.println("||----------------------------------------------||");
    System.out.println("||                                              ||");
    System.out.println("||          BEM VINDO AO SHOW DO PRAZER!!       ||");
    System.out.println("||        PERGUNTAS DANADAS, MENTES SACANAS!!   ||");
    System.out.println("||                                              ||");
    System.out.println("||----------------------------------------------||");
    System.out.println("\n\n\n");
  }


  /***
   * Utilizado para dar fluidez ao jogo, pausas e telas limpas..
   * @author joaoh
   *
   */
    public void transicao(int i){
      if (i==0) {
          System.out.println("\n\n");
          System.out.println("Digite qualquer numero para prosseguir !!");
      }
      else{
          System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      }
    }


    /***
     * Mostra perguntas, alternativas e quantidade de pulos.
     * @author joaoh
     *
     */
    public void mostraPer(Question q, int pontos,int pulo, Opcoes op){
      System.out.printf("\n\nVoce ja tem %d pontos !!\n\n", op.pontuacao);
      System.out.printf("\n\nPergunta valendo %d pontos !!\n\n", pontos);
      System.out.printf("%s", q.question);
      System.out.printf("%s\n%s", q.choice1,q.choice2);
      System.out.println("\n\n");
      if (pulo>0) {
        System.out.println("||----------------------------------------------------------||");
        System.out.println("||Digite 0 para alternativa A                               ||");
        System.out.println("||----------------------------------------------------------||");
        System.out.println("||Digite 1 para alternativa B                               ||");
        System.out.println("||----------------------------------------------------------||");
        System.out.println("||Digite 8 para desistir e ganhar o valor anterior a esse   ||");
        System.out.println("||----------------------------------------------------------||");
        System.out.println("||Digite 9 para pular                                       ||");
        System.out.println("||----------------------------------------------------------||");
        System.out.println("\t\t\t\t\t\t\t\t|--------------------|");
        System.out.printf("\t\t\t\t\t\t\t\t| %d pulo/s restantes |\n",pulo);
        System.out.println("\t\t\t\t\t\t\t\t|--------------------|\n\n");
      }
      else{
        System.out.println("||----------------------------------------------------------||");
        System.out.println("||Digite 0 para alternativa A                               ||");
        System.out.println("||----------------------------------------------------------||");
        System.out.println("||Digite 1 para alternativa B                               ||");
        System.out.println("||----------------------------------------------------------||");
        System.out.println("||Digite 8 para desistir e ganhar o valor anterior a esse   ||");
        System.out.println("||----------------------------------------------------------||");
        System.out.println("\t\t\t\t\t\t\t|-----------------------------------|");
        System.out.printf("\t\t\t\t\t\t\t| Voce nao tem mais pulos restantes |\n",pulo);
        System.out.println("\t\t\t\t\t\t\t|-----------------------------------|\n\n");    }
    }



    /***
     * Notificao de acerto..
     * @author joaoh
     *
     */
     public void acertou(){
       System.out.println("\n\n\n");
       System.out.println("||----------------------------------------------||");
       System.out.println("||     PARABENS, VOCE ACERTOU ESTA QUESTAO      ||");
       System.out.println("||----------------------------------------------||");
       System.out.println("\n\n\n");
     }


     /***
      *Metodo de impressao para casos de perda
      * @author joaoh
      *
      */
      public void encerra(boolean perdeu, Opcoes op){
        if (perdeu) {
          System.out.println("\n\n\n");
          System.out.println("||----------------------------------------------||");
          System.out.println("||                                              ||");
          System.out.println("||        O JOGO TERMINOU E VOCE SE FUDEU!      ||");
          System.out.println("||                                              ||");
          System.out.println("||----------------------------------------------||");
          System.out.println("\n\n\n");
        }
        else{
          System.out.println("\n\n\n");
          System.out.println("||---------------------------------------------------------------------||");
          System.out.println("||                                                                     ||");
          System.out.printf("||                          Voce ganhou %d                        ||\n", op.pontuacao);
          System.out.println("||      PARABENS POR ACERTAR TODAS AS RESPOSTAS.. VOCE EH O CARA       ||");
          System.out.println("||                                                                     ||");
          System.out.println("||---------------------------------------------------------------------||");
          System.out.println("\n\n\n");
        }
      }

      /***
       * Metodo de impressao para o caso do jogador desistir
       * @author joaoh
       *
       */

      public void desistido(int ganhou){
          System.out.println("\n\n\n");
          System.out.println("----------------------------------------------");
          System.out.println("                                              ");
          System.out.printf("               VOCE GANHOU %d                 ",ganhou);
          System.out.println("                                              ");
          System.out.println("----------------------------------------------");
          System.out.println("\n\n\n");
      }



      /***
       * Metodo de impressao para notificar erro de impressao
       * @author joaoh
       *
       */

      public void erroDigita(int i){
        transicao(1);
        if (i==0) {
            System.out.println("PUTA QUE PARIU.... VOCE TEM PROBLEMAS COGNITIVOS ?????? \n\nAPENAS AS SEGUINTES ENTRADAS SAO ACEITAS...\nPRESTE ATENCAO:\n0 para escolher alternativa A\n1 para escolher a alternativa B\n8 para desistir e ganhar metade do conquistado\nPOR FAVOR CAPRICHE E DIGITE UM VALOR VALIDO NA HORA..\n");
        }
        else{
          System.out.println("PUTA QUE PARIU.... VOCE TEM PROBLEMAS COGNITIVOS ?????? \n\nAPENAS AS SEGUINTES ENTRADAS SAO ACEITAS...\nPRESTE ATENCAO:\n0 para escolher alternativa A\n1 para escolher a alternativa B\n8 para desistir e ganhar metade do conquistado\n9 para pular\n\nPOR FAVOR CAPRICHE E DIGITE UM VALOR VALIDO NA HORA..\n");
        }
        transicao(0);
      }


}
