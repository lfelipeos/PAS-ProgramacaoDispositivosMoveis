# 🏫 Escola Jardim Viver — Cadastro de Responsáveis

Este projeto é uma aplicação mobile desenvolvida para a **Ação de Aprendizagem 2 (PAS)** da disciplina de Programação Mobile. 
O objetivo do sistema é capturar e validar as informações de cadastro dos pais/responsáveis da instituição "Jardim Viver" utilizando arquitetura orientada a objetos com desacoplamento através de DTO (*Data Transfer Object*).

---

## Tecnologias Utilizadas

* **Linguagem:** Java
* **Plataforma:** Android (SDK Mínimo: API 21 - Android 5.0 Lollipop)
* **IDE:** Android Studio
* **Interface (UI):** XML (Layout Responsivo com `ScrollView`, `LinearLayout` e componentes estilizados em `Drawable`)
* **Arquitetura:** Padrão DTO para encapsulamento e transferência de dados

---

## Estrutura do Projeto e Arquitetura

O projeto adota boas práticas de desenvolvimento orientando a separação de responsabilidades:

```text
com.example.escolajardimviver/
│
├── dto/
│   └── ResponsavelDTO.java    # Objeto de Transferência de Dados (Encapsulamento, Getters/Setters)
│
└── MainActivity.java          # Lógica da Interface, Validação de Campos e Binding
