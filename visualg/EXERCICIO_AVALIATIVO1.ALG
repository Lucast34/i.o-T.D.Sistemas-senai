Algoritmo "exercicio_avaliativo1"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 15/04/2025
Var
// Seção de Declarações das variáveis 
num_impar,contador,opc: inteiro

delta,a,b,c,x1,x2: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
  escreval("Escolha uma opção: ")
  escreval("1 - impar ou par")
  escreval("2 - Formula de bhaskara")
  escreval("3 - Contador até 50")

  escreva(">>> ")
  leia(opc)
  
  escolha opc
    caso 1
         escreval("Programa de impar ou par(somente numeros inteiros porfavor)")
         escreva("Escreva um numero >> ")
         leia(num_impar)
         se(num_impar = 2 % 0)entao
            escreval("O numero ",num_impar," é impar")
         senao
            escreval("O numero ",num_impar," é impar")
         fimse

    caso 2
         escreval("Programa de calculo de bhaskara")

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

    caso 3
         escreval("Programa de contador até 50")
         para contador <- 0 ate 50 passo 5 faca
         escreval(contador)
         fimpara
         escreva("Contagem encerrada")
         
    outrocaso
    escreval("opção ivalida")
    fimescolha





//escreval("Programa de impar ou par(somente numeros inteiros porfavor)")
//escreva("Escreva um numero >> ")
//leia(num_impar)
//se(num_impar = 2 % 0)entao
//  escreval("O numero ",num_impar," é impar")
//senao
//  escreval("O numero ",num_impar," é impar")
//fimse

// escreval("Programa de contador até 50")
//para contador <- 0 ate 50 passo 5 faca
//  escreval(contador)
//fimpara


//escreval("Programa de calculo de bhaskara")
//escreva("digite o valor de a >> ")
//leia(a)
//escreva("digite o valor de b >> ")
//leia(b)
//escreva("digite o valor de c >> ")
//leia(c)

//delta <- (b^2) - 4*(a*c)

//escreval("Valor de delta é >> ", delta)
// x1 <- (-b + raizq(delta)/2*a)
// x2 <- (-b - raizq(delta)/2*a)
//escreval("O valor de X1 é >> ",x1)
//escreval("O valor de X1 é >> ",x2)


Fimalgoritmo