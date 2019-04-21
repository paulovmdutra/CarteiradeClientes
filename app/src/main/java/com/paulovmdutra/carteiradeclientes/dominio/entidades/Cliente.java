package com.paulovmdutra.carteiradeclientes.dominio.entidades;

import java.io.Serializable;

/**
 * Created by paulovmdutra on 02/07/17.
 */
public class Cliente implements Serializable{

    public int codigo;
    public String nome;
    public String endereco;
    public String email;
    public String telefone;

    public Cliente(){
        codigo = 0;
    }

}
