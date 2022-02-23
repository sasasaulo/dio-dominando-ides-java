package com.saulo.dominandoides;


import com.saulo.dominandoides.model.Cachorro;
import com.saulo.dominandoides.model.Gato;

public class Main {

    public static void main(String[] args) {

        Gato gatinho1 = new Gato("Enzo", "Amarelo", 2);
        Cachorro cachorrinho = new Cachorro("Negresco", "Preto", 3);

        System.out.println(cachorrinho);
        System.out.println(gatinho1);

    }

}
