    package com.example.escolajardimviver.dto;

    import java.io.Serializable;

    public class ResponsavelDTO implements Serializable {
        private String nome;
        private String sobrenome;
        private String email;
        private int idade;
        private String endereco;

        public ResponsavelDTO() {}

        public ResponsavelDTO(String nome, String sobrenome, String email, int idade, String endereco) {
            this.nome = nome;
            this.sobrenome = sobrenome;
            this.email = email;
            this.idade = idade;
            this.endereco = endereco;
        }
        public String getNome() { return nome; }
        public void setNome(String nome) { this.nome = nome; }

        public String getSobrenome () { return sobrenome; }
        public void setSobrenome(String sobrenome) { this.sobrenome = sobrenome; }

        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }

        public int getIdade() { return idade; }
        public void setIdade(int idade) { this.idade =  idade; }

        public String getEndereco() { return endereco; }
        public void setEndereco(String endereco)  { this.endereco = endereco; }

    }
