Algoritmo "NotaVetor"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 23/04/2025
Var
// Seção de Declarações das variáveis 
nome: vetor [1..4]de caractere
n1: vetor [1..4]de real
n2: vetor [1..4]de real
m: vetor [1..4]de real
c: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
para c <- 1 ate 4 faca
  escreval("Aluno: ",c)
  escreva("Nome: ")
  leia(nome[c])
  escreva("Primeira nota: ")
  leia(n1[c])
  escreva("Primeira nota: ")
  leia(n2[c])
  m[c] <- (n1[c]+n2[c])/2
fimpara
limpatela
escreval("LISTAGEM DE ALUNOS")
escreval("---------------------")
para c <- 1 ate 4 faca
  escreval(nome[c],m[c]) escreval(nome[c]:15,m[c])
fimpara

Fimalgoritmo