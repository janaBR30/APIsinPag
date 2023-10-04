package com.APIsinPag.APIsinPag.services;

import com.APIsinPag.APIsinPag.entities.Persona;
import com.APIsinPag.APIsinPag.repositories.BaseRepository;
import com.APIsinPag.APIsinPag.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService{

    @Autowired
    private PersonaRepository personaRepository; //podemos injectar la depend de dos formas con constructor o autowired

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository, PersonaRepository personaRepository) {
        super(baseRepository);
        this.personaRepository = personaRepository;
    }
}
