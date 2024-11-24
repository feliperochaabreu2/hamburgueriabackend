package com.hamburgueria.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hamburgueria.backend.model.Pedido;
import com.hamburgueria.backend.service.PedidoService;

@RestController
@RequestMapping("/pedido")
public class PedidoController {
	@Autowired
    private PedidoService pedidoService;

    @PostMapping("/finalizar")
    public Pedido finalizarPedido(@RequestBody Pedido pedido) {
        return pedidoService.criarPedido(pedido);
    }
    
    @GetMapping("/ping")
    public String testar() {
        return "OK Sucesso";
    }

    @GetMapping
    public List<Pedido> listarPedidos() {
        return pedidoService.listarPedidos();
    }

}
