package br.com.viladafolha.CadastroNinja.Repository;

import br.com.viladafolha.CadastroNinja.Endity.NinjaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NinjaRepository extends JpaRepository<NinjaEntity, Long> {

}
