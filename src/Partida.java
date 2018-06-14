/***
 *A classe Partida inicia e sorteia perguntas em vetores mais acess�veis.
 *@author joaoh
 */

import java.util.ArrayList;

public class Partida {
  protected ArrayList<Question> perguntasPartida = new ArrayList<Question>();
  private BancoAlternativas ba=new  BancoAlternativas();
  Pulo pulos= new Pulo();

  public  Partida(){
    ba.misturaPerguntas();
    for (int i=0;i<24;i++ ) {
       Question q= new Question(ba.perguntas.get(ba.sortedf.get(i)),ba.choice1.get(ba.sortedf.get(i)), ba.choice2.get(ba.sortedf.get(i)),ba.rightAnswer.get(ba.sortedf.get(i)));
      perguntasPartida.add(q);
    }

  }


  // public String getQuestion(int posicao){ //chama pergunta na posicao
  //   return this.question.get(posicao);
  // }
  //
  // public String getChoice1(int posicao){//chama opcao a na posicao
  //   return this.choice1.get(posicao);
  // }
  //
  // public String getChoice2(int posicao){//chama opcao b na posicao
  //   return this.choice2.get(posicao);
  // }
  //
  public int getRightAnswer(int posicao){//resposta certa na posicao
    return ba.rightAnswer.get(posicao);
  }

  // public String getValores(int posicao){//chama valor  na posicao
  //   return this.valores.get(posicao);
  // }
  //
  public int getValDes(Opcoes op){//chama valor na posicao-1.. porque desistiu
    return op.pontuacao/2;
  }

  public int getSizePer(){    //Ele define o tamanho do array perguntas
    return this.perguntasPartida.size();
  }

}
