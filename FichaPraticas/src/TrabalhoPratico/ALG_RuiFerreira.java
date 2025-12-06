package FichaPratica01.TrabalhoPratico;

import java.util.Scanner;

public class ALG_RuiFerreira {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //declarar varias dos produtos,codigo,preço e a categoria
        //loja1 e loja2
        // Produto 1
        String codigo1 = "P01";
        String nome1 = "Teclado";
        double preco1 = 25.0;
        String categoria1 = "Periferico";
        int stock1Loja1 = 0;
        int stock1Loja2 = 0;

        // Produto 2
        String codigo2 = "P02";
        String nome2 = "PenUSB";
        double preco2 = 15.0;
        String categoria2 = "Armanezamento";
        int stock2Loja1 = 0;
        int stock2Loja2 = 0;

        // Produto 3
        String codigo3 = "P03";
        String nome3 = "Monitor";
        double preco3 = 150.0;
        String categoria3 = "Imagem e Som";
        int stock3Loja1 = 0;
        int stock3Loja2 = 0;

        // Produto 4
        String codigo4 = "P04";
        String nome4 = "Router";
        double preco4 = 80.0;
        String categoria4 = "Redes e Comunicações";
        int stock4Loja1 = 0;
        int stock4Loja2 = 0;


        //Login da loja1
        String loginLoja1 = "Loja1";
        String passLoja1 = "1234";
        //Login da loja2
        String loginLoja2 = "Loja2";
        String passLoja2 = "2345";

        //modos do loggin
        boolean programaAtivo = true;
        boolean loggin = false;
        String username;
        String password;

        //IDENTIFICAR LOJA ATUAL
        int lojaAtual = 0;


        //Loggin

        while (programaAtivo) {
            if (!loggin) {                  //alterei o valor do boolean
                System.out.println("-----Bem-vindo----- ");
                System.out.print("Introduza o Username (ou 'sair' para terminar): ");
                username = input.nextLine();
                if (username.equals("sair")) {
                    programaAtivo = false;
                    break;
                }
                System.out.print("Introduza a Password: ");
                password = input.nextLine();

                if (username.equals(loginLoja1) && password.equals(passLoja1)) {
                    lojaAtual = 1;
                    loggin = true;
                    System.out.println("Bem-vindo há Loja 1");
                } else if (username.equals(loginLoja2) && password.equals(passLoja2)) {
                    lojaAtual = 2;
                    loggin = true;
                    System.out.println("Bem-vindo há Loja 2");
                } else {
                    System.out.println("Login invalido. Tente novamente.");
                }
            } else {                              //quando entra na loja
                System.out.println();
                System.out.println("----- MENU PRINCIPAL -----");
                System.out.println("1. Consultar Informacoes");
                System.out.println("2. Adquirir");
                System.out.println("3. Vender");
                System.out.println("4. Transferir Stock entre Lojas");
                System.out.println("5. Simular Venda Total - Loja Atual");
                System.out.println("6. Simular Venda Total - Todas as Lojas");
                System.out.println("7. Loja com Maior Valor");
                System.out.println("8. Logout");
                System.out.print("Escolha uma opcao: ");

                //Variavel para o switch case
                int opcao = input.nextInt();
                input.nextLine();

                switch (opcao) {
                    case 1: //Consultar Informações
                        System.out.println();
                        System.out.println("----- Produtos -----");
                        // Produto 1
                        System.out.print("1. Codigo: ");
                        System.out.print(codigo1);
                        System.out.print(" Nome: ");
                        System.out.print(nome1);
                        System.out.print(" Preco: ");
                        System.out.print(preco1);
                        System.out.print(" Categoria: ");
                        System.out.print(categoria1);
                        System.out.print(" Stock: ");
                        if (lojaAtual == 1) {
                            System.out.println(stock1Loja1);
                        } else {
                            System.out.println(stock1Loja2);
                        }

                        // Produto 2
                        System.out.print("2. Codigo: ");
                        System.out.print(codigo2);
                        System.out.print(" Nome: ");
                        System.out.print(nome2);
                        System.out.print(" Preco: ");
                        System.out.print(preco2);
                        System.out.print(" Categoria: ");
                        System.out.print(categoria2);
                        System.out.print(" Stock: ");
                        if (lojaAtual == 1) {
                            System.out.println(stock2Loja1);
                        } else {
                            System.out.println(stock2Loja2);
                        }

                        // Produto 3
                        System.out.print("3. Codigo: ");
                        System.out.print(codigo3);
                        System.out.print(" Nome: ");
                        System.out.print(nome3);
                        System.out.print(" Preco: ");
                        System.out.print(preco3);
                        System.out.print(" Categoria: ");
                        System.out.print(categoria3);
                        System.out.print(" Stock: ");
                        if (lojaAtual == 1) {
                            System.out.println(stock3Loja1);
                        } else {
                            System.out.println(stock3Loja2);
                        }

                        // Produto 4
                        System.out.print("4. Codigo: ");
                        System.out.print(codigo4);
                        System.out.print(" Nome: ");
                        System.out.print(nome4);
                        System.out.print(" Preco: ");
                        System.out.print(preco4);
                        System.out.print(" Categoria: ");
                        System.out.print(categoria4);
                        System.out.print(" Stock: ");
                        if (lojaAtual == 1) {
                            System.out.println(stock4Loja1);
                        } else {
                            System.out.println(stock4Loja2);
                        }
                        break;

                    case 2: //Adquirir(comprar) stock
                        System.out.println();
                        System.out.println("--- Adquirir Stock ---");
                        System.out.print("1. ");
                        System.out.print(nome1);
                        System.out.print(" (");
                        System.out.print(codigo1);
                        System.out.println(")");
                        System.out.print("2. ");
                        System.out.print(nome2);
                        System.out.print(" (");
                        System.out.print(codigo2);
                        System.out.println(")");
                        System.out.print("3. ");
                        System.out.print(nome3);
                        System.out.print(" (");
                        System.out.print(codigo3);
                        System.out.println(")");
                        System.out.print("4. ");
                        System.out.print(nome4);
                        System.out.print(" (");
                        System.out.print(codigo4);
                        System.out.println(")");
                        System.out.print("Escolha o numero do produto: ");

                        //mais 2 variaveis para o produto adiquirido
                        int ProdAdiquirido = input.nextInt();
                        int QuatidadeAdiquirida = input.nextInt();
                        System.out.print("Quantidade para adquirir: ");
                        input.nextLine();

                        if (ProdAdiquirido == 1) {
                            if (lojaAtual == 1) {
                                stock1Loja1 = stock1Loja1 + QuatidadeAdiquirida;
                            } else {
                                stock1Loja2 = stock1Loja2 + QuatidadeAdiquirida;
                            }
                        } else if (ProdAdiquirido == 2) {
                            if (lojaAtual == 1) {
                                stock2Loja1 = stock2Loja1 + QuatidadeAdiquirida;
                            } else {
                                stock2Loja2 = stock2Loja2 + QuatidadeAdiquirida;
                            }
                        } else if (ProdAdiquirido == 3) {
                            if (lojaAtual == 1) {
                                stock3Loja1 = stock3Loja1 + QuatidadeAdiquirida;
                            } else {
                                stock3Loja2 = stock3Loja2 + QuatidadeAdiquirida;
                            }
                        } else if (ProdAdiquirido == 4) {
                            if (lojaAtual == 1) {
                                stock4Loja1 = stock4Loja1 + QuatidadeAdiquirida;
                            } else {
                                stock4Loja2 = stock4Loja2 + QuatidadeAdiquirida;
                            }
                        }
                        System.out.println("Stock atualizado.");
                        break;

                    case 3: //Vender stock
                        System.out.println();
                        System.out.println("--- Vender ---");
                        System.out.print("1. ");
                        System.out.print(nome1);
                        System.out.print(" (");
                        System.out.print(codigo1);
                        System.out.print(") - Stock: ");
                        if (lojaAtual == 1) {
                            System.out.println(stock1Loja1);
                        } else {
                            System.out.println(stock1Loja2);
                        }
                        System.out.print("2. ");
                        System.out.print(nome2);
                        System.out.print(" (");
                        System.out.print(codigo2);
                        System.out.print(") - Stock: ");
                        if (lojaAtual == 1) {
                            System.out.println(stock2Loja1);
                        } else {
                            System.out.println(stock2Loja2);
                        }
                        System.out.print("3. ");
                        System.out.print(nome3);
                        System.out.print(" (");
                        System.out.print(codigo3);
                        System.out.print(") - Stock: ");
                        if (lojaAtual == 1) {
                            System.out.println(stock3Loja1);
                        } else {
                            System.out.println(stock3Loja2);
                        }
                        System.out.print("4. ");
                        System.out.print(nome4);
                        System.out.print(" (");
                        System.out.print(codigo4);
                        System.out.print(") - Stock: ");
                        if (lojaAtual == 1) {
                            System.out.println(stock4Loja1);
                        } else {
                            System.out.println(stock4Loja2);
                        }
                        System.out.print("Escolha o numero do produto: ");

                        //mais 2 variaveis para a venda
                        int ProdVenda = input.nextInt();
                        int QuatidadeVenda = input.nextInt();
                        System.out.print("Quantidade a vender: ");
                        input.nextLine();

                        //criar boolean caso nao tenha stock
                        boolean vendaO = false;

                        if (ProdVenda == 1) {
                            if (lojaAtual == 1 && stock1Loja1 >= QuatidadeVenda) {
                                stock1Loja1 = stock1Loja1 - QuatidadeVenda;
                                vendaO = true;
                            } else if (lojaAtual == 2 && stock1Loja2 >= QuatidadeVenda) {
                                stock1Loja2 = stock1Loja2 - QuatidadeVenda;
                                vendaO = true;
                            }
                        } else if (ProdVenda == 2) {
                            if (lojaAtual == 1 && stock2Loja1 >= QuatidadeVenda) {
                                stock2Loja1 = stock2Loja1 - QuatidadeVenda;
                                vendaO = true;
                            } else if (lojaAtual == 2 && stock2Loja2 >= QuatidadeVenda) {
                                stock2Loja2 = stock2Loja2 - QuatidadeVenda;
                                vendaO = true;
                            }
                        } else if (ProdVenda == 3) {
                            if (lojaAtual == 1 && stock3Loja1 >= QuatidadeVenda) {
                                stock3Loja1 = stock3Loja1 - QuatidadeVenda;
                                vendaO = true;
                            } else if (lojaAtual == 2 && stock3Loja2 >= QuatidadeVenda) {
                                stock3Loja2 = stock3Loja2 - QuatidadeVenda;
                                vendaO = true;
                            }
                        } else if (ProdVenda == 4) {
                            if (lojaAtual == 1 && stock4Loja1 >= QuatidadeVenda) {
                                stock4Loja1 = stock4Loja1 - QuatidadeVenda;
                                vendaO = true;
                            } else if (lojaAtual == 2 && stock4Loja2 >= QuatidadeVenda) {
                                stock4Loja2 = stock4Loja2 - QuatidadeVenda;
                                vendaO = true;
                            }
                        }

                        if (vendaO) {
                            System.out.println("Venda Autorizada.");
                        } else {
                            System.out.println("Erro-Stock Insuficiente.");
                        }
                        break;

                    case 4: //Transferir Stock entre Lojas
                        System.out.println();
                        System.out.println("--- Transferir Stock ---");
                        System.out.print("1. ");
                        System.out.print(nome1);
                        System.out.print(" (");
                        System.out.print(codigo1);
                        System.out.println(")");
                        System.out.print("2. ");
                        System.out.print(nome2);
                        System.out.print(" (");
                        System.out.print(codigo2);
                        System.out.println(")");
                        System.out.print("3. ");
                        System.out.print(nome3);
                        System.out.print(" (");
                        System.out.print(codigo3);
                        System.out.println(")");
                        System.out.print("4. ");
                        System.out.print(nome4);
                        System.out.print(" (");
                        System.out.print(codigo4);
                        System.out.println(")");
                        System.out.print("Escolha o numero do produto: ");

                        //variavel para a transfericia de produtos
                        int TransferenciaProduto = input.nextInt();
                        int QuantidadeTransferida = input.nextInt();
                        System.out.print("Quantidade a transferir: ");
                        input.nextLine();

                        if (TransferenciaProduto == 1) {
                            if (lojaAtual == 1 && stock1Loja1 >= QuantidadeTransferida) {
                                stock1Loja1 = stock1Loja1 - QuantidadeTransferida;
                                stock1Loja2 = stock1Loja2 + QuantidadeTransferida;
                                System.out.println("Transferencia realizada (Loja 1 para Loja 2).");
                            } else if (lojaAtual == 2 && stock1Loja2 >= QuantidadeTransferida) {
                                stock1Loja2 = stock1Loja2 - QuantidadeTransferida;
                                stock1Loja1 = stock1Loja1 + QuantidadeTransferida;
                                System.out.println("Transferencia realizada (Loja 2 para Loja 1).");
                            } else {
                                System.out.println("Não tem Stock Suficiente.");
                            }
                        } else if (TransferenciaProduto == 2) {
                            if (lojaAtual == 1 && stock2Loja1 >= QuantidadeTransferida) {
                                stock2Loja1 = stock2Loja1 - QuantidadeTransferida;
                                stock2Loja2 = stock2Loja2 + QuantidadeTransferida;
                                System.out.println("Transferencia realizada (Loja 1 para Loja 2).");
                            } else if (lojaAtual == 2 && stock2Loja2 >= QuantidadeTransferida) {
                                stock2Loja2 = stock2Loja2 - QuantidadeTransferida;
                                stock2Loja1 = stock2Loja1 + QuantidadeTransferida;
                                System.out.println("Transferencia realizada (Loja 2 para Loja 1).");
                            } else {
                                System.out.println("Não tem Stock Suficiente.");
                            }
                        } else if (TransferenciaProduto == 3) {
                            if (lojaAtual == 1 && stock3Loja1 >= QuantidadeTransferida) {
                                stock3Loja1 = stock3Loja1 - QuantidadeTransferida;
                                stock3Loja2 = stock3Loja2 + QuantidadeTransferida;
                                System.out.println("Transferencia realizada (Loja 1 para Loja 2).");
                            } else if (lojaAtual == 2 && stock3Loja2 >= QuantidadeTransferida) {
                                stock3Loja2 = stock3Loja2 - QuantidadeTransferida;
                                stock3Loja1 = stock3Loja1 + QuantidadeTransferida;
                                System.out.println("Transferencia realizada (Loja 2 para Loja 1).");
                            } else {
                                System.out.println("Não tem Stock Suficiente.");
                            }
                        } else if (TransferenciaProduto == 4) {
                            if (lojaAtual == 1 && stock4Loja1 >= QuantidadeTransferida) {
                                stock4Loja1 = stock4Loja1 - QuantidadeTransferida;
                                stock4Loja2 = stock4Loja2 + QuantidadeTransferida;
                                System.out.println("Transferencia realizada (Loja 1 para Loja 2).");
                            } else if (lojaAtual == 2 && stock4Loja2 >= QuantidadeTransferida) {
                                stock4Loja2 = stock4Loja2 - QuantidadeTransferida;
                                stock4Loja1 = stock4Loja1 + QuantidadeTransferida;
                                System.out.println("Transferencia realizada (Loja 2 para Loja 1).");
                            } else {
                                System.out.println("Não tem Stock Suficiente.");
                            }
                        }
                        break;

                    case 5: //Simular Venda Total da Loja Atual e criar variavel double
                        double totalLojaAtual = 0;
                        if (lojaAtual == 1) {
                            totalLojaAtual = stock1Loja1 * preco1;
                            totalLojaAtual = totalLojaAtual + stock2Loja1 * preco2;
                            totalLojaAtual = totalLojaAtual + stock3Loja1 * preco3;
                            totalLojaAtual = totalLojaAtual + stock4Loja1 * preco4;
                        } else {
                            totalLojaAtual = stock1Loja2 * preco1;
                            totalLojaAtual = totalLojaAtual + stock2Loja2 * preco2;
                            totalLojaAtual = totalLojaAtual + stock3Loja2 * preco3;
                            totalLojaAtual = totalLojaAtual + stock4Loja2 * preco4;
                        }
                        System.out.println();
                        System.out.print("Valor total do stock da Loja ");
                        System.out.print(lojaAtual);
                        System.out.print(": ");
                        System.out.println(totalLojaAtual);
                        break;

                    case 6: //Simular Venda Total – Todas as Lojas
                        double totalLoja1 = stock1Loja1 * preco1;
                        totalLoja1 = totalLoja1 + stock2Loja1 * preco2;
                        totalLoja1 = totalLoja1 + stock3Loja1 * preco3;
                        totalLoja1 = totalLoja1 + stock4Loja1 * preco4;

                        double totalLoja2 = stock1Loja2 * preco1;
                        totalLoja2 = totalLoja2 + stock2Loja2 * preco2;
                        totalLoja2 = totalLoja2 + stock3Loja2 * preco3;
                        totalLoja2 = totalLoja2 + stock4Loja2 * preco4;

                        double totalTodas = totalLoja1 + totalLoja2;
                        System.out.println();
                        System.out.print("Total do valor se vender todo o stock das lojas: ");
                        System.out.println(totalTodas);
                        break;

                    case 7: //Loja com Maior Valor
                        double valorLoja1 = stock1Loja1 * preco1;
                        valorLoja1 = valorLoja1 + stock2Loja1 * preco2;
                        valorLoja1 = valorLoja1 + stock3Loja1 * preco3;
                        valorLoja1 = valorLoja1 + stock4Loja1 * preco4;

                        double valorLoja2 = stock1Loja2 * preco1;
                        valorLoja2 = valorLoja2 + stock2Loja2 * preco2;
                        valorLoja2 = valorLoja2 + stock3Loja2 * preco3;
                        valorLoja2 = valorLoja2 + stock4Loja2 * preco4;

                        System.out.println();
                        if (valorLoja1 > valorLoja2) {
                            System.out.println("Loja com maior valor: Loja 1");
                        } else if (valorLoja2 > valorLoja1) {
                            System.out.println("Loja com maior valor: Loja 2");
                        } else {
                            System.out.println("As lojas tem o mesmo valor.");
                        }
                        break;

                    case 8: //Logout
                        loggin = false;
                        lojaAtual = 0;
                        System.out.println("Logout realizado.");
                        break;

                    default:
                        System.out.println("Opcao invalida.");
                        break;
                }
            }
        }
        System.out.println("Programa terminado. Até amanhâ.");
    }
}