package fapi.pacote;

import fapi.ClasseA;

public class ModificadorDeAcesso extends ClasseA{
    private int aPrivate  = 0;
    int aDefault = 0;
    protected int aProtected = 0;

    public void setaPrivate(int aPrivate) {
        this.aPrivate = aPrivate;
    }

    public void setaDefault(int aDefault) {
        this.aDefault = aDefault;
    }

    public void setaProtected(int aProtected) {
        this.aProtected = aProtected;
    }

    public void imprimir(){
        System.out.println("aPublic "+this.aPublic);
        System.out.println("aPrivate "+this.aPrivate);
        System.out.println("aDefault "+this.aDefault);
        System.out.println("aProtected "+this.aProtected);

        this.aProtected = 0;
        this.aPublic = 0;
        this.aDefault = 0;
        this.aPrivate = 0;
    }
}
