 class MyClass {
  // لاحظ اني اضفت constructure  يعكس الكلمة التي ياخذها
   String str;
  public MyClass(String str){
     this.str = StReverse(str);
  }
  public String StReverse ( String str ){ 
  String result = "";

   for(int i = str.length()-1; i>=0 ; i--){
    result += str.charAt(i);
    }

   return result ;

 }
}