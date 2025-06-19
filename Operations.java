package twitter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Operations {
	
	public static void currentMonthTweet(List<Tweet> lst, String month, int year) {
		Stream<Tweet> list = lst.stream();
		list.filter((tweet)->(tweet.getDatePost().getMonth().equals(month)&& tweet.getDatePost().getYear() == year)).forEach((tweet)->System.out.println(tweet));;
	}
	
	public static void subjectCount(List<Tweet> lst) {
		Stream<Tweet> tweet = lst.stream();
		tweet.collect(Collectors.groupingBy(Tweet::getSubject)).forEach((k,v)->System.out.println(k+"  \ncount = " +v.size()+"\n\n"));
	}
	
	public static void tweetWithTag(List<Tweet> lst, String keyTag) {
		Stream<Tweet> list = lst.stream();
		list.filter((tweet)->tweet.getTags().contains(keyTag)).forEach(System.out::println);;
	}
	public static void views10k(List<Tweet> lst) {
		Stream<Tweet> list = lst.stream();
		list.filter((tweet)->tweet.getViews()>=10000).forEach(System.out::println);
	}
	
	public static void trendingTweets(List<Tweet> lst) {
		Stream<Tweet> list = lst.stream();
		Comparator<Tweet> byViews = Comparator.comparing(Tweet::getViews).reversed();
		list.sorted(byViews).limit(5).forEach(System.out::println);
	}

	public static void main(String[] args) {
		List<Tweet> lst = new ArrayList<Tweet>();
		
		lst = InitTweet.createList();
		
		System.out.println("---------------------------Tweets posted in current Month---------------------------------");
		currentMonthTweet(lst, "March", 2025);
		
		System.out.println("---------------------------Tweets posted with certain Tag---------------------------------");
		tweetWithTag(lst , "AI");
		
		System.out.println("---------------------------Tweets posted with Subject and their Count---------------------------------");
		subjectCount(lst);
		
		System.out.println("---------------------------Tweets with more than 10k views---------------------------------");
		views10k(lst);
		
		System.out.println("---------------------------Top 5 Trending Tweets---------------------------------");
		trendingTweets(lst);
	}

}
