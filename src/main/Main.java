package main;

import java.util.Scanner;

import carrinhoDeCompras.CarrinhoDeCompras;
import cliente.Cliente;
import menu.Menu;

/**CLASSE MAIN
 * 
 * @author Gabriel Reverso Pereira (837789)
 * @see Menu
 */
public class Main {

    public static void main(String[] args) {

        //Inicializa o scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("=============LOGIN=============\n\n");
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o seu CPF: ");
        String cpf = scanner.nextLine();

        Cliente cliente = new Cliente(nome, cpf);
        cliente.setCarrinhoDeCompras(new CarrinhoDeCompras(cliente));
        
        //Instancia o menu
        Menu menu = new Menu();

        //Chama o menu
        menu.menu(scanner, cliente);

        //Fecha o scanner
        scanner.close();
    }
}
