
# 🚀 Projeto Spring Boot com Thymeleaf

Um sistema completo de gerenciamento de **Usuários 👤** e **Carros 🚗**, com autenticação, cadastro, edição e exclusão, utilizando **Spring Boot**, **Thymeleaf**, **JPA** e **H2**.

---

## 🧱 Tecnologias Utilizadas

- ☕ Spring Boot 3+
- 🌿 Spring Data JPA
- 🎨 Thymeleaf
- 🗄️ H2 Database
- 🧪 Jakarta Bean Validation
- 💡 Lombok

---

## 📂 Estrutura do Projeto

```
src
├── main
│   ├── java
│   │   └── com.example.thymeleaf
│   │       ├── UserModel.java 👤
│   │       ├── CarModel.java 🚗
│   │       ├── UserController.java 🧭
│   │       ├── CarController.java 🧭
│   │       ├── UserRepository.java 💾
│   │       └── CarRepository.java 💾
│   └── resources
│       ├── templates
│       │   ├── login.html 🔐
│       │   ├── cadastro.html 📝
│       │   ├── dashboard.html 📊
│       │   ├── usuarios.html 👥
│       │   ├── editar.html ✏️
│       │   ├── carros.html 🚗
│       │   ├── cadastro-carro.html 🧾
│       │   └── editar-carro.html 🛠️
│       └── static
│           └── css
│               └── style3.css 🎨
```

---

## 🧪 Funcionalidades

### 👥 Usuários
- Cadastro de novo usuário
- Login com validação
- Edição e exclusão
- Visualização de todos os usuários

### 🚗 Carros
- Cadastro de carro (ano, modelo, potência)
- Edição e exclusão
- Listagem de todos os carros

---

## 🔑 Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/TRINIKZ/insane
   ```

2. Acesse o diretório:
   ```bash
   cd insane
   ```

3. Execute a aplicação (com Maven):
   ```bash
   ./mvnw spring-boot:run
   ```

4. Acesse:
   ```
   http://localhost:8080
   ```

---

## 💾 Banco de Dados H2

- Console: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
- JDBC URL: `jdbc:h2:mem:alunos`
- User: `admin`
- Password: *admin*

---

## 📊 Tabelas do Banco

### users 👤
| id | name | email | password |
|----|------|-------|----------|

### car_model 🚗
| id | ano | modelo | potencia |
|----|-----|--------|----------|

---

## 🧙‍♂️ Autor

Desenvolvido por **Victor Feitosa, Johnny Zhen Wei Qi** ✨  
Se curtir o projeto, deixe uma ⭐ no GitHub!

---

## 📜 Licença

Este projeto está licenciado sob a [MIT License](LICENSE).
