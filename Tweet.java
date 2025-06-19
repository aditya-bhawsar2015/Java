package twitter;

import java.util.HashSet;
import java.util.Set;

public class Tweet {
	String subject;
	Date datePost;
	int views;
	Set<String> tags = new HashSet<>();
	public Tweet(String subject, Date datePost, int views, Set<String> tags) {
		super();
		this.subject = subject;
		this.datePost = datePost;
		this.views = views;
		this.tags = tags;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Date getDatePost() {
		return datePost;
	}
	public void setDatePost(Date datePost) {
		this.datePost = datePost;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public Set<String> getTags() {
		return tags;
	}
	public void setTags(Set<String> tags) {
		this.tags = tags;
	}
	@Override
	public String toString() {
		return "Tweet [subject=" + subject + ", datePost=" + datePost + ", views=" + views + ", tags=" + tags + "]";
	}
	
	
}
