Algoritmo "NotaVetor"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 23/04/2025
Var
// Se��o de Declara��es das vari�veis 
nome: vetor [1..4]de caractere
n1: vetor [1..4]de real
n2: vetor [1..4]de real
m: vetor [1..4]de real
c: inteiro

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
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