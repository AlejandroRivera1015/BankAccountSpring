package com.Bank.Application.Controllers.FacturasController;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bank.Application.Entities.DTO.FacturaDTO;

@RestController
@RequestMapping("/facturas")
public class FacturasController {

    @PostMapping("/create")
    public void facturaRequest(@RequestBody FacturaDTO factura) {

        System.out.println(factura);

    }
}
