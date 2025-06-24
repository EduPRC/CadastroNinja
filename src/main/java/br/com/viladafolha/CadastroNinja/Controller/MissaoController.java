package br.com.viladafolha.CadastroNinja.Controller;

import br.com.viladafolha.CadastroNinja.Endity.MissaoEntity;
import br.com.viladafolha.CadastroNinja.Endity.NinjaEntity;
import br.com.viladafolha.CadastroNinja.Service.MissaoService;
import br.com.viladafolha.CadastroNinja.Service.NinjaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/missao")
public class MissaoController {
    @Autowired
    private MissaoService missaoService;

    @GetMapping("/boasvindas")
    public String missaoBoasVindas(){ return "Ola voce acessou o sistema de missoes";}

    //CADASTRAR

    @PostMapping("/cadastrar")
    public MissaoEntity cadastrar (@RequestBody MissaoEntity missao){ return missaoService.cadastrar(missao); }

    //LISTAR

    @GetMapping("/listar")
    public List<MissaoEntity> listar(){ return missaoService.listar(); }


    //Pesquisar

    @GetMapping("/pesquisar/{id}")
    public MissaoEntity pesquisarMissao (@PathVariable Long id){ return missaoService.pesquisar(id);}

    //ALTERAR
    @PutMapping("/alterar/{id}")
    public MissaoEntity alterarMissao
            (@PathVariable Long id, @RequestBody MissaoEntity missao){
        return missaoService.alterar(id, missao);
    }

    //EXCLUIR
    @DeleteMapping("/deletar/{id}")
    public  void deletarMissao (@PathVariable Long id){ missaoService.deletar(id); }
}
