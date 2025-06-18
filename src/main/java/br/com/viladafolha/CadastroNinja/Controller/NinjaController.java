package br.com.viladafolha.CadastroNinja.Controller;


import br.com.viladafolha.CadastroNinja.Endity.NinjaEntity;
import br.com.viladafolha.CadastroNinja.Service.NinjaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ninja")
public class NinjaController {
    @Autowired
    private NinjaService ninjaService;

    @GetMapping("/boasvindas")
    public String ninjaBoasVindas() {
        return "Olá voce acessou o sistema de cadastro ninja";
    }

    //CADASTRAR

    @PostMapping("/cadastrar")
    public NinjaEntity cadastrar(@RequestBody NinjaEntity ninja){
        return ninjaService.cadastrar(ninja);
    }

    //LISTAR
    
    @GetMapping("/listar")
    public List<NinjaEntity> listar(){
        return ninjaService.listar();
    }

    //Pesquisar
    @GetMapping("/pesquisar/{id}")
    public NinjaEntity pesquisarNinja (@PathVariable Long id){
        return ninjaService.pesquisar(id);
    }
    
    //ALTERAR
    @PutMapping("/alterar/{id}")
    public NinjaEntity alterarNinja
    (@PathVariable Long id, @RequestBody NinjaEntity ninja){
        return ninjaService.alterar(id,ninja);
    }

    //EXCLUIR
    @DeleteMapping("/deletar/{id}")
    public void deletarNinja (@PathVariable Long id){
        ninjaService.deletar(id);
    }
}
