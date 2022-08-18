package com.ventas.ventas.controller;
import com.ventas.ventas.model.Cliente;
import com.ventas.ventas.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")

public class ClienteController {

   @Autowired
   private ClienteService clienteService;

   @GetMapping("/findAll")
   public ResponseEntity<List<Cliente>> findAll()
   {
      return ResponseEntity.ok(clienteService.findAll());
   }

   @GetMapping("/findById/{id}")
   public ResponseEntity<Cliente> findById(@PathVariable("id") Integer idCliente){
      return clienteService.findById(idCliente).map(ResponseEntity::ok).orElseGet(()->ResponseEntity.notFound().build());
   }
}
