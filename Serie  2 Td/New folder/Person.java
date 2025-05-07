import java.util.function.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
public class PersonTD2 {
    private String name;
    private int birthYear;

    public PersonTD2(String name, int birthYear) {
        this.name = name;
        this.birthYear= birthYear;
    }
    
    public String getName() {
        return name;
    }

//----------------------------------------------------------------------------
    //Method to calculate age
    public  int getAge(int currentYear) {
        if (birthYear > currentYear) {
            throw new IllegalArgumentException("Birth year cannot be in the future.");
        }
        return currentYear - birthYear;
    }
 //---------------------------------------------------------------------------   
    // Static method to check if name starts with uppercase
    public static boolean isNameCapitalized1(PersonTD2 p) {
        return Character.isUpperCase(p.getName().charAt(0));
    }
    // instance method to check if name starts with uppercase
	public boolean isNameCapitalized2(PersonTD2 p) {
        return Character.isUpperCase(p.getName().charAt(0));
    }
	//  second version of method to check if name starts with uppercase whithout parameter
	    public boolean isCapitalized3() {
        return Character.isUpperCase(this.getName().charAt(0));
    }
	/*public boolean isStarderWithCapital(Predicate<PersonTD2> pp,PersonTD2 p){
	                    return  pp.test(p) ;           }*/
						
						
    // Static method to convert name to uppercase
    public static String nameToUpper(PersonTD2 p) {
        return p.getName().toUpperCase();
    }
	//toString method 
    public String toString(){return"Person[ name: "+name+", birthYear: "+birthYear+"]";}
	
    // --- Main testing ----------------------------------------------------------------
	
    public static void main(String[] args) {
		//create instance from Person old version 
        PersonTD2 person1 = new PersonTD2("Amine", 2002);
		
		//create instance from Person using BiFunction < first arg, second arg , result> Functional Interface 
		BiFunction<String,Integer,PersonTD2> per=(x,y)->new PersonTD2(x,y);// lambda  exp 
		
        //BiFunction<String,Integer,PersonTD2> per= PersonTD2::new; // Method Ref ClassName::new;
		
		PersonTD2 person2=per.apply("Ahmed",2000);
		
		PersonTD2 person3=per.apply("Ali",2012);
		
		PersonTD2 person4=per.apply("Ali",2022);
		
		/*testing if name start with Capital letter using Static method Ref
		here we chose Funct interface which his method  match with isNameCapitalized1,
		because isNameCapitalized1 return boolean result we chose Predicate interface*/
		
		//Predicate<PersonTD2> startsWithCapital =x->PersonTD2.isNameCapitalized1(x);
        Predicate<PersonTD2> startsWithCapital = PersonTD2::isNameCapitalized1;//static unbound method REF: ClassName::MethodeName;
		System.out.println("Is "+person1.getName() +" capitalized 1 ? " + startsWithCapital.test(person1));
		
		//testing with Instance method Ref
		//Predicate<PersonTD2> startsWithCapital2 =x->Character.isUpperCase(x.getName().charAt(0));
		Predicate<PersonTD2> startsWithCapital2 = person1::isNameCapitalized2;//bound method REF: object Refernce::MethodeName;
		System.out.println("Is "+person1.getName() +" capitalized 2 ? " + startsWithCapital2.test(person1));
		
		//testing with Instance method Ref
		//Predicate<PersonTD2> startsWithCapital3 =x->x.isCapitalized3();//unbound method REF
		Predicate<PersonTD2> startsWithCapital3 = PersonTD2::isCapitalized3;
		System.out.println("Is "+person1.getName() +" capitalized 3 ? " + startsWithCapital3.test(person1));
		
		//convert name to UpperCase
        Function<PersonTD2, String> convertNameToUpper = PersonTD2::nameToUpper;//static unbound method REF : ClassName::MethodeName;
		System.out.println("Uppercase name: " + convertNameToUpper.apply(person1));
		
		//return age 
        ToIntFunction<Integer> g1 = person1::getAge;//unbound method Ref: object Refernce::MethodeName;
        // ToIntFunction<Integer> g1 = x->person1.getAge(x);//with lambda expression
		System.out.println("Age de : "+person1.getName()+" est " + g1.applyAsInt(2025)+" ans");
		
		//--------------------------------------------------------------------------------------
		//afficher une instance person with Consumer interface 
		//Consumer<PersonTD2> con=x->System.out.println(x);
		Consumer<PersonTD2> con1=System.out::println;
		con1.accept(person2);
		
        //afficher une instance person with Supplier interface 	
		//Supplier<String> sup=()->person1.getName();
		Supplier<String> sup=person1::getName;
		System.out.println(sup.get());
		
		//afficher le nom dune person 
        //System.out.println("Name: " + person1.getName());
		Consumer<String> con2=System.out::println;
		con2.accept(person1.getName());
		
		// create list of person 
		//Function<Integer,List<PersonTD2>> lp = x->new ArrayList(x);
		Function<Integer,List<PersonTD2>> listP = ArrayList::new;
		
		List <PersonTD2> PArray=listP.apply(2);
		
		PArray.add(person1); PArray.add(person2); PArray.add(person3); PArray.add(person4);
		//System.out.println(PArray);
		Consumer<List<PersonTD2>> con3=System.out::println;
		con3.accept(PArray);
		
		//sorting PArray By name 
		PArray.sort(Comparator.comparing(PersonTD2::getName));
		System.out.println("after sorting by name:");
				//System.out.println(PArray);
		con3.accept(PArray);
		//sorting PArray By name then Age
		PArray.sort(Comparator.comparing(PersonTD2::getName).thenComparing(p -> p.getAge(2025)));
		System.out.println("after sorting by name and age :");
		
		//System.out.println(PArray);
		con3.accept(PArray);
    }
}