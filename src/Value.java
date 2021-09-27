public enum Value {

    ISO,
    FullyVaccinated,
    Vaccinated,
    Booster,
    DailyVaccination;

    public static int valueToInt(Value value) {
        switch (value) {
            case ISO: return 1;
            case Vaccinated: return 10;
            case FullyVaccinated: return 11;
            case Booster: return 12;
            case DailyVaccination: return 13;
            default: return 1;
        }
    }

    public static String introFromValueIndex(Value value) {
        switch (value) {
            case Vaccinated: return "Personnes partiellement ou entièrement vaccinées";
            case FullyVaccinated: return "Personnes entièrement vaccinées";
            case Booster: return "Personnes ayant reçu une dose de rappel";
            case DailyVaccination: return "Personnes s'étant fait vacciner aujourd'hui";
            default: return "";
        }
    }

}
