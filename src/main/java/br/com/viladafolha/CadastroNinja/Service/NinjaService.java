package br.com.viladafolha.CadastroNinja.Service;


import br.com.viladafolha.CadastroNinja.Endity.NinjaEntity;
import br.com.viladafolha.CadastroNinja.Repository.NinjaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {
    @Autowired
    private NinjaRepository ninjaRepository;

    //CADASTRAR
    public NinjaEntity cadastrar(NinjaEntity ninja){
        return ninjaRepository.save(ninja);
    }
    //LISTAR
    public List<NinjaEntity> listar(){
        return ninjaRepository.findAll();
    }
    //PESQUISAR
    public NinjaEntity pesquisar(Long id){
        Optional<NinjaEntity> ninjaId = ninjaRepository.findById(id);
        return ninjaId.orElse(null);
    }
    //ALTERAR
    public NinjaEntity alterar (Long id, NinjaEntity ninjaAlterado){
        if(ninjaRepository.existsById(id)){
            ninjaAlterado.setId(id);
            return ninjaRepository.save(ninjaAlterado);
        }
        return null;
    }

    //DELETAR
    public void deletar(Long id){
        ninjaRepository.deleteById(id);
    }
}

