Algoritmo "peso_procedimento"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 16/04/2025
Var
// Seção de Declarações das variáveis 
i : inteiro
n,pesado: caractere
p,mai: real

procedimento topo()
inicio
limpatela
escreval("-------------------------------")
escreval(" D E T E C T O R DE P E S A D O")
escreval(" Maior peso ate agora: ", mai,"Kg")
escreval("-------------------------------")
fimprocedimento
Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
topo()
para i <- 1 ate 5 faca
  escreva("Digite o nome: ")
  leia(n)
  escreva("Digite o peso de ",n,": ")
  leia(p)
  se(p> mai)entao
     mai<- p
     pesado <- n
  fimse
  limpatela
  escreval("-------------------------------")
  escreval(" D E T E C T O R DE P E S A D O")
  escreval(" Maior peso ate agora: ", mai,"Kg")
  escreval("-------------------------------")
fimpara
limpatela
escreval("-------------------------------")
escreval(" D E T E C T O R DE P E S A D O")
escreval(" Maior peso ate agora: ", mai,"Kg")
escreval("-------------------------------")
escreval("A pessoa mais pesada foi ", pesado," com ",mai," quilos")
Fimalgoritmo