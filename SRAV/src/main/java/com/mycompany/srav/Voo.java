/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.srav;
import java.text.SimpleDateFormat;
import com.toedter.calendar.JDateChooser;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;

/**
 *
 * @author carlo
 */
public class Voo implements Serializable {
    private String partida;
    private String destino;
    private String dataString;
    private int lugaresLivres;
    private List<String> listaNomeLugaresOcupados;
    private String idVoo;
    private DataStorage vooDataStorage;

    public Voo(String partida, String destino, String dataString) {
        this.partida = partida;
        this.destino = destino;
        this.dataString = dataString;
        this.lugaresLivres = 180;
        this.vooDataStorage = DataStorage.getInstance();
        this.idVoo = gerarIdUnico();
        listaNomeLugaresOcupados = new ArrayList<>();
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

    public String getData() {
        return dataString;
    }

    public void setData(JDateChooser data) {
        java.util.Date dataSelecionada = data.getDate();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        this.dataString = formato.format(dataSelecionada); 
    }
    
    
    public int getLugaresLivres() {
        return lugaresLivres;
    }

    public void setLugaresLivres(int lugaresLivres) {
        this.lugaresLivres = lugaresLivres;
    }
    
    
    public String getIdVoo() {
        return idVoo;
    }

    public void setIdVoo(String idVoo) {
        this.idVoo = idVoo;
    }
    
    
    private String gerarIdUnico() {
        Random random = new Random();
        String novoId;
        boolean idUnico;

        do {
            idUnico = true; 
            StringBuilder idBuilder = new StringBuilder();
            for (int i = 0; i < 8; i++) {
                int digito = random.nextInt(10);
                idBuilder.append(digito);
            }
        novoId = idBuilder.toString();

        for (String id : vooDataStorage.getIdVoos()) {
            if (id.equals(novoId)) {
                idUnico = false; 
                break;
            }
        }
    } while (!idUnico);
        vooDataStorage.getIdVoos().add(novoId);
        return novoId;
}

    public List<String> getListaNomeLugaresOcupados() {
        return listaNomeLugaresOcupados;
    }

    public void setlistaNomeLugaresOcupados(List<String> listaNomeLugaresOcupados) {
        this.listaNomeLugaresOcupados = listaNomeLugaresOcupados;
    }
   
}
    
