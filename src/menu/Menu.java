package menu;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import cliente.Cliente;
import produto.Produto;
import produto.laptop.Laptop;
import produto.smartphone.Smartphone;
import produto.tv.Tv;

/**
 * CLASSE DO MENU
 * 
 * @author Gabriel Reverso Pereira
 */
public class Menu {

    public static List<Produto> lista;

    private final int sair = 6;

    public void menu(Scanner scanner, Cliente cliente) {

        lista = criarLista();

        int seletorMenu;

        do {
            screenCleanner();

            seletorMenu = menuSelector(scanner);

            screenCleanner();

            switch (seletorMenu) {

                // Listar Produtos
                case 1: {
                    System.out.println("=============Listar Produtos=============\n\n");
                    for (Produto p : lista) {
                        System.out.println(p);
                    }
                    break;
                }
                // Adicionar ao Carrinho
                case 2: {
                    System.out.println("=============Adicionar ao Carrinho=============\n\n");
                    int i = 0;
                    for (Produto p : lista) {
                        System.out.println("---------------------");
                        System.out.println("\nItem: " + i);
                        System.out.println(p);
                        System.out.println("---------------------\n\n");
                        i++;
                    }
                    String option;
                    do {
                        System.out.print("\n\nSelecione o item para adicionar ao carrinho: ");
                        int item = scanner.nextInt();
                        scanner.nextLine();
                        if(item > i || item < 0){
                            System.out.println("\n\nItem Inválido!");
                        } else {
                            cliente.getCarrinhoDeCompras().adicionarAoCarrinho(lista.get(item));
                        }
                        System.out.println("\n\nDeseja Continuar a Adicionar ao Carrinho? (S/N)");
                        option = scanner.nextLine();
                    } while (option.toLowerCase().equals("s"));                   
                    break;
                }
                // Remover do Carrinho
                case 3: {
                    System.out.println("=============Remover do Carrinho=============\n\n");
                    String option;
                    do {
                        cliente.getCarrinhoDeCompras().listarProdutosCarrinho();
                        System.out.print("\n\nSelecione o item para remover carrinho: ");
                        int item = scanner.nextInt();
                        scanner.nextLine();
                        if(item > cliente.getCarrinhoDeCompras().getListaProdutosCarrinho().size() || item < 0){
                            System.out.println("\n\nItem Inválido!");
                        } else {
                            if(cliente.getCarrinhoDeCompras().removerDoCarrinho(item)){
                                System.out.println("\n\nItem Removido!");
                            }
                        }
                        System.out.println("\n\nDeseja Remover Mais Algum? (S/N)");
                        option = scanner.nextLine();
                    } while (option.toLowerCase().equals("s"));    
                    break;
                }
                // Visualizar o Carrinho
                case 4: {
                    System.out.println("=============Visualizar o Carrinho=============\n\n");
                    cliente.getCarrinhoDeCompras().listarProdutosCarrinho();
                    System.out.println("\n\nValor Total da Compra: " + cliente.getCarrinhoDeCompras().obterValorTotal());
                    System.out.println("\n\nDeseja Pagar? (S/N)");
                    String option = scanner.nextLine();
                    if(option.toLowerCase().equals("s")){
                        cliente.getCarrinhoDeCompras().pagamento();
                    } 
                    break;
                }
                // Adicionar Saldo
                case 5: {
                    System.out.println("=============Adicionar Saldo=============\n\n");
                    System.out.println("\nSaldo Disponivel: " + cliente.getSaldo());
                    System.out.println("\n\nDeseja Adicionar Mais Saldo? (S/N)");
                    String option = scanner.nextLine();
                    if(option.toLowerCase().equals("s")){
                        System.out.print("\nDigite a Quantia: ");
                        double saldo = scanner.nextDouble();
                        scanner.nextLine();
                        if (saldo > 0) {
                            cliente.setSaldo(cliente.getSaldo() + saldo);
                            System.out.println("\nNovo Saldo: " + cliente.getSaldo());
                        } else {
                            System.out.println("\n\nDigite uma quantia válida!");
                        }
                    }
                    break;
                }
                default:
                    seletorMenu = sair;
            }

            if (seletorMenu == sair) {
                System.out.println("\nPrograma encerrando");
            }
            System.out.println("\nPressione ENTER para prosseguir...");
            scanner.nextLine();
            screenCleanner();

        } while (seletorMenu != sair);
    }

    /******************* MÉTODOS AUXILIARES *************************/

    /** Limpador de tela. **/
    public static void screenCleanner() {
        try {
            ProcessBuilder pb;
            if (System.getProperty("os.name").startsWith("Windows")) {
                pb = new ProcessBuilder("cmd", "/c", "cls");
            } else {
                pb = new ProcessBuilder("clear");
            }
            Process process = pb.inheritIO().start();
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Imprimir menu e selecionar operação.
     * 
     * @param scanner (Scanner)
     * @return seleção (int)
     */
    public static int menuSelector(Scanner scanner) {

        System.out.println("=============MENU=============");

        System.out.println(" 1 - Listar Produtos");
        System.out.println(" 2 - Adicionar ao Carrinho");
        System.out.println(" 3 - Remover do Carrinho");
        System.out.println(" 4 - Visualizar Carrinho");
        System.out.println(" 5 - Adicionar Saldo");
        System.out.println(" 6 - Encerrar Aplicação");

        System.out.println("\n==============================\n");

        System.out.print("Digite a operacao: ");
        int seletorMenu = scanner.nextInt();
        scanner.nextLine();

        return seletorMenu;
    }

    /**
     * Imprimir menu e selecionar operação.
     * 
     * @return lista (List<Produto>)
     */
    public List<Produto> criarLista() {
        List<Produto> lp = new LinkedList<>();

        lp.add(new Laptop("Laptop", "Acer", "Nitro 5", 4500, "i5-10000", "3060", "8 GB", "1 TB"));
        lp.add(new Laptop("Laptop", "Dell", "XPS 13", 2000, "i7-8550U", "MX150", "16 GB", "512 GB SSD"));
        lp.add(new Laptop("Laptop", "HP", "Pavilion 15", 2500, "i5-10300H", "GTX 1650 Ti", "8 GB",
                "256 GB SSD + 1 TB HDD"));
        lp.add(new Smartphone("Smartphone", "Apple", "iPhone 12 Pro Max", 999, "128 GB", "Dual 12MP", "6 GB"));
        lp.add(new Smartphone("Smartphone", "Samsung", "Galaxy S21 Ultra", 1300, "256 GB", "108MP", "12 GB"));
        lp.add(new Smartphone("Smartphone", "Google", "Pixel 6 Pro", 900, "128 GB", "50MP", "12 GB"));
        lp.add(new Tv("Tv", "LG", "OLED CX", 800, "4K", "55"));
        lp.add(new Tv("Tv", "Sony", "Bravia XBR-55A9G", 3000, "4K", "65"));
        lp.add(new Tv("Tv", "Samsung", "QLED QN65LS03AAFXZA", 1400, "4K", "65"));

        Collections.sort(lp);

        return lp;
    }
}