 class MyClass {


  // لاحظ هنا ان الميثود ليست static
  public String StReverse ( String str ){ 
  String result = "";

   for(int i = str.length()-1; i>=0 ; i--){
    result += str.charAt(i);
    }

   return result ;

 }
}