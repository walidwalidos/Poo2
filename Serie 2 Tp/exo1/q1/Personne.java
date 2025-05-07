public class Personne implements Cloneable {
  private String nom;
  private int age;
  private Adresse adresse;
 public Personne(String nom, int age, Adresse adresse){
  this.nom = nom;
  this.age = age;
  this.adresse = adresse;
  }
  public void afficher(){
    System.out.println(nom +" "+ age+ " "+ adresse.getRue()+ " "+adresse.getVille());
  }
  public String getNome(){return nom;};
  public int getAge(){return age;};
  public Adresse getAdress(){
    return adresse.getAdress();
  }
  public void setNome(String nom){this.nom=nom;};
  public void setage(int age){this.age=age;};
  public void setAdress(String rue, String ville){
    adresse.setAdress(rue,ville);
  }

  protected Object clone()throws CloneNotSupportedException{
    return super.clone();
  }
  public String toString(){
    return ("nom:"+nom+" , age: "+age+" , adress: "+adresse.getRue()+" , "+adresse.getVille());
  }




}