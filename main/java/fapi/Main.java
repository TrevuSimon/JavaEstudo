package fapi;

import fapi.outropacote.ClasseFilho;
import fapi.pacote.Classe;
import fapi.pacote.ModificadorDeAcesso;

public class Main {
    public static void main(String[] args) {
        ClasseFilho mod = new ClasseFilho();
        Classe classe = new Classe();

        System.out.println();

        System.out.println("Quando foi instanciada!");
        mod.imprimir();

        mod.aPublic = 1;

        System.out.println("\nDepois do acesso do Main");
        mod.imprimir();

        mod.mudarAtributos();

        System.out.println("\nDepois de uma acesso de uma classe filho em outro pacote");
        mod.imprimir();

        classe.acessaAtributos(mod);

        System.out.println("\nDepois do acesso de uma classe do mesmo pacote");
        mod.imprimir();

        mod.setaPrivate(1);
        mod.setaPublic(1);
        mod.setaDefault(1);
        mod.setaProtected(1);
        System.out.println("\nDepois de usar um set");
        mod.imprimir();


        //Outra coisa
        ModificadorDeAcesso modificadorDeAcesso = new ModificadorDeAcesso();
        modificadorDeAcesso = new ClasseFilho();
        //modificadorDeAcesso.Mudaratributo(); <-- não tem acesso porque a classe original não tinha acesso, logo a classe polimorfa não pode acessar;
    }
}
