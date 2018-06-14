public class AvancaPontuacao {

  protected int reposiciona(Opcoes op){
    if (op.acertos==op.facEnd) {
        op.transicao=op.posMed;
        op.status=op.incremento2;
    }
    else{
        op.transicao=op.posFim;
        op.status=op.incremento3;
    }
    int pos=op.transicao;
    return pos;
  }

  protected int daPontuacao(Opcoes op){
    return op.status;
  }


  protected void incrementa(int pos, Opcoes op){
    if (pos>=op.posFim) {
      op.pontuacao=op.pontuacao+op.incremento3;
    }
    else if (pos>=op.posMed && pos<op.posFim) {
      op.pontuacao=op.pontuacao+op.incremento2;
    }
    else{
      op.pontuacao=op.pontuacao+op.incremento1;
    }
  }
}
