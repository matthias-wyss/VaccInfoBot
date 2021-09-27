import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.*;

public class Data {

    public static List<String> CSVToTweets(Value value, Region region) throws IOException {

        String web = "https://raw.githubusercontent.com/owid/covid-19-data/master/public/data/vaccinations/vaccinations.csv";
        URL content = new URL(web);
        InputStream stream = content.openStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(stream));

        String line;
        String oldISO = "iso";
        String currentISO;
        String[] lineData = new String[2];
        List<String[]> countryData = new ArrayList<>();
        List<String> tempElements = new ArrayList<>();
        List<List<String[]>> worldData = new ArrayList<>();

        while ((line = br.readLine()) != null) {
            Scanner scan = new Scanner(line);
            scan.useDelimiter(",");
            while (scan.hasNext()) {
                tempElements.add(scan.next());
            }
            currentISO = tempElements.get(Value.valueToInt(Value.ISO));
            if(oldISO.equals(currentISO)) {
                for (ISO iso : ISO.values()) {
                    if (currentISO.equals(iso.name())) {
                        lineData[0] = iso.name();
                        if(tempElements.size() > Value.valueToInt(value) && isNumeric(tempElements.get(Value.valueToInt(value)))) {
                            lineData[1] = tempElements.get(Value.valueToInt(value));
                            if(value.equals(Value.DailyVaccination)) {
                                lineData[1] = String.valueOf((double)Math.round(Double.parseDouble(lineData[1]) / 100) / 100);
                            }
                        }
                    }
                }
                if(tempElements.size() > Value.valueToInt(value) && isNumeric(tempElements.get(Value.valueToInt(value)))) {
                    countryData.add(lineData.clone());
                }
                tempElements.clear();
            } else {
                worldData.add(new ArrayList<>(countryData));
                countryData.clear();
            }
            oldISO = currentISO;
        }
        worldData.add(new ArrayList<>(countryData));
        countryData.clear();

        int i = 0;
        String tempIntro = Region.introFromRegion(region);
        String[] usefulData = new String[2];
        List<String[]> countries = new ArrayList<>();

        for (List<String[]> country : worldData) {
            if(!country.isEmpty() && country.get(i)[1] != null) {
                if(region.equals(Region.All) ||
                        (region.equals(Region.Europe) && ISO.europe(country)) ||
                        (region.equals(Region.UE) && ISO.ue(country)) ||
                        (region.equals(Region.America) && ISO.amerique(country)) ||
                        (region.equals(Region.NorthAmerica) && ISO.ameriqueDuNord(country)) ||
                        (region.equals(Region.CentralAmerica) && ISO.ameriqueCentrale(country)) ||
                        (region.equals(Region.SouthAmerica) && ISO.ameriqueduSud(country)) ||
                        (region.equals(Region.Asia) && ISO.asie(country)) ||
                        (region.equals(Region.Africa) && ISO.afrique(country)) ||
                        (region.equals(Region.Oceania) && ISO.oceanie(country)) ||
                        (region.equals(Region.World) && ISO.monde(country)) ||
                        (region.equals(Region.Continents) && ISO.continents(country)) ||
                        (region.equals(Region.Group) && ISO.groupe(country)) ||
                        (region.equals(Region.Countries) && ISO.mondePays(country))) {
                    Collections.reverse(country);
                    while(country.get(i)[1].isEmpty()) {
                        if(country.size() > i+1) {
                            ++i;
                        } else {
                            break;
                        }
                    }
                    usefulData[0] = country.get(i)[0];
                    if(!country.get(i)[1].isEmpty()) {
                        if(Double.parseDouble(country.get(i)[1]) <= 100.0) {
                            usefulData[1] = country.get(i)[1];
                        } else {
                            usefulData[1] = String.valueOf(100.0);
                        }
                    }
                    countries.add(usefulData.clone());
                    i = 0;
                }
            }
        }

        countries.sort((o1, o2) -> {
            if (Double.parseDouble(o1[1]) > Double.parseDouble(o2[1])) {
                return -1;
            } else if (Double.parseDouble(o1[1]) < Double.parseDouble(o2[1])) {
                return 1;
            }
            return 0;
        });

        List<String> stringLines = new ArrayList<>();
        stringLines.add(Value.introFromValueIndex(value) + " " + tempIntro);

        for(String[] data : countries) {
            String iso = data[0];
            String dataValue = data[1];
            String tweetLine = ISO.flag(ISO.valueOf(iso)) + " " + ISO.textToCountry(iso) + " " + dataValue + "%";
            stringLines.add(tweetLine);
        }

        List<String> tempTweets = new ArrayList<>();
        int nbChar = 0;
        int tweetIndex = 1;
        StringBuilder tweet = new StringBuilder();
        for(String tweetLine : stringLines) {
            if(nbChar <= 235) {
                tweet.append(tweetLine).append("\n");
                nbChar += tweetLine.length();
            }
            else {
                tweet.append("\n[").append(tweetIndex).append("/");
                tempTweets.add(tweet.toString());
                tweet.setLength(0);
                tweet.append(tweetLine).append("\n");
                nbChar = tweetLine.length();
                ++tweetIndex;
            }
            if(tweetLine.equals(stringLines.get(stringLines.size()-1))) {
                tweet.append("\n[").append(tweetIndex).append("/");
                tempTweets.add(tweet.toString());
                ++tweetIndex;
            }
        }

        List<String> tweets = new ArrayList<>();
        for(String t : tempTweets) {
            tweets.add(t + tempTweets.size() + ("]"));
        }

        return tweets;
    }

    private static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
