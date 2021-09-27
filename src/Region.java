public enum Region {

    All,
    Europe,
    UE,
    America,
    NorthAmerica,
    SouthAmerica,
    CentralAmerica,
    Asia,
    Africa,
    Oceania,
    World,
    Continents,
    Group,
    Countries;

    public static String introFromRegion(Region region) {
        switch (region) {
            case Europe: return "en Europe :\n";
            case UE: return "dans l'Union Européenne :\n";
            case America: return "en Amérique :\n";
            case NorthAmerica: return "en Amérique du Nord :\n";
            case SouthAmerica: return "en Amérique du Sud :\n";
            case CentralAmerica: return "en Amérique Centrale :\n";
            case Asia: return "en Asie :\n";
            case Africa: return "en Afrique :\n";
            case Oceania: return "en Océanie :\n";
            case World: return "dans le Monde :\n";
            case Continents: return "par continent :\n";
            case Group: return "dans le Monde :\n";
            case Countries: return "dans le Monde :\n";
            default: return "";
        }
    }

    public static String accessToken(Region region) {
        switch (region) {
            case Europe: return "keyEur";
            case UE: return "keyUE";
            case America: return "keyAm";
            case NorthAmerica: return "keyNA";
            case SouthAmerica: return "keySA";
            case CentralAmerica: return "keyCA";
            case Asia: return "keyAs";
            case Africa: return "keyAfr";
            case Oceania: return "keyOc";
            case World: return "keyMon";
            case Continents: return "keyCtn";
            case Countries: return "keyRpl";
            default: return "";
        }
    }

    public static String accessTokenSecret(Region region) {
        switch (region) {
            case Europe: return "key";
            case UE: return "keyUE";
            case America: return "keyAm";
            case NorthAmerica: return "keyNA";
            case SouthAmerica: return "keySA";
            case CentralAmerica: return "keyCA";
            case Asia: return "keyAs";
            case Africa: return "keyAfr";
            case Oceania: return "keyOc";
            case World: return "keyMon";
            case Continents: return "keyCtn";
            case Countries: return "keyRpl";
            default: return "";
        }
    }

}
