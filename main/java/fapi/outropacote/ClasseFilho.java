package fapi.outropacote;

import fapi.pacote.ModificadorDeAcesso;

public class ClasseFilho extends ModificadorDeAcesso {
    public void mudarAtributos(){
        this.aProtected = 1;
        this.aPublic = 1;
    }
}
