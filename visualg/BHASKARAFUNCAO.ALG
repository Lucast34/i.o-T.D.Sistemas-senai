Algoritmo "BhaskaraFuncao"

funcao Bhas(a,b,c:real):logico
Var
delta,x1,x2:real

inicio
delta <- b^2 -4*a*c

se delta<0 entao
  escreval ("Não possui raiz real")
  retorne falso
senao
  x1 <- (-b + raizq(delta))/(2*a)
  x2 <- (-b - raizq(delta))/(2*a)
  
  escreval("Delta:",delta)
  escreval("X1:",x1)
  escreval("X2:",x2)
  retorne verdadeiro
fimse

fimfuncao

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

se Bhas(4,-5,-12)entao
   escreval("Realizado com sucesso")
fimse

Fimalgoritmo