package org.arthurca.poointerfaces.repositorio;

import org.arthurca.poointerfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);
}
