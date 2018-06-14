/***
 * A classe opcoes saouma classe dinamica para que as variaveis nao fiquem espalhadas atraves
 * do programa, gerando assim retrabalho e manutencao morosa, pois as mesmas variaveis se estendem
 * ao corpo do programa. Para evitar esta situacao as principais variaveis foram setadas aqui, as
 * mesmas tem carater dinamico sao alteradas ao decorrer do jogo.
 * @author joaoh
 *
 */

public class Opcoes {
  protected int incremento1=1000;
  protected int incremento2=3000;
  protected int incremento3=987000;
  protected int todos=8;

  protected int status=1000;


  protected int transicao;
  protected int posMed=12;
  protected int posFim=21;

  protected int facEnd=4;
  protected int medEnd=7;

  protected int acertos=0;  //contabiliza questoes certas
  protected int pontuacao=0; //contabiliza pontuacao

  protected int pula= 9;    //valores default de entrada
  protected int desisti=8;        //valores default de entrada
  protected int opA=0;      //valores default de entrada
  protected int opB=1;      //valores default de entrada
  // public String vz='';

  protected boolean perdeu=false; //NÃO PERDE ATÉ PERDER

  protected int pergunta=0;  //índice do array das perguntas
  protected int yourAnswer; //sua reposta, varia a cada rodada

  protected int msg=0;   //default para as mensagens da classe view
  protected int espaco=1;//default para as mensagens da classe view

  protected int msgPul=0;//default para as mensagens da classe view
  protected int msgSemPul=1;//default para as mensagens da classe view
}
