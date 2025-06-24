package br.com.viladafolha.CadastroNinja.Endity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jdk.jfr.BooleanFlag;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "missao")
public class MissaoEntity {

        @Id
        @GeneratedValue(strategy = IDENTITY)
        @Column(name = "id_missao")
        private Long id;
        @NotBlank
        @Column(name = "nome_missao", nullable = false)
        private String nome;
        @Column(name = "classificacao_missao")
        private Character classificacao;
        @BooleanFlag
        @Column(name = "status_missao")
        private Boolean status;
}
