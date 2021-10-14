/**
 * Programming Assignment 2
 *
 * @author Natalie Young
 * @since 2021-10-12
 */

class ExampleTweets
{
	public static void main(String[] args)
	{
		User user1 = new User("naycyo","Natalie Young", 12);

		String userOut = user1.toText();

		System.out.println("user1: " + userOut);

		Tweet tweet1 = new Tweet("The lazy brown dog..", user1, 800, "asdf");

		String tweetOut = tweet1.toText();

		System.out.println("tweet1: " + tweetOut);
	}
}

class User
{
	String userName; 
	String displayName;		//also called full name
	int numberOfFollowers;

	//Constructor takes a value for each field and initializes it
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
	 */
//	boolean longerThan(Tweet other)
	{
//		if (textContent.len() > other.len())
//			return true;
	}

	/**
	 * Checks if this tweet has more likes than other tweet
	 *
	 * @param other
	 */
//	boolean moreLikes(Tweet other)
	{
//		if (this.textContent.len() > other.len())
//			return true;
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
//	String toLink()
	{
		//TODO: return string representing URL for Tweet object
		
//		return objectURL;
	}
}




