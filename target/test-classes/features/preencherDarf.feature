# language: pt
@darf
Funcionalidade:  Preenchimento de DARF

  Cenário: Abrir modal de DARF com sucesso
    Dado que a tela inicial do Sicalc é exibida
    Quando eu clico no botão de continuar
    E clico no menu de funções
    E seleciono a opção de preenchimento de DARF
    Então deve abrir o modal para "Preenchimento de DARF"


  Cenário: Preencher o código da receita de Darf com sucesso
    Dado que o modal de preenchimento de DARF está aberto
    Quando eu preencho o campo Cod Receita com "5629"
    E clico no próximo campo
    Então o modal de calculo para pagamento é aberto
