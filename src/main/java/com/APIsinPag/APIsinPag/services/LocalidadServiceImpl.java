package com.APIsinPag.APIsinPag.services;

import com.APIsinPag.APIsinPag.entities.Localidad;
import com.APIsinPag.APIsinPag.repositories.BaseRepository;
import com.APIsinPag.APIsinPag.repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {

    @Autowired
    private LocalidadRepository localidadRepository;

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }
}
