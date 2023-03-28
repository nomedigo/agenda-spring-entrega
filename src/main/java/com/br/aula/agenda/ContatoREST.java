package com.br.aula.agenda;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.br.aula.agenda.contatos.Contato;
import com.br.aula.agenda.database.RepositorioContatos;

@RestController
@RequestMapping("/contato")
public class ContatoREST {
    @Autowired
    private RepositorioContatos repositorio;

    @GetMapping
    public List<Contato>listar(){
        return repositorio.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody Contato contato){
        repositorio.save(contato);
    }

    @PutMapping
    public void alterar(@RequestBody Contato contato){
        if(contato.getId()> 0)
        repositorio.save(contato);
    }

    @DeleteMapping
    public void excluir(@RequestBody Contato contato){
        repositorio.delete(contato);
    }

}