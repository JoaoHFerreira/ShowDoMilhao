/***
 * A classe pulo existe para o caso do jogador nao souber determinada questao, para isso 
 * existe este metodo de escape, ao realizar o pulo sorteia-se outra quest�o .
 * @author joaoh
 */

import java.util.ArrayList;

public class Pulo {
  ArrayList<Integer> pulos = new ArrayList<Integer>(); //Array com quantidade de posições, 3

  public void adiciona() {   //Adiciona quantidade de pulos
    for (int i=0;i<3 ;i++ ) {
      this.pulos.add(i);
    }
  }

  public void remove(){ //Remove do array 1 pulo
    if (pulos.size()>0) {
      this.pulos.remove(0);
    }
  }

  public int getSize(){   //Mostra o tamanho do array
    return pulos.size();
  }

}
