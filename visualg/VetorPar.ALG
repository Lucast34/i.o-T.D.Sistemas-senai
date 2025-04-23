Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 23/04/2025
Var
// Seção de Declarações das variáveis 
val: vetor[1..7] de inteiro
i, TotPar: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
TotPar <- 0
para i <- 1 ate 7 faca
  escreval("Digite o ",i,"°. valor: ")
  leia(val[i])
  se(val[i] % 2 = 0)entao
     TotPar <- TotPar +1
  fimse
fimpara
escreval("O total de pares foram ",TotPar)

Fimalgoritmo