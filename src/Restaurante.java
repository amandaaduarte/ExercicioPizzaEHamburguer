import javax.swing.*;

public class Restaurante {
    public static void main(String[] args){
        Pizza p1 = new Pizza();
        Hamburguer h1 = new Hamburguer();


        String opcao = JOptionPane.showInputDialog("Informe o pedido \n 1.Hamburguer \n 2.Pizza \n 3.Sair");

            if (opcao.equals("2")){
                p1.nome=JOptionPane.showInputDialog("informe o nome: ");
                p1.valor = Double.parseDouble(JOptionPane.showInputDialog("informe o valor: "));
                boolean possuiBorda = Boolean.parseBoolean(JOptionPane.showInputDialog("possui borda "));
        }
            if (opcao.equals("1")){
                h1.nome = JOptionPane.showInputDialog("informe o nome: ");
                h1.valor = Double.parseDouble(JOptionPane.showInputDialog("informe o valor: "));
                boolean artesanal = Boolean.parseBoolean(JOptionPane.showInputDialog("informe se o hamburguer é artesanal: "));


            }

            JOptionPane.showMessageDialog(null, "O seu pedido ficou no valor de: " + p1.valor + h1.valor);






    }

}
