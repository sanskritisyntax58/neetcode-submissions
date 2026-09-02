class Twitter {

    class Tweet {
        int tweetId;
        int time;

        Tweet(int tweetId, int time) {
            this.tweetId = tweetId;
            this.time = time;
        }
    }

    Map<Integer, List<Tweet>> tweets;
    Map<Integer, Set<Integer>> following;
    int time;

    public Twitter() {
        tweets = new HashMap<>();
        following = new HashMap<>();
        time = 0;
    }

    public void postTweet(int userId, int tweetId) {

        tweets.putIfAbsent(userId, new ArrayList<>());

        tweets.get(userId).add(
            new Tweet(tweetId, time++)
        );
    }

    public List<Integer> getNewsFeed(int userId) {

        List<Integer> result = new ArrayList<>();

        PriorityQueue<Tweet> pq = new PriorityQueue<>(
            (a, b) -> b.time - a.time
        );

        // User's own tweets
        if (tweets.containsKey(userId)) {
            List<Tweet> list = tweets.get(userId);

            for (int i = list.size() - 1; i >= Math.max(0, list.size() - 10); i--) {
                pq.offer(list.get(i));
            }
        }

        // Followed users' tweets
        if (following.containsKey(userId)) {

            for (int followee : following.get(userId)) {

                if (!tweets.containsKey(followee)) {
                    continue;
                }

                List<Tweet> list = tweets.get(followee);

                for (int i = list.size() - 1;
                     i >= Math.max(0, list.size() - 10);
                     i--) {

                    pq.offer(list.get(i));
                }
            }
        }

        // Get newest 10 tweets
        while (!pq.isEmpty() && result.size() < 10) {

            Tweet tweet = pq.poll();

            result.add(tweet.tweetId);
        }

        return result;
    }

    public void follow(int followerId, int followeeId) {

        following.putIfAbsent(
            followerId,
            new HashSet<>()
        );

        following.get(followerId).add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {

        if (following.containsKey(followerId)) {
            following.get(followerId).remove(followeeId);
        }
    }
}
