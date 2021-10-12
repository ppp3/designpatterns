package aufgabe;

import java.util.List;

public class TwitterService {

    public List<Tweet> getRecentTweet()
    {
        var oauth = new OAuth();
        var requestToken = oauth.requestToken("appKey", "secret");
        var accessToken = oauth.getAccessToken(requestToken);

        var twitterClient = new TwitterClient();
        return twitterClient.getRecentTweets(accessToken);
    }

}
