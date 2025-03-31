/*
 * Clique em nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt para alterar esta licença
 * Clique em nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java para editar este modelo
 */
package com.mycompany.srav;

/**
 * Representa um cliente com vários atributos e comportamentos relacionados com reservas de voos.
 * 
 * Autores: Carlos Rodrigues, João Pedro Andrade, Pedro Vicente
 */

import java.io.Serializable;
import java.util.Random;

public class Cliente implements Serializable {
    // Atributos
    private String nome; // Nome do cliente
    private Boolean querSeguro = false; // Se o cliente quer seguro
    private double precoSeguro; // Custo do seguro
    private Boolean bolsaMaoGratis = false; // Se o cliente tem bagagem de mão gratuita
    private String metodoPagamento; // Método de pagamento
    private Boolean querBagagemExtra = false; // Se o cliente quer bagagem extra
    private Double precoBagagemExtra; // Custo da bagagem extra
    private String id; // Identificador único do cliente
    private String partida; // Local de partida
    private String destino; // Local de destino
    private final Double taxaDeAdministracao = 15.0; // Taxa de administração aplicada a cada compra
    private DataStorage clienteDataStorage; // Armazenamento de dados do cliente
    private double precoAssento; // Preço do assento escolhido pelo cliente
    private String nomeAssento; // Nome do assento escolhido pelo cliente
    private double precoTotal; // Preço total a ser pago pelo cliente
    private String dataVooComprado; // Data do voo comprado pelo cliente
    private String idVooComprado; // Identificador do voo comprado pelo cliente
                
    
    // Construtor
    public Cliente() {
        boolean idUnico = false;
        String stringIdCliente = "";
        clienteDataStorage = DataStorage.getInstance();
        
        // Geração de um ID único para o cliente
        while (!idUnico) {
            Random random = new Random();
            StringBuilder finalId = new StringBuilder();
            for (int k = 0; k < 8; k++) {
                finalId.append(random.nextInt(10));
                stringIdCliente = finalId.toString();
            }

            if (!clienteDataStorage.getIdClientes().contains(stringIdCliente)) {
                clienteDataStorage.getIdClientes().add(stringIdCliente);
                this.id = stringIdCliente;
                idUnico = true;
            }
        }
    }


    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public Boolean getQuerSeguro() {
        return querSeguro;
    }

    public void setQuerSeguro(Boolean querSeguro) {
        this.querSeguro = querSeguro;
    
        if (querSeguro != null && querSeguro) {
            this.precoSeguro = 25.0; 
        } else {
            this.precoSeguro = 0.0;
    }
    }
    
    public double getPrecoSeguro() {
        return precoSeguro;
    }

    
    public Boolean getBolsaMaoGratis() {
        return bolsaMaoGratis;
    }

    public void setBolsaMaoGratis(Boolean bolsaMaoGratis) {
        this.bolsaMaoGratis = bolsaMaoGratis;
    }


    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }
   
    public Boolean getQuerBagagemExtra() {
        return querBagagemExtra;
    }
    
            
    public void setQuerBagagemExtra(Boolean querBagagemExtra) {
        this.querBagagemExtra = querBagagemExtra;
    
        if (querBagagemExtra != null && querBagagemExtra) {
            this.precoBagagemExtra = 30.0; 
        } else {
            this.precoBagagemExtra = 0.0;
        }
    }
    
    public double getPrecoBagagemExtra() {
        return precoBagagemExtra;
    }

    
    public String getPartida() {
        return partida;
    }

    public void setPartida(String partida) {
        this.partida = partida;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getTaxaDeAdministracao() {
        return taxaDeAdministracao;
    }
  
    public String getNomeAssento() {
        return nomeAssento;
    }

    public void setNomeAssento(String nomeAssento) {
        this.nomeAssento = nomeAssento;
    }
    
    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double novoPrecoTotal) {
        this.precoTotal = novoPrecoTotal;
    }
    
    public double getPrecoAssento() {
        return precoAssento;
    }

    public void setPrecoAssento(double novoPrecoAssento) {
        this.precoAssento = novoPrecoAssento;    
    }
    
    public String getDataVooComprado() {
        return dataVooComprado;
    }

    public void setDataVooComprado(String dataVooComprado) {
        this.dataVooComprado = dataVooComprado;
    }
    
    public String getIdVooComprado() {
        return idVooComprado;
    }

    public void setIdVooComprado(String idVooComprado) {
        this.idVooComprado = idVooComprado;
    }
}
