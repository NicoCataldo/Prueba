package com.example.TP1LAB4.Controllers;

import com.example.TP1LAB4.Entities.Empresa;
import com.example.TP1LAB4.Services.EmpresaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/Empresas")
public class EmpresaController extends BaseControllerImpl<Empresa, EmpresaServiceImpl> {

}
