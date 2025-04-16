Algoritmo "bhaskara_procedimento"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 16/04/2025
Var
// Seção de Declarações das variáveis 


procedimento Bhaskara(a,b,c: real)
var
x,y,z,delta,x1,x2: real
inicio
escreval("Programa de calculo de bhaskara")
escreva("digite o valor de a >> ")
leia(a)
escreva("digite o valor de b >> ")
leia(b)
escreva("digite o valor de c >> ")
leia(c)

delta <- b^2 - 4*a*c

se (delta < 0)
   escreval("Valor de delta ¦ >> ", delta)
   escreva("Não existe raiz")
senao

   escreval("Valor de delta ¦ >> ", delta)
   x1 <- (-b + raizq(delta)/2*a)
   x2 <- (-b - raizq(delta)/2*a)
   escreval("O valor de X1 ¦ >> ",x1)
   escreval("O valor de X1 ¦ >> ",x2)

fimse
fimprocedimento


Inicio

Bhaskara(x,y,z)


Fimalgoritmo