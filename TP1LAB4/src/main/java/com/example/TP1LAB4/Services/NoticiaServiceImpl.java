package com.example.TP1LAB4.Services;

import com.example.TP1LAB4.Entities.Noticia;
import com.example.TP1LAB4.Repositories.BaseRepository;
import com.example.TP1LAB4.Repositories.NoticiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticiaServiceImpl extends BaseServiceImpl<Noticia,Long> implements NoticiaService{
    @Autowired
    private NoticiaRepository noticiaRepository;
    public NoticiaServiceImpl(BaseRepository<Noticia, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Noticia> findAll() throws Exception {
        try {
            List<Noticia> entities = baseRepository.findAll();
            return entities;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
