Algoritmo "exercicio_avaliativo1"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 15/04/2025
Var
// Se��o de Declara��es das vari�veis 
num_impar,contador,opc: inteiro

delta,a,b,c,x1,x2: real

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
  escreval("Escolha uma op��o: ")
  escreval("1 - impar ou par")
  escreval("2 - Formula de bhaskara")
  escreval("3 - Contador at� 50")

  escreva(">>> ")
  leia(opc)
  
  escolha opc
    caso 1
         escreval("Programa de impar ou par(somente numeros inteiros porfavor)")
         escreva("Escreva um numero >> ")
         leia(num_impar)
         se(num_impar = 2 % 0)entao
            escreval("O numero ",num_impar," � impar")
         senao
            escreval("O numero ",num_impar," � impar")
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

         escreval("Valor de delta � >> ", delta)

            x1 <- (-b + raizq(delta)/2*a)

            x2 <- (-b - raizq(delta)/2*a)

         escreval("O valor de X1 � >> ",x1)
         
         escreval("O valor de X1 � >> ",x2)

    caso 3
         escreval("Programa de contador at� 50")
         para contador <- 0 ate 50 passo 5 faca
         escreval(contador)
         fimpara
         escreva("Contagem encerrada")
         
    outrocaso
    escreval("op��o ivalida")
    fimescolha





//escreval("Programa de impar ou par(somente numeros inteiros porfavor)")
//escreva("Escreva um numero >> ")
//leia(num_impar)
//se(num_impar = 2 % 0)entao
//  escreval("O numero ",num_impar," � impar")
//senao
//  escreval("O numero ",num_impar," � impar")
//fimse

// escreval("Programa de contador at� 50")
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

//escreval("Valor de delta � >> ", delta)
// x1 <- (-b + raizq(delta)/2*a)
// x2 <- (-b - raizq(delta)/2*a)
//escreval("O valor de X1 � >> ",x1)
//escreval("O valor de X1 � >> ",x2)


Fimalgoritmo