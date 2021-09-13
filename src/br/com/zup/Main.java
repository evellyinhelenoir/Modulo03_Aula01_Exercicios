package br.com.zup;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, Double> produtos = new HashMap<String, Double>();
        boolean loop = true;



        while (loop == true){
            System.out.println("1 para adicionar um novo produto.\n" +
                    "2 Para exibir a lista de produtos.\n" +
                    "3 Para remover um produto.\n" +
                    "4 Para fechar o programa.");
            int escolha = scan.nextInt();
            if (escolha == 1){
                System.out.println("Preço");
                Double preco = scan.nextDouble();
                System.out.println("Produto");
                scan.nextLine();
                String produto = scan.nextLine();

                produtos.put(produto, preco);
            }else if (escolha == 2){
                for (String chaveProduto : produtos.keySet()){
                    System.out.println("Produto: " + chaveProduto + " | Preço: " + produtos.get(chaveProduto));
                }
            }else if (escolha == 3){
                System.out.println("Digite o nome do produto para remover");
                scan.nextLine();
                String produtoParaRemover = scan.nextLine();
                String produtoRemovido = "";
                for (String chaveProduto : produtos.keySet()){
                    if (chaveProduto.equals(produtoParaRemover)){
                        System.out.println("Produto removido com sucesso.");
                        produtoRemovido = produtoParaRemover;
                    }else {
                        System.out.println("Produto inválido.");
                    }
                }produtos.remove(produtoRemovido);
            }else if (escolha == 4){
                System.out.println("Obrigada por utilizar nossos serviços.");
                loop = false;
            }
        }
    }
}
