package com.mycompany.srav;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carlo
 */
import java.io.Serializable;
import java.util.*;


public class DataStorage implements Serializable {
    private List<Voo> listaVoosLisboaToBarcelona;
    private List<Voo> listaVoosLisboaToParis;
    private List<Voo> listaVoosLisboaToLondres;
    private List<Voo> listaVoosLisboaToAmesterdao;
    private List<Voo> listaVoosLisboaToAtenas;
    private List<Voo> listaVoosLisboaToVarsovia;
    private List<Voo> listaVoosBarcelonaToLisboa;
    private List<Voo> listaVoosParisToLisboa;
    private List<Voo> listaVoosLondresToLisboa;
    private List<Voo> listaVoosAmesterdaoToLisboa;
    private List<Voo> listaVoosAtenasToLisboa;
    private List<Voo> listaVoosVarsoviaToLisboa;
    private List<String> idClientes;
    private List<AdminRegister> listaAdmins;  
    private List<String> idVoos;
    private List<String> lugarEscolhido;
    private List<String> listaNomeTodosLugares;
    private static DataStorage instance;
    private List<List<Voo>> listaDeListasDeVoos;
    private List<Cliente> listaDeClientes;
    private boolean flagLisboaToBarcelonaButton;
    private boolean flagLisboaToParisButton;
    private boolean flagLisboaToLondresButton;
    private boolean flagLisboaToAmesterdaoButton;
    private boolean flagLisboaToAtenasButton;
    private boolean flagLisboaToVarsoviaButton;
    private boolean flagBarcelonaToLisboaButton;
    private boolean flagParisToLisboaButton;
    private boolean flagLondresToLisboaButton;
    private boolean flagAmesterdaoToLisboaButton;
    private boolean flagAtenasToLisboaButton;
    private boolean flagVarsoviaToLisboaButton;
    

    public DataStorage() {
  
        listaVoosLisboaToBarcelona = new ArrayList<>();
        listaVoosLisboaToParis = new ArrayList<>();
        listaVoosLisboaToLondres = new ArrayList<>();
        listaVoosLisboaToAmesterdao = new ArrayList<>();
        listaVoosLisboaToAtenas = new ArrayList<>();
        listaVoosLisboaToVarsovia = new ArrayList<>();
        listaVoosBarcelonaToLisboa = new ArrayList<>();
        listaVoosParisToLisboa = new ArrayList<>();
        listaVoosLondresToLisboa = new ArrayList<>();
        listaVoosAmesterdaoToLisboa = new ArrayList<>();
        listaVoosAtenasToLisboa = new ArrayList<>();
        listaVoosVarsoviaToLisboa = new ArrayList<>();
        idClientes = new ArrayList<>();
        listaAdmins = new ArrayList<>();
        idVoos = new ArrayList<>();
        lugarEscolhido = new ArrayList<>();
        listaDeListasDeVoos = new ArrayList<>();
        listaDeClientes = new ArrayList<>();
        listaNomeTodosLugares = new ArrayList<>();
        listaDeListasDeVoos.add(listaVoosLisboaToBarcelona);
        listaDeListasDeVoos.add(listaVoosLisboaToParis);
        listaDeListasDeVoos.add(listaVoosLisboaToLondres);
        listaDeListasDeVoos.add(listaVoosLisboaToAmesterdao);
        listaDeListasDeVoos.add(listaVoosLisboaToAtenas);
        listaDeListasDeVoos.add(listaVoosLisboaToVarsovia);
        listaDeListasDeVoos.add(listaVoosBarcelonaToLisboa);
        listaDeListasDeVoos.add(listaVoosParisToLisboa);
        listaDeListasDeVoos.add(listaVoosLondresToLisboa);
        listaDeListasDeVoos.add(listaVoosAmesterdaoToLisboa);
        listaDeListasDeVoos.add(listaVoosAtenasToLisboa);
        listaDeListasDeVoos.add(listaVoosVarsoviaToLisboa);
        flagLisboaToBarcelonaButton = false;
        flagLisboaToParisButton = false;
        flagLisboaToLondresButton = false;
        flagLisboaToAmesterdaoButton = false;
        flagLisboaToAtenasButton = false;
        flagLisboaToVarsoviaButton = false;
        flagBarcelonaToLisboaButton = false;
        flagParisToLisboaButton = false;
        flagLondresToLisboaButton = false;
        flagAmesterdaoToLisboaButton = false;
        flagAtenasToLisboaButton = false;
        flagVarsoviaToLisboaButton = false;

    }
    
    public List<Voo> getListaVoosLisboaToBarcelona() {
        return listaVoosLisboaToBarcelona;
    }
    public void setListaVoosLisboaToBarcelona(List<Voo> listaVoosLisboaToBarcelona) {
        this.listaVoosLisboaToBarcelona = listaVoosLisboaToBarcelona;
    }
    
    
    public List<Voo> getListaVoosLisboaToParis() {
        return listaVoosLisboaToParis;
    }

    public void setListaVoosLisboaToParis(List<Voo> listaVoosLisboaToParis) {
        this.listaVoosLisboaToParis = listaVoosLisboaToParis;
    }
    
    
    public List<Voo> getListaVoosLisboaToLondres() {
        return listaVoosLisboaToLondres;
    }

    public void setListaVoosLisboaToLondres(List<Voo> listaVoosLisboaToLondres) {
        this.listaVoosLisboaToLondres = listaVoosLisboaToLondres;
    }
    
    
    public List<Voo> getListaVoosLisboaToAmesterdao() {
        return listaVoosLisboaToAmesterdao;
    }

    public void setListaVoosLisboaToAmesterdao(List<Voo> listaVoosLisboaToAmesterdao) {
        this.listaVoosLisboaToAmesterdao = listaVoosLisboaToAmesterdao;
    }
    
    
    
    public List<Voo> getListaVoosLisboaToAtenas() {
        return listaVoosLisboaToAtenas;
    }

    public void setListaVoosLisboaToAtenas(List<Voo> listaVoosLisboaToAtenas) {
        this.listaVoosLisboaToAtenas = listaVoosLisboaToAtenas;
    }
    
    
    public List<Voo> getListaVoosLisboaToVarsovia() {
        return listaVoosLisboaToVarsovia;
    }

    public void setListaVoosLisboaToVarsovia(List<Voo> listaVoosLisboaToVarsovia) {
        this.listaVoosLisboaToVarsovia = listaVoosLisboaToVarsovia;
    }
    
    
    public List<Voo> getListaVoosBarcelonaToLisboa() {
        return listaVoosBarcelonaToLisboa;
    }

    public void setListaVoosBarcelonaToLisboa(List<Voo> listaVoosBarcelonaToLisboa) {
        this.listaVoosBarcelonaToLisboa = listaVoosBarcelonaToLisboa;
    }
    
    
    
    public List<Voo> getListaVoosParisToLisboa() {
        return listaVoosParisToLisboa;
    }

    public void setListaVoosParisToLisboa(List<Voo> listaVoosParisToLisboa) {
        this.listaVoosParisToLisboa = listaVoosParisToLisboa;
    }
    
    
    public List<Voo> getListaVoosLondresToLisboa() {
        return listaVoosLondresToLisboa;
    }

    public void setListaVoosLondresToLisboa(List<Voo> listaVoosLondresToLisboa) {
        this.listaVoosLondresToLisboa = listaVoosLondresToLisboa;
    }
  
    
    public List<Voo> getListaVoosAmesterdaoToLisboa() {
        return listaVoosAmesterdaoToLisboa;
    }

    public void setListaVoosAmesterdaoToLisboa(List<Voo> listaVoosAmesterdaoToLisboa) {
        this.listaVoosAmesterdaoToLisboa = listaVoosAmesterdaoToLisboa;
    }
    
    
    public List<Voo> getListaVoosAtenasToLisboa() {
        return listaVoosAtenasToLisboa;
    }

    public void setListaVoosAtenasToLisboa(List<Voo> listaVoosAtenasToLisboa) {
        this.listaVoosAtenasToLisboa = listaVoosAtenasToLisboa;
    }
    
    
    public List<Voo> getListaVoosVarsoviaToLisboa() {
        return listaVoosVarsoviaToLisboa;
    }

    public void setListaVoosVarsoviaToLisboa(List<Voo> listaVoosVarsoviaToLisboa) {
        this.listaVoosVarsoviaToLisboa = listaVoosVarsoviaToLisboa;
    }
    
    
    
    public List<String> getIdClientes() {
        return idClientes;
    }

    public void setIdClientes(List<String> idClientes) {
        this.idClientes = idClientes;
    }
    
    
    public List<AdminRegister> getListaAdmins() {
        return listaAdmins;
    }

    public void setListaAdmins(List<AdminRegister> listaAdmins) {
        this.listaAdmins = listaAdmins;
    }
    
    public List<List<Voo>> getListaDeListasDeVoos() {
        return listaDeListasDeVoos;
    }

    public void setListaDeListasDeVoos(List<List<Voo>> listaDeListasDeVoos) {
        this.listaDeListasDeVoos = listaDeListasDeVoos;
    }
    
   public void removerVooDaListaDeListasDeVoos(Voo voo) {
        for (int i = 0; i < listaDeListasDeVoos.size(); i++) {
            List<Voo> listaVoos = listaDeListasDeVoos.get(i);
            if (listaVoos.contains(voo)) {
                listaVoos.remove(voo);
                return; 
        }
    }
}
    
    public List<String> getListaNomeTodosLugares() {
        return listaNomeTodosLugares;
    }

    public void setListaNomeTodosLugares(List<String> listaNomeTodosLugares) {
        this.listaNomeTodosLugares = listaNomeTodosLugares;
    }
    
   
    public List<String> getIdVoos() {
        return idVoos;
    }

    public void setIdVoos(List<String> idVoos) {
        this.idVoos = idVoos;
    }
    
    public static DataStorage getInstance() {
        if (instance == null) {
            instance = new DataStorage();
        }
        return instance;
    }
    
    
    public boolean isFlagLisboaToBarcelonaButton() {
        return flagLisboaToBarcelonaButton;
    }

    public void setFlagLisboaToBarcelonaButton(boolean flagLisboaToBarcelonaButton) {
        this.flagLisboaToBarcelonaButton = flagLisboaToBarcelonaButton;
    }

    public boolean isFlagLisboaToParisButton() {
        return flagLisboaToParisButton;
    }

    public void setFlagLisboaToParisButton(boolean flagLisboaToParisButton) {
        this.flagLisboaToParisButton = flagLisboaToParisButton;
    }
    
    public boolean isFlagLisboaToLondresButton() {
        return flagLisboaToLondresButton;
    }

    public void setFlagLisboaToLondresButton(boolean flagLisboaToLondresButton) {
        this.flagLisboaToLondresButton = flagLisboaToLondresButton;
    }

    public boolean isFlagLisboaToAmesterdaoButton() {
        return flagLisboaToAmesterdaoButton;
    }

    public void setFlagLisboaToAmesterdaoButton(boolean flagLisboaToAmesterdaoButton) {
        this.flagLisboaToAmesterdaoButton = flagLisboaToAmesterdaoButton;
    }
    
    public boolean isFlagLisboaToVarsoviaButton() {
        return flagLisboaToVarsoviaButton;
    }

    public void setFlagLisboaToVarsoviaButton(boolean flagLisboaToVarsoviaButton) {
        this.flagLisboaToVarsoviaButton = flagLisboaToVarsoviaButton;
    }
    
    public boolean isFlagLisboaToAtenasButton() {
        return flagLisboaToAtenasButton;
    }

    public void setFlagLisboaToAtenasButton(boolean flagLisboaToAtenasButton) {
        this.flagLisboaToAtenasButton = flagLisboaToAtenasButton;
    }

    public boolean isFlagBarcelonaToLisboaButton() {
        return flagBarcelonaToLisboaButton;
    }

    public void setFlagBarcelonaToLisboaButton(boolean flagBarcelonaToLisboaButton) {
        this.flagBarcelonaToLisboaButton = flagBarcelonaToLisboaButton;
    }
    
    public boolean isFlagLondresToLisboaButton() {
        return flagLondresToLisboaButton;
    }

    public void setFlagLondresToLisboaButton(boolean flagLondresToLisboaButton) {
        this.flagLondresToLisboaButton = flagLondresToLisboaButton;
    }
    
    public boolean isFlagParisToLisboaButton() {
        return flagParisToLisboaButton;
    }

    public void setFlagParisToLisboaButton(boolean flagParisToLisboaButton) {
        this.flagParisToLisboaButton = flagParisToLisboaButton;
    }

    public boolean isFlagAmesterdaoToLisboaButton() {
        return flagAmesterdaoToLisboaButton;
    }

    public void setFlagAmesterdaoToLisboaButton(boolean flagAmesterdaoToLisboaButton) {
        this.flagAmesterdaoToLisboaButton = flagAmesterdaoToLisboaButton;
    }
    
     public boolean isFlagAtenasToLisboaButton() {
        return flagAtenasToLisboaButton;
    }

    public void setFlagAtenasToLisboaButton(boolean flagAtenasToLisboaButton) {
        this.flagAtenasToLisboaButton = flagAtenasToLisboaButton;
    }

    public boolean isFlagVarsoviaToLisboaButton() {
        return flagVarsoviaToLisboaButton;
    }

    public void setFlagVarsoviaToLisboaButton(boolean flagVarsoviaToLisboaButton) {
        this.flagVarsoviaToLisboaButton = flagVarsoviaToLisboaButton;
    }
    
    public List<Cliente> getListaDeClientes() {
        return listaDeClientes;
    }

    public void setListaDeClientes(List<Cliente> listaDeClientes) {
        this.listaDeClientes = listaDeClientes;
    }
    
    public List<String> getLugarEscolhido() {
        return lugarEscolhido;
    }

    public void setLugarEscolhido(List<String> lugarEscolhido) {
        this.lugarEscolhido = lugarEscolhido;
    }
    
}



