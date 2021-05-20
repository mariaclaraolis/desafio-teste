# Como entregar estes desafios
* Efetuar um fork deste repositório em um gerenciador Git de sua preferência, como Github, Bitbucket etc.
* Ao final do teste, enviar o link do repositório para o recrutador.
* Fique a vontade para adicionar qualquer tipo de conteúdo que julgue útil ao projeto.

**Obs.: Não fazer um _Pull Request_ para este projeto!**

##  Sobre o desafio

A seguir temos um desafio para entender um pouco melhor sobre seu conhecimento. Para resolve-lo você deverá utilizar o site https://www.saraiva.com.br. 

1. Desenvolva os casos de testes a partir das Stories apresentadas abaixo, descrevendo ao menos um cenário feliz e um cenário alternativo para cada uma das Stories.
1. Descreva os bugs encontrados no caso de teste da CT002.
1. Escreva o BDD de ao menos um casos de teste
1. Faça a automação do cadastro na loja:
    * Deverá utilizar um framework de testes a sua escolha, desde que não seja um framework de reprodução/gravação.
    * Uso de Page Object
    * Você pode optar por utilizar uma biblioteca geradora de CPF's.
    
### Pré-Requisitos:
* Documentar como rodamos a automação no README.MD, substituindo este documento;

### Diferenciais/Extras

* Uso de Cucumber
* Uso da linguagem Javascript
* Uso de Network Requests
* Uso do Cypress

### Case

**CT001** - Como a "pessoa física" gostaria de realizar o cadastro na loja:

* Para realizar o cadastro na loja serão necessários a informação dos seguintes campos obrigatórios: nome, sobrenome, e-mail, senha, confirmar senha, CPF, sexo, data nascimento, celular e endereço.

* A página deverá utilizar as cores preto e amarelo e todos os campos obrigatórios precisam ser sinalizados com um asterisco vermelho.

* Deve ser possível aceitar ou não o recebimento de ofertas e isso deverá ser feito através de um radio button apresentando as duas opções na tela.

**CT002** - Como a "pessoa física" gostaria de buscar e comprar um livro digital:
   
* Ao lado da opção de livro físico gostaria de ter a nova opção;

* Como os outros produtos da loja um livro digital deverá ter as descrições e características do produto;

* Não é possível adicionar produtos físicos e digitais no mesmo carrinho.
