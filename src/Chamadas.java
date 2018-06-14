/***
 * A classe Chamadas tem duas funcoes principais, a primeira eh realizar o carregamento
 * das ferramentas necessarias para andamento do jogo, isto, atraves de classes auxiliares.
 * A segunda funcao eh gerar um loop com as perguntas, rodando seguindo condicoes de classes
 * internas
 * @author joaoh
 *
 */

public  class Chamadas extends CertoErrado { //Herda métodos e atributos da classe em questão
		

	 /***
     * Metodo que faz chamada dos metodos de impressao da classe view e adiciona pulos
     * @author joaoh
     *
     */
  void inicializa(){
    intro();//Chama apresentação do jogo
    p.pulos.adiciona();//adciona os pulos
    telaDeEspera(op.msgSemPul);//Aguarda entrada para usuário
  }


  /***
   * Loop das perguntas baseado na quantidade de perguntas que jogador deverah acertar
   * @author joaoh
   *
   */
  void perguntas(){
    for (int pos=0;pos<24;pos++ ) { //A quantidade total de iterações no programa
			if (op.acertos==op.facEnd || op.acertos==op.medEnd) {
				pos=ap.reposiciona(op);
			}
			validaDigitado(pos);// Valida entrada de dados
      validaOpcao(pos);// Verifica se está certo
      if (desistiu()){//verifica se foi escolhida opcao desistir
        return;//finaliza
      }
      if (perdeu()){//verifica se perdeu
        return;//finaliza
      }
			op.acertos++;
			ap.incrementa(pos, op);
			if (op.acertos==op.todos) {
				break;
			}
    }
    encerra(op.perdeu,op); //caso não tenha desistido ou perdido consquentemente venceu..
  }

}
