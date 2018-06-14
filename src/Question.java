/***
 * Classe simples com atributos da Pergunta, ela contem a pergunta, as escolhas e  a resposta certa
 * Apenas alguns atributos, a mesma eh inicializada atraves da classe Partida.
 * @author joaoh
 *
 */

public class Question{
  protected String question;
  protected String choice1;
  protected String choice2;
  protected int rightAnswer;

  public Question(String question,String choice1, String choice2, int rightAnswer){
    this.question=question;
    this.choice1=choice1;
    this.choice2=choice2;
    this.rightAnswer=rightAnswer;
  }

}
