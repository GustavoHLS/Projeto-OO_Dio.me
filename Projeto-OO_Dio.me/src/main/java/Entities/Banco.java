package Entities;

import lombok.Data;

import java.util.Set;
import java.util.HashSet;


@Data
public class Banco {
    public String nome;
    public Set<Cliente> clientes = new HashSet<Cliente>();

    public Banco(String nome){
        this.nome = nome;
    }
}
