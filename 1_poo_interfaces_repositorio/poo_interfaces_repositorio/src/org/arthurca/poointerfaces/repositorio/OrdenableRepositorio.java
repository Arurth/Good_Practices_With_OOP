package org.arthurca.poointerfaces.repositorio;

import org.arthurca.poointerfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {
    List<Cliente> listar(String campo, Direccion dir);
}
