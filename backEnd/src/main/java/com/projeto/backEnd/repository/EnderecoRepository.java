package com.projeto.backEnd.repository;

import com.projeto.backEnd.model.EnderecoModel;
import com.projeto.backEnd.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnderecoRepository extends JpaRepository<EnderecoModel,Long> {

}

