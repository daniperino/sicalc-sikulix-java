# language: pt
@darf
Funcionalidade:  de DARF no Sicalc

  Cenário: Preencher um DARF com sucesso
    Dado que a tela inicial do Sicalc é exibida
    Quando eu clico no botão de continuar
    E clico no menu de funções
    E seleciono a opção de preenchimento de DARF
    E preencho o nome com "Daniella Perino"
    Então o campo de nome deve conter "Daniella Perino"