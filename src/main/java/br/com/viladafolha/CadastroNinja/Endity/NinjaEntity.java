package br.com.viladafolha.CadastroNinja.Endity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jdk.jfr.BooleanFlag;
import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import static jakarta.persistence.GenerationType.IDENTITY;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="ninja")
public class NinjaEntity {

        @Id
        @GeneratedValue(strategy = IDENTITY)
        @Column(name="id_ninja")
        private Long id;
        @NotBlank
        @Column(name="nome_ninja", nullable = false)
        private String nome;
        @CPF
        @Column(name="cpf_ninja", unique = true)
        private String cpf;
        @Email
        @Column(name="email_ninja", unique = true)
        private String email;
    }

