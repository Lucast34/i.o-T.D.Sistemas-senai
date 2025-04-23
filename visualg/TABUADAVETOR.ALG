Algoritmo "TabuadaVetor"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 23/04/2025
Var
// Seção de Declarações das variáveis 
numI,numM: inteiro
numT: vetor[1..10] de inteiro
res: vetor[1..10] de inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreva("Digite um numero: ")
leia(numM)

para numI <- 1 ate 10 faca
   numT[numI]<- numI
   res[numI] <-  numM * numT[numI]
   escreval(numM," X ",numT[numI]," =",res[numI])
fimpara

Fimalgoritmo