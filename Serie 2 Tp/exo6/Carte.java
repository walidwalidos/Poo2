public enum Carte {
    AS,
    DEUX,
    TROIS,
    QUATRE,
    CINQ,
    SIX,
    SEPT,
    HUIT,
    NEUF,
    DIX,
    VALET,
    DAME,
    ROI;

    public int valeurPoints() {
        int a;
        switch (this) {
            case DEUX:
                a = 2;
                break;
            case TROIS:
                a = 3;
                break;
            case QUATRE:
                a = 4;
                break;
            case CINQ:
                a = 5;
                break;
            case SIX:
                a = 6;
                break;
            case SEPT:
                a = 7;
                break;
            case HUIT:
                a = 8;
                break;
            case NEUF:
                a = 9;
                break;
            case DIX:
            case VALET:
            case DAME:
            case ROI:
                a = 10;
                break;
            case AS:
                a = 11;
                break;
            default:
                a = 0;
        }
        return a;
    }

    public static Carte meilleureCarte(Carte c1, Carte c2) {
        return (c1.valeurPoints() >= c2.valeurPoints()) ? c1 : c2;
    }
}
