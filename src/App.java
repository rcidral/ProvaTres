import java.util.Scanner;

import conduits.*;
import methods.*;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op;

        do {

            System.out.println("[1] - Cadastrar. ");
            System.out.println("[2] - Visualizar. ");
            System.out.println("[3] - Deletar");
            System.out.println("Digite sua opção: ");
            try {
                op = scanner.nextInt();
            } catch (Exception e) {
                op = 9;
            }
            switch(op) {
                case 1: {
                    do {
                        System.out.println("Cadastro. ");
                        System.out.println("[1] - Carro. ");
                        System.out.println("[2] - Moto. ");
                        System.out.println("[3] - Bicicleta");
                        System.out.println("[4] - Vaga");
                        System.out.println("[5] - Locação");
                        System.out.println("Digite sua opção: ");
                        try {
                            op = scanner.nextInt();
                        } catch (Exception e) {
                            op = 9;
                        }
                        switch(op) {
                            case 1: {
                                try {
                                    System.out.println("Digite o id: ");
                                    int id = scanner.nextInt();
                                    System.out.println("Digite o nome: ");
                                    String nome = scanner.next();
                                    System.out.println("Digite a placa: ");
                                    String placa = scanner.next();
                                    System.out.println("Digite a cor: ");
                                    String cor = scanner.next();

                                    new Carro(id, nome, placa, cor);
                                } catch (Exception e) {
                                    System.out.println("Erro ao cadastrar veículo. " + e.getMessage());
                                }
                                break;
                            }
                            case 2: {
                                try {
                                    System.out.println("Digite o id: ");
                                    int id = scanner.nextInt();
                                    System.out.println("Digite o nome: ");
                                    String nome = scanner.next();
                                    System.out.println("Digite a placa: ");
                                    String placa = scanner.next();
                                    System.out.println("Digite a cilindrada: ");
                                    String cilindrada = scanner.next();

                                    new Moto(id, nome, placa, cilindrada);
                                } catch (Exception e) {
                                    System.out.println("Erro ao cadastrar veículo. " + e.getMessage());
                                }
                                break;
                            }
                            case 3: {
                                try {
                                    System.out.println("Digite o id: ");
                                    int id = scanner.nextInt();
                                    System.out.println("Digite o nome: ");
                                    String nome = scanner.next();
                                    System.out.println("Digite a marca: ");
                                    String marca = scanner.next();
                                    System.out.println("Digite a cor: ");
                                    String cor = scanner.next();
                                    
                                    new Bicicleta(id, nome, marca, cor);
                                } catch (Exception e) {
                                    System.out.println("Erro ao cadastrar veículo. " + e.getMessage());
                                }
                                break;
                            }
                            case 4: {
                                try {
                                    System.out.println("Digite o id: ");
                                    int id = scanner.nextInt();
                                    System.out.println("Digite o número: ");
                                    int numero = scanner.nextInt();
                                    System.out.println("Digite o tamanho: ");
                                    String tamanho = scanner.next();
                                    System.out.println("Digite o preço: ");
                                    double preco = scanner.nextDouble();
                                    System.out.println("Digite o tipo da vaga: " + "\n" +
                                    "[1] - Carro." + "\n" +
                                    "[2] - Moto." + "\n" +
                                    "[3] - Bicicleta." + "\n");
                                    try {
                                        op = scanner.nextInt();
                                    } catch (Exception e) {
                                        op = 9;
                                    }
                                    switch (op) {
                                        case 1:{
                                            String tipo = "Carro";
                                            new Vaga(id, numero, tipo, tamanho, preco);
                                            break;
                                        }
                                        case 2:{
                                            String tipo = "Moto";
                                            new Vaga(id, numero, tipo, tamanho, preco);
                                            break;
                                        }
                                        case 3:{
                                            String tipo = "Bicicleta";
                                            new Vaga(id, numero, tipo, tamanho, preco);
                                            break;
                                        }
                                        default:{
                                            System.out.println("Opção errada. ");
                                            break;
                                        }
                                    }
                                } catch (Exception e) {
                                    System.out.println("Erro ao cadastrar vaga. " + e.getMessage());
                                }
                                break;
                            }
                            case 5: {
                                try{
                                    System.out.println("Digite o id: ");
                                    int id = scanner.nextInt();
                                    System.out.println("Digite a data: ");
                                    String data = scanner.next();
                                    Boolean dataVerificada = Locacao.verificaData(data);
                                    while (dataVerificada == true) {
                                        System.out.println("Data já em uso. " + "\n" + 
                                        "Digite uma nova data: ");
                                        data = scanner.next();
                                        dataVerificada = Locacao.verificaData(data);
                                    }
                                    System.out.println("Digite o id da vaga: ");
                                    int idVaga = scanner.nextInt();
                                    Vaga idVagaVerificado = Vaga.verificaId(idVaga);
                                     do {
                                        System.out.println("Qual o tipo de veículo: ");
                                        System.out.println("[1] - Carro. ");
                                        System.out.println("[2] - Moto. ");
                                        System.out.println("[3] - Bicicleta. " + "\n");
                                        try {
                                            op = scanner.nextInt();
                                        } catch (Exception e) {
                                            op = 9;
                                        }
                                        switch(op) {
                                            case 1: {
                                                System.out.println("Digite o id do carro: ");
                                                int idCarro = scanner.nextInt();
                                                Carro idCarroVerificado = Carro.verificaId(idCarro);
                
                                                new Locacao(id, data, idVagaVerificado, idCarroVerificado);
                                                break;
                                            }
                                            case 2: {
                                                System.out.println("Digite o id da moto: ");
                                                int idMoto = scanner.nextInt();
                                                Moto idMotoVerificado = Moto.verificaId(idMoto);

                                                new Locacao(id, data, idVagaVerificado, idMotoVerificado);
                                                break;
                                            }
                                            case 3: {
                                                System.out.println("Digite o id da bicicleta: ");
                                                int idBicicleta = scanner.nextInt();
                                                Bicicleta idBicicletaVerificado = Bicicleta.verificaId(idBicicleta);

                                                new Locacao(id, data, idVagaVerificado, idBicicletaVerificado);
                                                break;
                                            }
                                            default: {
                                                System.out.println("Opção errada.");
                                            }
                                        }
                                        break;
                                    } while (op != 0);
                                    break;
                                } catch (Exception e) {
                                    System.out.println("Erro ao cadastrar locação. " + e.getMessage());
                                }
                                break;
                            }
                            default: {
                                System.out.println("Opção errada. ");
                                break;
                            }
                        }
                        break;
                    } while (op != 0);
                    break;
                }
                case 2: {
                    do {
                        System.out.println("Visualização. ");
                        System.out.println("[1] - Carro. ");
                        System.out.println("[2] - Moto. ");
                        System.out.println("[3] - Bicicleta");
                        System.out.println("[4] - Vaga");
                        System.out.println("[5] - Locação");
                        System.out.println("Digite sua opção: ");
                        try {
                            op = scanner.nextInt();
                        } catch (Exception e) {
                            op = 9;
                        }
                        switch(op) {
                            case 1: {
                                try {
                                    for (Carro carro : Carro.carros) {
                                        System.out.println(carro);
                                    }
                                } catch (Exception e) {
                                    System.out.println("Erro ao listar veículo. " + e.getMessage());
                                }
                                break;
                            }
                            case 2: {
                                try {
                                    for (Moto moto : Moto.motos) {
                                        System.out.println(moto);
                                    }
                                } catch (Exception e) {
                                    System.out.println("Erro ao listar veículo. " + e.getMessage());
                                }
                                break;
                            }
                            case 3: {
                                try {
                                    for (Bicicleta bicicleta : Bicicleta.bicicletas) {
                                        System.out.println(bicicleta);
                                    }
                                } catch (Exception e) {
                                    System.out.println("Erro ao listar veículo. " + e.getMessage());
                                }
                                break;
                            }
                            case 4: {
                                try {
                                    for (Vaga vaga : Vaga.vagas) {
                                        System.out.println(vaga);
                                    }
                                } catch (Exception e) {
                                    System.out.println("Erro ao listar vaga. " + e.getMessage());
                                }
                                break;
                            }
                            case 5: {
                                try {
                                    for (Locacao locacao : Locacao.locacaos) {
                                        System.out.println(locacao);
                                    }
                                } catch (Exception e) {
                                    System.out.println("Erro ao listar locação. " + e.getMessage());
                                }
                                break;
                            }
                            default: {
                                System.out.println("Opção errada. ");
                                break;
                            }
                        }
                        break;
                    } while (op != 0);
                    break;
                }
                case 3: {
                    do {
                        System.out.println("Exclusão. ");
                        System.out.println("[1] - Carro. ");
                        System.out.println("[2] - Moto. ");
                        System.out.println("[3] - Bicicleta");
                        System.out.println("[4] - Vaga");
                        System.out.println("[5] - Locação");
                        System.out.println("Digite sua opção: ");
                        try {
                            op = scanner.nextInt();
                        } catch (Exception e) {
                            op = 9;
                        }
                        switch(op) {
                            case 1: {
                                try {
                                    System.out.println("Digite o id: ");
                                    int id = scanner.nextInt();
                                    Carro.removeCarro(id);
                                } catch (Exception e) {
                                    System.out.println("Erro ao excluir veículo. " + e.getMessage());
                                }
                                break;
                            }
                            case 2: {
                                try {
                                    System.out.println("Digite o id: ");
                                    int id = scanner.nextInt();
                                    Moto.removeMoto(id);
                                } catch (Exception e) {
                                    System.out.println("Erro ao excluir veículo. " + e.getMessage());
                                }
                                break;
                            }
                            case 3: {
                                try {
                                    System.out.println("Digite o id: ");
                                    int id = scanner.nextInt();
                                    Bicicleta.removeBicicleta(id);
                                } catch (Exception e) {
                                    System.out.println("Erro ao excluir veículo. " + e.getMessage());
                                }
                                break;
                            }
                            case 4: {
                                try {
                                    System.out.println("Digite o id: ");
                                    int id = scanner.nextInt();
                                    Vaga.removeVaga(id);
                                } catch (Exception e) {
                                    System.out.println("Erro ao excluir vaga. " + e.getMessage());
                                }
                                break;
                            }
                            case 5: {
                                try {
                                    System.out.println("Digite o id: ");
                                    int id = scanner.nextInt();
                                    Locacao.removeLocacao(id);
                                } catch (Exception e) {
                                    System.out.println("Erro ao excluir locação. " + e.getMessage());
                                }
                                break;
                            }
                            default: {
                                System.out.println("Opção errada. ");
                                break;
                            }
                        }
                        break;
                    } while (op != 0);
                    break;
                }
                default: {
                    System.out.println("Opção errada. ");
                    break;
                }
            }
        } while (op != 0);
        scanner.close();
    }
}
