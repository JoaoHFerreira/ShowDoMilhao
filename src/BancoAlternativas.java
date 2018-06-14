
/***
 * Por existirem um grande numero de informacoes a serem carregadas, foi criada uma classe com a
 * funcao de banco de dados, sorteio de questoes, ocorrendo o sorteio de para 3 condicoes
 * diferentes: Facil, Mehdio, Dificil.
 * @author joaoh
 */

import java.util.Collections;
import java.util.ArrayList;

public class BancoAlternativas {
  protected ArrayList<String> perguntas = new ArrayList<String>();               //Classe com perguntas, respostas e opa�a�es
  protected ArrayList<String> choice1=new ArrayList<String>();
  protected ArrayList<String> choice2=new ArrayList<String>();
  protected ArrayList<Integer> rightAnswer = new ArrayList<Integer>();
  protected ArrayList<String> valores = new ArrayList<String>();
  protected ArrayList<Integer> sorted1 = new ArrayList<Integer>();
  protected ArrayList<Integer> sorted2 = new ArrayList<Integer>();
  protected ArrayList<Integer> sorted3 = new ArrayList<Integer>();
  protected ArrayList<Integer> sortedf = new ArrayList<Integer>();


  /***
   * Metodo que inicializa arrays com perguntas, escolhas, respostas certas e valores
   * @author joaoh
   *
   */
  public BancoAlternativas(){          //construtor que inicializa atributos da classe

    for (int i=0;i<12;i++ ) {
      this.sorted2.add(i+6);
    }
    for (int j=0;j<9;j++ ) {
      this.sorted1.add(j);
    }
    for (int k=0;k<3;k++ ) {
      this.sorted3.add(k);
    }

    this.perguntas.add("\n\nOi, sou uma questao facil.. tudo me ganha\n\n");
    this.choice1.add("A) Chineque.");
    this.choice2.add("B) Morcilha.");
    this.rightAnswer.add(0);


    this.perguntas.add("\n\nOi, sou uma questao facil.. tudo me ganha\n\n");
    this.choice1.add("A) Chineque.");
    this.choice2.add("B) Morcilha.");
    this.rightAnswer.add(0);


    this.perguntas.add("\n\nOi, sou uma questao facil.. tudo me ganha\n\n");
    this.choice1.add("A) Chineque.");
    this.choice2.add("B) Morcilha.");
    this.rightAnswer.add(0);


    this.perguntas.add("\n\nOi, sou uma questao facil.. tudo me ganha\n\n");
    this.choice1.add("A) Chineque.");
    this.choice2.add("B) Morcilha.");
    this.rightAnswer.add(0);

    this.perguntas.add("\n\nOi, sou uma questao facil.. tudo me ganha\n\n");
    this.choice1.add("A) Chineque.");
    this.choice2.add("B) Morcilha.");
    this.rightAnswer.add(0);

    this.perguntas.add("\n\nOi, sou uma questao facil.. tudo me ganha\n\n");
    this.choice1.add("A) Chineque.");
    this.choice2.add("B) Morcilha.");
    this.rightAnswer.add(0);

    this.perguntas.add("\n\nOi, sou uma questao facil.. tudo me ganha\n\n");
    this.choice1.add("A) Chineque.");
    this.choice2.add("B) Morcilha.");
    this.rightAnswer.add(0);


    this.perguntas.add("\n\nOi, sou uma questao facil.. tudo me ganha\n\n");
    this.choice1.add("A) Chineque.");
    this.choice2.add("B) Morcilha.");
    this.rightAnswer.add(0);


    this.perguntas.add("\n\nOi, sou uma questao facil.. tudo me ganha\n\n");
    this.choice1.add("A) Chineque.");
    this.choice2.add("B) Morcilha.");
    this.rightAnswer.add(0);


    this.perguntas.add("\n\nOi, sou uma questao facil.. tudo me ganha\n\n");
    this.choice1.add("A) Chineque.");
    this.choice2.add("B) Morcilha.");
    this.rightAnswer.add(0);

    this.perguntas.add("\n\nOi, sou uma questao facil.. tudo me ganha\n\n");
    this.choice1.add("A) Chineque.");
    this.choice2.add("B) Morcilha.");
    this.rightAnswer.add(0);

    this.perguntas.add("\n\nOi, sou uma questao facil.. tudo me ganha\n\n");
    this.choice1.add("A) Chineque.");
    this.choice2.add("B) Morcilha.");
    this.rightAnswer.add(0);


    this.perguntas.add("\n\nOla.. nao sou facil nem difiil.. sou bem MeDiA \n\n");
    this.choice1.add("A) Chineque.");
    this.choice2.add("B) Morcilha.");
    this.rightAnswer.add(0);

    this.perguntas.add("\n\nOla.. nao sou facil nem difiil.. sou bem MeDiA \n\n");
    this.choice1.add("A) Chineque.");
    this.choice2.add("B) Morcilha.");
    this.rightAnswer.add(0);

    this.perguntas.add("\n\nOla.. nao sou facil nem difiil.. sou bem MeDiA \n\n");
    this.choice1.add("A) Chineque.");
    this.choice2.add("B) Morcilha.");
    this.rightAnswer.add(0);


    this.perguntas.add("\n\nOla.. nao sou facil nem difiil.. sou bem MeDiA \n\n");
    this.choice1.add("A) Chineque.");
    this.choice2.add("B) Morcilha.");
    this.rightAnswer.add(0);

    this.perguntas.add("\n\nOla.. nao sou facil nem difiil.. sou bem MeDiA \n\n");
    this.choice1.add("A) Chineque.");
    this.choice2.add("B) Morcilha.");
    this.rightAnswer.add(0);


    this.perguntas.add("\n\nOla.. nao sou facil nem difiil.. sou bem MeDiA \n\n");
    this.choice1.add("A) Chineque.");
    this.choice2.add("B) Morcilha.");
    this.rightAnswer.add(0);

    this.perguntas.add("\n\nOla.. nao sou facil nem difiil.. sou bem MeDiA \n\n");
    this.choice1.add("A) Chineque.");
    this.choice2.add("B) Morcilha.");
    this.rightAnswer.add(0);

    this.perguntas.add("\n\nOla.. nao sou facil nem difiil.. sou bem MeDiA \n\n");
    this.choice1.add("A) Chineque.");
    this.choice2.add("B) Morcilha.");
    this.rightAnswer.add(0);


    this.perguntas.add("\n\nOla.. nao sou facil nem difiil.. sou bem MeDiA \n\n");
    this.choice1.add("A) Chineque.");
    this.choice2.add("B) Morcilha.");
    this.rightAnswer.add(0);



    this.perguntas.add("\n\nDuvido voce acertar... sou sangue no olho.. questao DIFICIL\n\n");
    this.choice1.add("A) Chineque.");
    this.choice2.add("B) Morcilha.");
    this.rightAnswer.add(0);


    this.perguntas.add("\n\nDuvido voce acertar... sou sangue no olho.. questao DIFICIL\n\n");
    this.choice1.add("A) Chineque.");
    this.choice2.add("B) Morcilha.");
    this.rightAnswer.add(0);

    this.perguntas.add("\n\nDuvido voce acertar... sou sangue no olho.. questao DIFICIL\n\n");
    this.choice1.add("A) Chineque.");
    this.choice2.add("B) Morcilha.");
    this.rightAnswer.add(0);

  }



  /***
   * Metodo para embaralhar perguntas
   * @author joaoh
   *
   */

  public void misturaPerguntas(){


    Collections.shuffle(this.sorted1);
    Collections.shuffle(this.sorted2);
    Collections.shuffle(this.sorted3);

    for (int c : this.sorted3 ) {
        this.sortedf.add(c);
    }

    for (int b : this.sorted2 ) {
        this.sortedf.add(b);
    }

    for (int sdsdsdsdsda: this.sorted1 ) {
        this.sortedf.add(sdsdsdsdsda);
    }


  }


}
