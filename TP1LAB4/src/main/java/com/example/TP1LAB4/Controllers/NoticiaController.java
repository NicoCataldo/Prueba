package com.example.TP1LAB4.Controllers;

import com.example.TP1LAB4.Entities.Noticia;
import com.example.TP1LAB4.Services.NoticiaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/v1/Noticias")
public class NoticiaController extends BaseControllerImpl<Noticia, NoticiaServiceImpl> {
}