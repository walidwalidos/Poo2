public enum MATHENUM{
   ADD((a,b)->a+b),
   MUL((a,b)->a*b),
   SOUS((a,b)->a-b),
   DIV((a,b)->{
    if(b==0){
        throw new ArithmeticException("by 0");
    }
    return a/b;
   });


   private final MathOperation mo;
   private MATHENUM(MathOperation mo){
     this.mo=mo;
   }

   public static int operate(MathOperation op, int a, int b){
        return op.operate(a,b);
    }

    public MathOperation getMO(){
        return mo;
    }
 
}