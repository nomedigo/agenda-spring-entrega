package com.br.aula.agenda.contatos;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name="TB_CONTATOS")
public class Contato {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String dtnasicmento;
    @Column(nullable = false)
    private String profissao;
    @Column(nullable = false)
    private String telefone;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDtnasicmento() {
        return dtnasicmento;
    }
    public void setDtnasicmento(String dtnasicmento) {
        this.dtnasicmento = dtnasicmento;
    }

    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
}
