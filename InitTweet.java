package twitter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class InitTweet {
	public static List<Tweet> createList(){
		List<Tweet> lst = new ArrayList<Tweet>();
		Tweet tweet1 = new Tweet("The future of AI is exciting!", new Date(5, "March", 2024), 12000, Set.of("AI", "Technology", "Future"));
	    Tweet tweet2 = new Tweet("Morning coffee just hits differently on Mondays.", new Date(12, "February", 2024), 850, Set.of("Coffee", "MondayMood", "Lifestyle"));
	    Tweet tweet3 = new Tweet("Elon Musk just announced a new Tesla model. Thoughts?", new Date(20, "January", 2024), 5000, Set.of("Tesla", "ElonMusk", "EV"));
	    Tweet tweet4 = new Tweet("The stock market is wild today. Anyone else watching?", new Date(8, "March", 2025), 3100, Set.of("StockMarket", "Investing", "Finance"));
	    Tweet tweet5 = new Tweet("Just finished reading 'Atomic Habits'. Highly recommend!", new Date(15, "April", 2024), 950, Set.of("Books", "SelfImprovement", "Reading"));
	    Tweet tweet6 = new Tweet("Python vs JavaScript for beginners? Which one do you prefer?", new Date(22, "May", 2024), 20200, Set.of("Programming", "Python", "JavaScript"));
	    Tweet tweet7 = new Tweet("A good workout can change your entire mood!", new Date(3, "June", 2024), 1300, Set.of("Fitness", "Workout", "Health"));
	    Tweet tweet8 = new Tweet("Bitcoin just hit a new all-time high!", new Date(10, "July", 2024), 4200, Set.of("Bitcoin", "Crypto", "Investing"));
	    Tweet tweet9 = new Tweet("This iPhone camera is absolutely insane!", new Date(18, "August", 2024), 2750, Set.of("Apple", "iPhone", "Photography"));
	    Tweet tweet10 = new Tweet("Can’t believe how good The Last of Us series is!", new Date(25, "September", 2024), 38120, Set.of("TVShows", "TheLastOfUs", "Entertainment"));
	    Tweet tweet11 = new Tweet("Nothing beats homemade pizza on a Friday night.", new Date(1, "October", 2024), 1600, Set.of("Food", "Pizza", "WeekendVibes"));
	    Tweet tweet12 = new Tweet("Started learning machine learning. Any tips?", new Date(9, "November", 2024), 2900, Set.of("MachineLearning", "AI", "Tech"));
	    Tweet tweet13 = new Tweet("Traveling solo is such a life-changing experience.", new Date(16, "December", 2024), 2150, Set.of("Travel", "Adventure", "SoloTrip"));
	    Tweet tweet14 = new Tweet("Just got a standing desk. Best decision ever!", new Date(24, "January", 2025), 1350, Set.of("Productivity", "WorkFromHome", "Health"));
	    Tweet tweet15 = new Tweet("Messi vs Ronaldo – the debate never ends!", new Date(2, "February", 2025), 5400, Set.of("Football", "Messi", "Ronaldo"));
	    Tweet tweet16 = new Tweet("Dark mode or light mode? Which one are you?", new Date(11, "March", 2025), 1900, Set.of("Tech", "DarkMode", "Preferences"));
	    Tweet tweet17 = new Tweet("Dogs truly make life better.", new Date(19, "April", 2025), 1750, Set.of("Dogs", "Pets", "Happiness"));
	    Tweet tweet18 = new Tweet("Coding is like solving puzzles – frustrating but satisfying!", new Date(27, "March", 2025), 25500, Set.of("Coding", "Programming", "Tech"));
	    Tweet tweet19 = new Tweet("NFTs are still a thing? What’s next?", new Date(5, "June", 2025), 3150, Set.of("NFT", "Crypto", "Blockchain"));
	    Tweet tweet20 = new Tweet("Best movie of all time? Go!", new Date(13, "July", 2025), 4000, Set.of("Movies", "Cinema", "Entertainment"));
	    Tweet tweet21 = new Tweet("Best movie of all time? Go!", new Date(15, "July", 2025), 4732, Set.of("Movies", "Cinema", "Entertainment"));
	    Tweet tweet22 = new Tweet("Nothing beats homemade pizza on a Friday night.", new Date(2, "October", 2024), 1600, Set.of("Food", "Pizza", "WeekendVibes"));
	    Tweet tweet23 = new Tweet("Nothing beats homemade pizza on a Friday night.", new Date(5, "October", 2024), 1600, Set.of("Food", "Pizza", "WeekendVibes"));
	    
	    lst.add(tweet1);
	    lst.add(tweet2);
	    lst.add(tweet3);
	    lst.add(tweet4);
	    lst.add(tweet5);
	    lst.add(tweet6);
	    lst.add(tweet7);
	    lst.add(tweet8);
	    lst.add(tweet9);
	    lst.add(tweet10);
	    lst.add(tweet11);
	    lst.add(tweet12);
	    lst.add(tweet13);
	    lst.add(tweet14);
	    lst.add(tweet15);
	    lst.add(tweet16);
	    lst.add(tweet17);
	    lst.add(tweet18);
	    lst.add(tweet19);
	    lst.add(tweet20);
	    lst.add(tweet21);
	    lst.add(tweet22);
	    lst.add(tweet23);
	    
	    return lst;
	    
	    
    }
    
    
	
}
