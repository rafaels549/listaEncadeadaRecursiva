public class Lista {
    private Node inicio;

    public Lista(){
        inicio = null;
    }

    public void add(int x){
        if(inicio==null){
            inicio = new Node(x);
        }
        else{
            inicio.add(x);
        }
    }

    public void imprime(){
        if(inicio!=null){
            this.inicio.imprime();
           
        }


   
    }

    public int impares(){
             if(inicio==null){
                   return 0;
             }else{
                 return inicio.impares();
             }
    }

    public int maiorValor(){
         if(inicio!=null){
              
            return   this.inicio.maiorValor();
         }else{
             return this.inicio.maiorValor();
         }
    }
    
    public int size(){
        if(inicio==null){
            return 0;
        }
        else{
            return inicio.size();
        }
    }

}
