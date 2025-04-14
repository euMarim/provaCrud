$$ Projeto CRUD Pessoa e Trabalho $$

Sistema CRUDs (Pessoa e Trabalho) desenvolvido com (Spring Boot). As entidades estão relacionadas via JPA e os endpoints seguem os padrões REST.

$$ Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven
- Postman (para testes)

====================================================================

$$ Endpoints para Testes no Postman ##

$$ Pessoa

$$ Criar Pessoa
- POST http://localhost:8080/pessoas
{
  "nome": "Lucas Marim",
  "idade": 23
}

$$ Listar Pessoas
- GET http://localhost:8080/pessoas

$$ Atualizar Pessoa
- PUT http://localhost:8080/pessoas/1
{
  "nome": "Lucas Marim Freitas",
  "idade": 24
}

$$ Deletar Pessoa
- DELETE http://localhost:8080/pessoas/1

====================================================================

$$ Trabalho

$$ Criar Trabalho
- POST http://localhost:8080/trabalhos 
{
  "cargo": "Desenvolvedor",
  "empresa": "Microsoft",
  "pessoaId": 1
}

$$ Listar Trabalhos 
- GET http://localhost:8080/trabalhos

$$ Atualizar Trabalho
- PUT http://localhost:8080/trabalhos/1
{
  "cargo": "Designer WEB",
  "empresa": "Google",
  "pessoa": {
    "id": 1
  }
}

$$ Deletar Trabalho
- DELETE http://localhost:8080/trabalhos/1

====================================================================


