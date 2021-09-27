import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

import java.io.IOException;
import java.util.List;

public class Main {

    public static Twitter mainConfig() {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("key")
                .setOAuthConsumerSecret("key")
                .setOAuthAccessToken("key")
                .setOAuthAccessTokenSecret("key");
        TwitterFactory tf = new TwitterFactory(cb.build());
        return tf.getInstance();
    }

    public static Twitter specificConfig(Region region) {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("key")
                .setOAuthConsumerSecret("key")
                .setOAuthAccessToken(Region.accessToken(region))
                .setOAuthAccessTokenSecret(Region.accessTokenSecret(region));
        TwitterFactory tf = new TwitterFactory(cb.build());
        return tf.getInstance();
    }

    public static void main(String[] args) throws TwitterException, IOException {

        Value value = Value.valueOf(args[0]);
        Region region = args.length == 1 ? Region.Countries : Region.valueOf(args[1]);

        Twitter mainTwitter = mainConfig();
        Twitter specificTwitter = specificConfig(region);
        List<String> tweets = Data.CSVToTweets(value, region);
        long inReplyToStatusId = -1;
        int counter = 0;
        int threadLimit = tweets.size();

        while (counter < threadLimit){
            /**StatusUpdate statusUpdate = new StatusUpdate(tweets.get(counter));
            statusUpdate.setInReplyToStatusId(inReplyToStatusId);

            Status updatedStatus = mainTwitter.updateStatus(statusUpdate);
            inReplyToStatusId = updatedStatus.getId();**/
            System.out.println(tweets.get(counter));
            counter++;
        }

        counter = 0;

        /**while (counter < threadLimit){
            StatusUpdate statusUpdate = new StatusUpdate(tweets.get(counter));
            statusUpdate.setInReplyToStatusId(inReplyToStatusId);

            Status updatedStatus = specificTwitter.updateStatus(statusUpdate);
            inReplyToStatusId = updatedStatus.getId();
            counter++;
        }**/


    }

}
