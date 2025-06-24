package br.com.viladafolha.CadastroNinja.Controller;

import br.com.viladafolha.CadastroNinja.Endity.NinjaEntity;
import br.com.viladafolha.CadastroNinja.Service.NinjaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
@RequestMapping("/ui")
public class UiController {

    @Autowired
    private NinjaService ninjaService;

    @GetMapping("/index")
    public String index() {
        return "index"; }

        @GetMapping("/listarninjas")
    public String listarNinjas(Model model){
            List<NinjaEntity> ninjas = ninjaService.listar();
            model.addAttribute("ninjas", ninjas);
            return "ninjas";
        }

        @GetMapping("/cadastrarninjas")
    public String mostarFormulario(Model model){
        model.addAttribute("ninja", new NinjaEntity());
        return "cadastrarninja";
        }

        @PostMapping("/salvar")
    public String salvarNinja(@ModelAttribute NinjaEntity ninja){
        ninjaService.cadastrar(ninja);
        return "redirect:/ui/listarninjas";
        }
}
