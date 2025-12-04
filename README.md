# 🎬 JSeries - Consumo de API com Spring Boot e Thymeleaf

## 📝 Descrição do Projeto

Este repositório contém um projeto de estudo e demonstração focado na construção de uma aplicação web utilizando **Spring Boot** para o *backend* e **Thymeleaf** para o *frontend* (servidor-side rendering). O objetivo principal é simular um sistema de consulta de séries, onde a aplicação consome uma API externa (como a OMDb API, inferido pelo contexto de dados de séries e episódios) para buscar e exibir detalhes de títulos, temporadas e episódios.

O projeto demonstra a integração de tecnologias modernas do ecossistema Java para criar uma aplicação funcional, com foco em:

*   **Consumo de APIs REST:** Utilização de clientes HTTP (como `RestTemplate` ou `WebClient`) no Spring Boot.
*   **Renderização Server-Side:** Uso do Thymeleaf para criar páginas HTML dinâmicas.
*   **Design Profissional:** Aplicação de conceitos de UX/UI com um tema **Neon Minimalista** para as páginas de pesquisa e detalhes.

## 🛠️ Tecnologias Utilizadas

O projeto foi desenvolvido com as seguintes tecnologias e ferramentas:

| Categoria | Tecnologia | Versão/Detalhe |
| :--- | :--- | :--- |
| **Linguagem** | Java | 17+ (Recomendado) |
| **Framework** | Spring Boot | Versão 3.x (Inferido) |
| **Build Tool** | Maven | Gerenciamento de dependências |
| **View Layer** | Thymeleaf | Template Engine para HTML |
| **Estilização** | CSS Puro | Tema Neon Minimalista |

## ✨ Funcionalidades

A aplicação oferece as seguintes funcionalidades principais:

1.  **Pesquisa de Séries:** Uma interface simples para o usuário inserir o título da série desejada.
2.  **Exibição de Detalhes:** Após a busca, a aplicação exibe informações detalhadas da série, incluindo:
    *   Título e Avaliação IMDb.
    *   Total de Temporadas.
    *   Lista de episódios por temporada, com título e avaliação individual.
3.  **Design Moderno:** Interface de usuário com tema **Neon Minimalista** para uma experiência visual chamativa e profissional.

## 🚀 Como Executar o Projeto

Para rodar este projeto em sua máquina local, siga os passos abaixo:

### Pré-requisitos

Certifique-se de ter o seguinte instalado:

*   **JDK (Java Development Kit):** Versão 17 ou superior.
*   **Maven:** Para gerenciar as dependências.
*   **IDE:** Uma IDE compatível com Spring Boot (ex: IntelliJ IDEA, VS Code com extensões Java, Eclipse).

### 1. Clonar o Repositório

```bash
git clone https://github.com/LeoSousaJesus/curso-Spring-Java.git
cd curso-Spring-Java
```

### 2. Configurar a API Externa

O projeto depende de uma API externa para buscar os dados das séries. Você precisará:

1.  Obter uma chave de API (ex: OMDb API).
2.  Configurar a chave e a URL da API no arquivo de propriedades do Spring Boot (`src/main/resources/application.properties` ou `application.yml`).

Exemplo (se estiver usando OMDb):

```properties
# application.properties
api.omdb.url=http://www.omdbapi.com/
api.omdb.key=SUA_CHAVE_AQUI
```

### 3. Compilar e Executar

#### Via Linha de Comando (Recomendado)

Use o Maven Wrapper para compilar e iniciar a aplicação:

```bash
./mvnw spring-boot:run
```

A aplicação estará acessível em `http://localhost:8080`.


## 📄 Estrutura do Projeto

A estrutura segue o padrão de um projeto Spring Boot com Maven:

```
curso-Spring-Java/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── leosousajesus/
│   │   │           └── cursospringjava/  # Pacotes da aplicação (Controllers, Services, Models)
│   │   └── resources/
│   │       ├── static/                 # Arquivos estáticos (CSS, JS, Imagens)
│   │       ├── templates/              # Arquivos Thymeleaf (pesquisa.html, detalhesSerie.html)
│   │       └── application.properties  # Configurações do Spring Boot
├── .mvn/
├── pom.xml                             # Arquivo de configuração do Maven
└── README.md
```


## ⚖️ Licença

Este projeto está sob a licença [MIT](https://choosealicense.com/licenses/mit/).