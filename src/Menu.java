
/***
 * Classe menu responsavel pelas chamadas principais, o intuito desta eh abstrair ao maximo
 * as funcoes necessarias para execucao do codigo
 * @author joaoh
 *
 */

public class Menu {
  public static  void main(String[] args) {
    Chamadas c = new Chamadas();


    c.inicializa(); //Inicia as variáveis, prepara pra rodar
    c.perguntas(); //Roda programa em si..

  }
}
