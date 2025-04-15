Var

num_impar,contador: inteiro

delta,a,b,c,x1,x2: real


// Seção de Comandos, procedimento, funções, operadores, etc... 

//escreva("Escreva um numero >> ")
//leia(num_impar)
//se(num_impar = 2 % 0)entao
//  escreval("O numero ",num_impar," é impar")
//senao
//  escreval("O numero ",num_impar," é impar")
//fimse


//para contador <- 0 ate 50 passo 5 faca
//  escreval(contador)
//fimpara

escreva("digite o valor de a >> ")
leia(a)
escreva("digite o valor de b >> ")
leia(b)
escreva("digite o valor de c >> ")
leia(c)

delta <- (b^2) - 4*(a*c)

escreval("Valor de delta é >> ", delta)
 x1 <- (-b + raizq(delta)/2*a)
 x2 <- (-b - raizq(delta)/2*a)
escreval("O valor de X1 é >> ",x1)
escreval("O valor de X1 é >> ",x2)

