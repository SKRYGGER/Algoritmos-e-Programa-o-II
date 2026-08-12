package PacoteJava;


import javax.swing.*;


public class Loja01 {
    public static void main(String[] args) {
        int quantidadeProdutos = 2;
        String[] produtos = new String[quantidadeProdutos];
        int[] quantidade = new int[quantidadeProdutos];
        double[] preco = new double[quantidadeProdutos];


        //Percorrer todos os meus produtos
        for (int i=0; i<quantidadeProdutos;i++){
            //JOptionPane abre uma caixa de diálogo
            produtos[i] = JOptionPane.showInputDialog(null,
                    "Digite o nome do Produto"+(i+1),"Produtos",JOptionPane.QUESTION_MESSAGE);
            String entradaQuantidade = JOptionPane.showInputDialog("Digite a quantidade de "+produtos[i]+":");
            quantidade[i] = Integer.parseInt(entradaQuantidade);
            String entradaPreco = JOptionPane.showInputDialog("Digite o preço do produto"+produtos[i]+ ":");
            preco[i] = Double.parseDouble(entradaPreco);
        }
        double valorTotalEstoque = 0;
        int indiceMaisCaro = 0;
        for (int i=0; i<quantidadeProdutos;i++){
            double valorProduto = quantidade[i] + preco[i];
            valorTotalEstoque += valorProduto;
            //Avaliação de indice do mais caro
            if (preco[i] > preco[indiceMaisCaro]){
                indiceMaisCaro = i;
            }
        }
        String relatorio = "===== ESTOQUE =====\n\n";
        for(int i =0;i<quantidadeProdutos;i++){
            double total= quantidade[i] * preco[i];
            relatorio +=
                    "Produto: " +produtos[i]+
                            "\nQuantidade: "+ quantidade[i]+
                            "\nPreço: "+preco[i]+
                            "\nValor em estoque: R$ "+total+
                            "\n----------------------------------\n";
        }
        relatorio +=
                "\nValor total do estoque: R$ "+valorTotalEstoque;
        relatorio +=
                "\nProduto mais caro: "+produtos[indiceMaisCaro];
        JOptionPane.showMessageDialog(null,relatorio);
    }
}

