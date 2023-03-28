package com.br.aula.agenda.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.aula.agenda.contatos.Contato;

public interface RepositorioContatos extends JpaRepository<Contato,Long>{
    
}
