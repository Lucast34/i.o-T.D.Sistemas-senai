Algoritmo "TesteVetor"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 23/04/2025
Var
// Se��o de Declara��es das vari�veis 
v: vetor[1..6] de inteiro
c: inteiro

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
para c <- 1 ate 6 faca
  escreval("Digite o ", c, "o. valor:")
  leia(v[c])
fimpara

//escreval(v[1],v[2],v[3],v[4],v[5],v[6])

para c <- 1 ate 6 faca
  escreval("{",v[c],"}")
fimpara


Fimalgoritmo