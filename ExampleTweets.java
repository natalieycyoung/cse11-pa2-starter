/**
 * Programming Assignment 2
 *
 * @author Natalie Young
 * @since 2021-10-13
 */

class ExampleTweets
{
	// USER OBJECTS AND toText() METHOD
	User user1 = new User("jack", "jack", 5700000);
	String user1Text = user1.toText();		// User 1: jack @jack		
	
	User user2 = new User("hodgesboi15", "september22", 1156);
	String user2Text = user2.toText();		// User 2: september22 @hodgesboi15
	
	User user3 = new User("ambernoelle", "Night of the Living Discourse", 36700);
	String user3Text = user3.toText();		//User 3: Night of the Living Discourse @ambernoelle		
	
	// TWEET OBJECTS, toText(), AND toLink() METHODS
	// Tweet 1
	// URL: https://twitter.com/jack/status/20/
	// Parts of Tweet that couldn't be represented with class design -- no
	Tweet tweet1 = new Tweet(
			"just setting up my twttr", user1, 170600, "20");
	String tweet1Text = tweet1.toText();
	// expected: jack @jack : just setting up my twttr : 170600 Likes
	String url1 = tweet1.toLink();	
	// expected: https://twitter.com/jack/status/20
	
	// Tweet 2
	// URL: https://twitter.com/hodgesboi15/status/388859485974171649
	// Parts of Tweet that couldn't be represented with class design -- no
	Tweet tweet2 = new Tweet(
			"If I pay $40 for a haunted house I better die", user2, 218000, "388859485974171649");
	String tweet2Text = tweet2.toText();
	// expected: september22 @hodgesboi15 : If I pay $40 for a haunted house
	// I better die : 218000 Likes
	String url2 = tweet2.toLink();
	// Link: https://twitter.com/hodgesboi15/status/388859485974171649
	
	// Tweet 3
	// URL: https://twitter.com/ambernoelle/status/1440853238606012422
	// Parts of Tweet that couldn't be represented with class design -- no
	Tweet tweet3 = new Tweet(
			"I have just discovered that the collective noun for mothers is a consternation, and, well", user3, 286, "1440853238606012422");
	String tweet3Text = tweet3.toText();
	// expected: Night of the Living Discourse @ambernoelle : I have just
	// discovered that the collective noun for mothers is a consternation,
	// and, well : 286 Likes	
	String url3 = tweet3.toLink();
	// expected: https://twitter.com/ambernoelle/status/1440853238606012422
	
	// Tweet 4
	// URL: https://twitter.com/ambernoelle/status/1430195040261971968
	// Parts of Tweet that couldn't be represented with class design -- no
	Tweet tweet4 = new Tweet(
			"A haunted house but every room is haunted by a different kind of disappointment", user3, 289, "1430195040261971968");
	String tweet4Text = tweet4.toText();
	// expected: Night of the Living Discourse @ambernoelle : A haunted house
	// but every room is haunted by a different kind of disappointment : 289
	// Likes
	String url4 = tweet4.toLink();
	// expected: https://twitter.com/ambernoelle/status/1430195040261971968
	
	// METHOD EXAMPLES
	
	// longerThan()
	boolean longerEx1 = tweet1.longerThan(tweet2);	// Tweet 1 longerThan Tweet 2: false
	boolean longerEx2 = tweet2.longerThan(tweet1);	// Tweet 2 longerThan Tweet 1: true
	boolean longerEx3 = tweet2.longerThan(tweet3);	// Tweet 2 longerThan Tweet 3: false
	boolean longerEx4 = tweet3.longerThan(tweet2);	// Tweet 3 longerThan Tweet 2: true
	
	// moreLikes()
	boolean moreEx1 = tweet1.moreLikes(tweet2);		// Tweet 1 moreLikes than Tweet 2: false
	boolean moreEx2 = tweet2.moreLikes(tweet1);		// Tweet 2 moreLikes than Tweet 1: true
	boolean moreEx3 = tweet2.moreLikes(tweet3);		// Tweet 2 moreLikes than Tweet 3: true
	boolean moreEx4 = tweet3.moreLikes(tweet2);		// Tweet 3 moreLikes than Tweet 2: false
}

class User
{
	String userName; 
	String displayName;		// also called full name
	int numberOfFollowers;

	// Constructor takes a value for each field and initializes it
	User(String userName, String displayName, int numberOfFollowers)
	{
		this.userName = userName;
		this.displayName = displayName;
		this.numberOfFollowers = numberOfFollowers;
	}
	
	/**
	 * Returns string that contains fullname followed by space and at-symbol
	 * before username
	 *
	 * @return text
	 */
	String toText()
	{
		String text = displayName + " @" + userName;

		return text;
	}
}

class Tweet
{
	String textContent;
	User author;
	int numberOfLikes;
	String uniqueID;

	Tweet(String textContent, User author, int numberOfLikes, String uniqueID)
	{
		this.textContent = textContent;
		this.author = author;
		this.numberOfLikes = numberOfLikes;
		this.uniqueID = uniqueID;
	}

	/**
	 * Checks if this tweet is longer than other tweet
	 *
	 * @param other
	 * @return boolean
	 */
	boolean longerThan(Tweet other)
	{
		String otherText = other.textContent;

		if (textContent.length() > otherText.length())
		{
//			System.out.println("\ntextContent length: " + textContent.length() +
//					"\notherText length: " + otherText.length());
			
			return true;
		}
		else
		{
//			System.out.println("\ntextContent length: " + textContent.length() +
//					"\notherText length: " + otherText.length());
			
			return false;
		}
	}

	/**
	 * Checks if this tweet has more likes than other tweet
	 *
	 * @param other
	 * @return boolean
	 */
	boolean moreLikes(Tweet other)
	{
		int otherLikes = other.numberOfLikes;

//		System.out.print("\nnumberOfLikes: " + numberOfLikes + "\notherLikes: " + otherLikes);

		if (numberOfLikes > otherLikes)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * Returns String representation of Tweet object with all info
	 *
	 * @return text
	 */
	String toText()
	{
		String text = author.toText() + " : " + textContent + " : " +
			numberOfLikes + " Likes";
		
		return text;
	}

	/**
	 * Returns string representing URL for Tweet object
	 *
	 * @return objectURL
	 */
	String toLink()
	{
		String objectURL = "https://twitter.com/" + author.userName + "/status/" + uniqueID;

		return objectURL;
	}
}
