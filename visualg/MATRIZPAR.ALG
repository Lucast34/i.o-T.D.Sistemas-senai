Algoritmo "MatrizPar"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 23/04/2025
Var
// Seção de Declarações das variáveis 
val: vetor[1..3,1..3] de inteiro
l,c: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
para l <- 1 ate 3 faca
  para c <- 1 ate 3 faca
     escreva("Digite o valor da posição >>")
     leia(val[l,c])
  fimpara
fimpara

para c <- 1 ate 3 faca
   se(val[l,c] % 2 = 0) entao
    escreval("{",val[l,c]:2,"}")
   senao
     escreva(val[l,c]:4)

Fimalgoritmo