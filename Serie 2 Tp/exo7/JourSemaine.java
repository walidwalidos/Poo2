public enum JourSemaine {
    LUNDI(9, 18),
    MARDI(9, 18),
    MERCREDI(9, 18),
    JEUDI(9, 18),
    VENDREDI(0, 0),
    SAMEDI(0, 0),
    DIMANCHE(9, 18);

    private final int hv; 
    private final int hf; 

    private JourSemaine(int hv, int hf) { 
        this.hv = hv;
        this.hf = hf;
    }

    public boolean estOuvert(int heure) {
        return (heure >= hv && heure < hf);
    }
}
