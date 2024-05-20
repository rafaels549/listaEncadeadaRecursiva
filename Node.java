public class Node {
     private int x;
    private Node prox;

    public Node(int x){
        this.x = x;
        this.prox = null;
    }

    public void add(int x){
        if(prox==null){
            prox = new Node(x);
        }
        else{
            prox.add(x);
        }
    }

    public void imprime(){
       
        if(prox!=null){
           prox.imprime(); 
          
        }
        System.out.println(this.x);
    } 
      public int impares(){
        if(prox != null){
                  if(this.x%2!=0){
                          return this.x + prox.impares();
                  }else{
                     return prox.impares();
                  }
        }else{
            if (this.x % 2 != 0) {
                return this.x;
            } else {
                return 0;
            }
        }
      }

      public int maiorValor(Node maior){
              if(prox!=null){
              
                     if(prox.x > maior.x ){
                         
                            maior.x = this.x;
                         return prox.maiorValor(maior);
                          
                     }else{
                          return prox.maiorValor(prox);
                     }
              }else{

                  return maior.x;
              }
      }
    public int size(){
        int aux = 0;
        if(prox!=null){
            aux = prox.size();
        }
        return 1 + aux;
    }

   
}
