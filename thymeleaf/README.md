Projeto Cadastro e Gerenciamento de Usuários e Carros com Spring Boot e Thymeleaf
Descrição
Este projeto é uma aplicação web simples construída com Spring Boot e Thymeleaf, que permite gerenciar usuários e carros. Inclui funcionalidades como cadastro, edição, listagem, exclusão, autenticação básica e dashboard.

Funcionalidades
Login e autenticação simples (sem criptografia, apenas para fins didáticos)

Cadastro de usuários com validação de campos

Listagem, edição e exclusão de usuários

Cadastro de carros com campos ano, modelo e potência

Listagem, edição e exclusão de carros

Dashboard básico após login

Pesquisa de usuários na listagem (implementada via JavaScript no front-end)

Layout responsivo com CSS separado para diferentes páginas

Tecnologias utilizadas
Java 17+

Spring Boot

Spring Data JPA (com Hibernate)

Thymeleaf

Banco de dados H2 (embutido, para testes) ou outro configurável

HTML5, CSS3, JavaScript

Estrutura do projeto
swift
Copiar
Editar
src/main/java/com/example/thymeleaf/
  ├── controller/
  │     ├── UserController.java
  │     └── CarController.java
  ├── model/
  │     ├── UserModel.java
  │     └── CarModel.java
  ├── repository/
  │     ├── UserRepository.java
  │     └── CarRepository.java
  └── Application.java  (classe principal Spring Boot)

src/main/resources/
  ├── templates/  (arquivos Thymeleaf .html)
  │     ├── login.html
  │     ├── cadastro.html
  │     ├── usuarios.html
  │     ├── editar.html
  │     ├── carros.html
  │     ├── cadastro-carro.html
  │     ├── editar-carro.html
  │     └── dashboard.html
  └── static/
        └── css/
             ├── cadastro.css
             ├── style2.css
             └── style3.css
Como executar
Clone este repositório:

bash
Copiar
Editar
git clone https://github.com/trinikz/

cd seu-projeto
Configure o banco de dados no application.properties se necessário (por padrão usa H2 em memória).

Compile e execute a aplicação com Maven ou Gradle:

bash
Copiar
Editar
./mvnw spring-boot:run
Acesse no navegador:

bash
Copiar
Editar
http://localhost:8080/login
Uso
Para se cadastrar, acesse /cadastro

Para fazer login, acesse /login

Após login bem sucedido, você será direcionado para o dashboard

Você pode navegar para as listas de usuários e carros, e gerenciar os registros (editar/excluir)

A lista de usuários possui um campo de busca para filtrar nomes em tempo real

Melhorias futuras
Implementar autenticação segura (ex: Spring Security + BCrypt)

Paginação para listas grandes

Validação e tratamento de erros no backend

Melhorar layout e usabilidade com frameworks CSS (Bootstrap, Tailwind)

Integração com banco de dados externo (MySQL, PostgreSQL)

Upload de fotos para carros e usuários

Contato
Para dúvidas ou sugestões, entre em contato via e-mail: trinikz@proton.me