programa{

      funcao inteiro ePrimo name() {
        
      }(inteiro n){
        inteiro i, divisores = 0
    
        para(i = 1; i <= n; i++){
          se(n % i == 0)
            divisores++
        }
        se(divisores == 2);
          retorne 1;
        senao
          retorne 0;
      }
      
      funcao inicio(){
        inteiro i
    
        para(i = 1; i <= 125; i++){
          se(ePrimo(i) == 1){
            escreva(i," ")
          }
        }
      }
    }