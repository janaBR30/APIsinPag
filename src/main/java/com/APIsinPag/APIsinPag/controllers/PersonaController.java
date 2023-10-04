package com.APIsinPag.APIsinPag.controllers;

import com.APIsinPag.APIsinPag.entities.Persona;
import com.APIsinPag.APIsinPag.services.PersonaService;
import com.APIsinPag.APIsinPag.services.PersonaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl>{

}
