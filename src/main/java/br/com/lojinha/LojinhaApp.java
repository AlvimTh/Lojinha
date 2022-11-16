package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.Produto;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto("Nestle", Tamanho.MEDIO);

        meuProduto.setNome("PLAY");
        meuProduto.setValor(30);

        List<String> itensInclusos = new ArrayList<String>();
        itensInclusos.add("2 controles"); //0
        itensInclusos.add("3jogos"); //1
        itensInclusos.add("2 cabos de energia"); //2
        meuProduto.setItensInclusos(itensInclusos);

        System.out.println(meuProduto.getItensInclusos().get(1));
        System.out.println(meuProduto.getTamanho());
        System.out.println(meuProduto.getMarca());

        System.out.println(meuProduto.getValor());



    }
}
