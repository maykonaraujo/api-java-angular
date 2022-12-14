package com.br.dev.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.br.dev.api.models.Cliente;
@CrossOrigin("*")
@RestController
public class ClientesController {
    @GetMapping("/clientes.json")
    public List<Cliente> index() {
        return Cliente.todos();
    }

    @PostMapping("/clientes.json")
    public Cliente create(@RequestBody Cliente cliente) {
        cliente.setId(Cliente.todos().size() + 1);

        Cliente.adicionar(cliente);

        return cliente;
    }

    @GetMapping("/clientes/{id}.json")
    public Cliente create(@PathVariable int id) {
        var cliente = buscaPorId(id);

        return cliente;
    }

    @DeleteMapping("/clientes/{id}.json")
    public void delete(@PathVariable int id) {
        var cliente = buscaPorId(id);
        var clientes = Cliente.todos();

        clientes.remove(cliente);
        Cliente.set(clientes);
    }

    private Cliente buscaPorId(int id) {
        var cliente = new Cliente();

        for (Cliente c : Cliente.todos()) {
            if (c.equals(id)) {
                cliente = c;
                break;
            }
        }
        return cliente;
    }
}


