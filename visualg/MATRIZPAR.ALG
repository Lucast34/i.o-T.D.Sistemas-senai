Algoritmo "MatrizPar"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 23/04/2025
Var
// Se��o de Declara��es das vari�veis 
val: vetor[1..3,1..3] de inteiro
l,c: inteiro

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
para l <- 1 ate 3 faca
  para c <- 1 ate 3 faca
     escreva("Digite o valor da posi��o >>")
     leia(val[l,c])
  fimpara
fimpara

para c <- 1 ate 3 faca
   se(val[l,c] % 2 = 0) entao
    escreval("{",val[l,c]:2,"}")
   senao
     escreva(val[l,c]:4)

Fimalgoritmo