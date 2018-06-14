/***
 * A classe CertoErrado tem o papel de verificar algumas situacoes de conformidade do jogo,
 * tais quais:
 * Verifica se jogador desistiu,
 * veriifca se jogador perdeu,
 * verifica se resposta dada eh a certa.
 * @author joaoh
 * Alem destas funcionalidades essenciais para execucao do programa a classe ainda chama telas de
 * espera atraves da classe View e valida opinioes digitadas.s
 *
 */


import  java.util.Scanner;

public class CertoErrado extends View { //Herda métodos e atributos da classe View
  Opcoes op= new Opcoes();
  Scanner a = new Scanner(System.in);
  Partida p=new Partida();
  AvancaPontuacao ap=new AvancaPontuacao();

  /***
   * Faz comparacao das repostas, a certa com a dada pelo jogador
   * @author joaoh
   *
   */
  public boolean certoErrado(int i, int j){
    return i==j;
  }


  /***
   * Metodo que verifica se valor digitado eh valido, dentro do pedido, enquanto nao for
   * pergunta se repete
   * @author joaoh
   *
   */
  public void validaDigitado(int pos){
    mostraPer(p.perguntasPartida.get(pos), ap.daPontuacao(op) ,p.pulos.getSize(), op); //Mostra as perguntas passando a posição e quantidade restante de pulos
    op.yourAnswer = a.nextInt(); //Recebe tua resposta
    if (p.pulos.getSize()==0) {
      while (op.yourAnswer!=op.desisti && op.yourAnswer!=op.opA && op.yourAnswer!=op.opB) { //Enquanto opção é digitada de modo errado repete solicitação
        telaDeEspera(op.msgPul); //Aguarda novamente
          mostraPer(p.perguntasPartida.get(pos), ap.daPontuacao(op) ,p.pulos.getSize(), op); //Mostra as perguntas passando a posição e quantidade restante de pulos
        op.yourAnswer = a.nextInt();//Recebe entrada novamente
        telaDeEspera(op.msgSemPul);//tela de processamento novamente
      }
    }
    else {
      while (op.yourAnswer!=op.pula && op.yourAnswer!=op.desisti && op.yourAnswer!=op.opA && op.yourAnswer!=op.opB) {
        telaDeEspera(op.msgPul);
          mostraPer(p.perguntasPartida.get(pos), ap.daPontuacao(op) ,p.pulos.getSize(), op); //Mostra as perguntas passando a posição e quantidade restante de pulos
        op.yourAnswer = a.nextInt();
        telaDeEspera(op.msgSemPul);
      }
    }
  }



  /***
   * Verifica qual foi a opcao, de acordo com a selecionada incrementa o respectivo contador
   * @author joaoh
   *
   */
  public void validaOpcao(int pos){
    if (op.yourAnswer==op.pula) { // se for opção pulo
      p.pulos.remove();//remove um pulo
      telaDeEspera(op.msgSemPul);//Aguarda contato
      op.pergunta++;//incrementa
    }
    else if (op.yourAnswer==op.desisti) { //caso opção desiste
      try{
        desistido(p.getValDes(op)); //para caso de desistência na primeira rodada
        return ;
      }
      catch(IndexOutOfBoundsException deuRuim) {
        getErro(); //imprime tela de erro
        op.perdeu=true; //define que usuario perdeu
        encerra(op.perdeu, op);  //imprime derrota
        return ;
      }
    }
    else {
      if (certoErrado(p.getRightAnswer(pos),op.yourAnswer)) { //compara tua reposta com respota correta
        acertou();
        telaDeEspera(op.msgSemPul);
      }
      else{
        op.perdeu=true;
        encerra(op.perdeu, op);
        return ;
      }
    }
  }


  /***
   * Chama metodo da classe view para espera
   * @author joaoh
   *
   */
  void telaDeEspera(int i){ //Aguarda dados
   transicao(op.msg);
   if (i==0) {
     if (p.pulos.getSize()==0) {
       erroDigita(op.msgPul);
     }
     else{
       erroDigita(op.msgSemPul);
     }
   }
   int breakPoint = a.nextInt();
   transicao(op.espaco);
  }


  /***
   * Verifica se jogador desistiu
   * @author joaoh
   *
   */
  public boolean desistiu(){
     return op.yourAnswer==op.desisti; //verifica se foi escolhida opcao desistir
   }


  /***
   * Verfica se jogador perdeu
   * @author joaoh
   *
   */
   public boolean perdeu(){ //verifica se perdeu
     return op.perdeu;
   }

}
