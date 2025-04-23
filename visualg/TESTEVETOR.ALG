Algoritmo "TesteVetor"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 23/04/2025
Var
// Seção de Declarações das variáveis 
v: vetor[1..6] de inteiro
c: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
para c <- 1 ate 6 faca
  escreval("Digite o ", c, "o. valor:")
  leia(v[c])
fimpara

//escreval(v[1],v[2],v[3],v[4],v[5],v[6])

para c <- 1 ate 6 faca
  escreval("{",v[c],"}")
fimpara


Fimalgoritmo