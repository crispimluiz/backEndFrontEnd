package com.projeto.backEnd.service;

import com.projeto.backEnd.model.EnderecoModel;
import com.projeto.backEnd.model.UsuarioModel;
import com.projeto.backEnd.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {
    @Autowired
    private EnderecoRepository enderecoRepository;

    public EnderecoModel buscarId(Long id){
        Optional<EnderecoModel> obj = enderecoRepository.findById(id);
        return obj.get();
    }

    public List<EnderecoModel> buscarEnderecos(){
        return enderecoRepository.findAll();
    }

    public EnderecoModel cadastraEndereco(EnderecoModel enderecoModel){
        return enderecoRepository.save(enderecoModel);
    }

    public EnderecoModel atualizaEndereco (EnderecoModel enderecoModel, Long id){
        EnderecoModel newEndereco = buscarId(id); //id e verificado no metodo buscar id em cima
        newEndereco.setLogradouro(enderecoModel.getLogradouro());
        newEndereco.setNumero(enderecoModel.getNumero());
        newEndereco.setBairro(enderecoModel.getBairro());
        newEndereco.setCep(enderecoModel.getCep());
        newEndereco.setResidencialComercial(enderecoModel.getResidencialComercial());

        return enderecoRepository.save(newEndereco);
    }

    public void deletaEndereco(Long id){
        enderecoRepository.deleteById(id);
    }
}