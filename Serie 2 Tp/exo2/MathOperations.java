public class MathOperations{
    public void calculer(int x,int y){
        class Operation{
            public int sum(){return x+y;}
            public int mul(){return x*y;}
            public int min(){return x-y;}
            public double div(){
               if(y==0){
                throw new ArithmeticException("div by 0");
               }
               return (double)x/y;
            }
        }
        Operation op = new Operation();
        System.out.println("la sum:"+op.sum());
        System.out.println("la mul:"+op.mul());
        System.out.println("la min:"+op.min());
        try{
        System.out.println("la div:"+op.div());
        }catch(ArithmeticException e){
            System.out.println(e);
        }

    }
}