package br.com.viladafolha.CadastroNinja.Service;

import br.com.viladafolha.CadastroNinja.Endity.MissaoEntity;
import br.com.viladafolha.CadastroNinja.Endity.NinjaEntity;
import br.com.viladafolha.CadastroNinja.Repository.MissaoRepository;
import br.com.viladafolha.CadastroNinja.Repository.NinjaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissaoService {
    @Autowired
    private MissaoRepository missaoRepository;

    //CADASTRAR
    public MissaoEntity cadastrar(MissaoEntity missao){ return missaoRepository.save(missao); }

    //LISTAR
    public List<MissaoEntity> listar(){ return missaoRepository.findAll(); }

    //PESQUISAR
    public MissaoEntity pesquisar(Long id){
        Optional<MissaoEntity> missao = missaoRepository.findById(id);
        return missao.orElse(null);
    }

    //ALTERAR
    public MissaoEntity alterar (Long id, MissaoEntity missaoAlterado){
        if(missaoRepository.existsById(id)){
            missaoAlterado.setId(id);
            return missaoRepository.save(missaoAlterado);
        }
        return null;
    }

    //DELETAR
    public void deletar (Long id){ missaoRepository.deleteById(id); }

}
