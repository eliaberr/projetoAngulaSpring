package br.com.fatec.primeiroprojeto.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fatec.primeiroprojeto.entities.Pessoa;
import br.com.fatec.primeiroprojeto.repositorio.PessoaRepository;
import jakarta.persistence.EntityNotFoundException;
import java.util.List; 


@Service
public class PessoaService {
    @Autowired
    private PessoaRepository repository;

    
    public List<Pessoa> getPessoa(){
        return repository.findAll();
    }

    public Pessoa getPessoaById(int id){
        return repository.findById(id).orElseThrow(
            () -> new EntityNotFoundException("Essa Pessoa Não existe")
        );
    }
    
    public void deletePessoatById(int id){
        if (this.repository.existsById(id)) {
            this.repository.deleteById(id);;
        }

        else{
            throw new EntityNotFoundException("Essa Pessoa Não existe");
        }
    }

    public Pessoa save(Pessoa pessoa){
        return this.repository.save(pessoa);
    }

    public void update(int id, Pessoa pessoa) {
    
        try{
            Pessoa aux = repository.getReferenceById(id);
            aux.setName(Pessoa.getName());
            aux.setEmail(Pessoa.getEmail());
            aux.setTelefone(Pessoa.getTelefone());
            aux.setEndereco(Pessoa.getEndereco());
            aux.setCep(Pessoa.getCep());
            aux.setEstado(Pessoa.getEstado());
            this.repository.save(aux);
        }
        catch(EntityNotFoundException e)
        {
            throw new EntityNotFoundException("Essa Pessoa Não existe");
        }
        catch(Exception e)
        {
            throw new EntityNotFoundException("Erro!");
        }
        

    }

    public Object getPessoas() {
        return null;
    }



}
