public class Adresse implements Cloneable{

  private String rue;
  private String ville;

  public Adresse(String rue, String ville) {
   this.rue = rue;
   this.ville = ville;
  }
   public String getRue(){return rue;};
   public String getVille(){return ville;};
   public void setrue(){this.rue=rue;};
   public void setville(){this.ville=ville;};
   public Adresse getAdress(){
     return new Adresse(rue,ville);
   }
   public void setAdress(String rue,String ville ){
     this.rue=rue;
     this.ville=ville;
   }

   protected Object clone()throws CloneNotSupportedException{
    return super.clone();
  }

}