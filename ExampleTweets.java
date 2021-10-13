/**
 * Programming Assignment 2
 *
 * @author Natalie Young
 * @since 2021-10-12
 */

class User
{
	String userName = "AdaLovelace";
	String displayName = "Ada Lovelace";
	int numberOfFollowers = 0;

	/**
	 * Returns string that contains fullname followed by username of user
	 */
	String toText()
	{
		String text = displayName + " @" + userName;
	}
}

class Tweet
{
	String textContent = "The lazy brown dog...";
	//TODO: User.userName;
	int numberOfLikes = 0;
	String uniqueID;

	/**
	 * Checks if this tweet is longer than other tweet
	 *
	 * @param other
	 */
	boolean longerThan(Tweet other)
	{
		if (this.textContent.len() > other.len())
			return;
	}

	/**
	 * Checks if this tweet has more likes than other tweet
	 *
	 * @param other
	 */
	boolean moreLikes(Tweet other)
	{
		if (this.textContent.len() > other.len())
			return;
	}
	
	/**
	 * Returns String representation of Tweet object with all info
	 *
	 * @return text
	 */
	String toText()
	{
		String text = User.toText() + " : " + textContent + " : " + numberOfLikes;
		return text;
	}

	/**
	 * Returns string representing URL for Tweet object
	 *
	 * @return objectURL
	 */
	String toLink()
	{
		//TODO: return string representing URL for Tweet object
		
		return objectURL;
	}
}



class ExampleTweets
{
	
}

