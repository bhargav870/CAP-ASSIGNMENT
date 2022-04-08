package first.java;

import java.util.ArrayList;
import java.util.Arrays;

public class Streamsq2 {
	private int newsId;
    private String postedByUser;
    private String commentByUser;
    private String comment;
    
	public Streamsq2(int newsId, String postedByUser, String commentByUser, String comment) {
		super();
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}

	public int getNewsId() {
		return newsId;
	}

	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}
	//PMD - http://http://sourceforget.net/projects/pmd/Tiles/pmd-eclipse/update.site/
	public String getPostedByUser() {
		return postedByUser;
	}

	public void setPostedByUser(String postedByUser) {
		this.postedByUser = postedByUser;
	}

	public String getCommentByUser() {
		return commentByUser;
	}

	public void setCommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "Streamsq2 [newsId=" + newsId + ", postedByUser=" + postedByUser + ", commentByUser=" + commentByUser
				+ ", comment=" + comment + "]";
	}

	public static void main(String[] args) {
		Streamsq2 n1= new Streamsq2(1, "vishnu", "krishna" ,"comment");
		Streamsq2 n2 =new Streamsq2(3, "bhargav", "krishna","budget");
		Streamsq2 n3=new Streamsq2(1, "rohan", "krishna", "comment");
		Streamsq2 n4=new Streamsq2(3, "dragon", "krishna","budget");
		Streamsq2 n5=new Streamsq2(1, "veer", "krishna", "comment");
		
	  ArrayList<Streamsq2> news = new ArrayList();
	  news.add(n1);
	  news.add(n2);
	  news.add(n3);
	  news.add(n4);
	  news.add(n5);
	  
	  news.stream().filter(p->p.getComment().equals("comment")).forEach(t-> System.out.println(t.getNewsId()));//Q1
	  System.out.println("-------------------------");
      Long buf=news.stream().filter(t->t.getComment().contains("budget")).count();//Q2
      System.out.println(buf);
      System.out.println("-------------------------");
      news.stream().filter(t->t.getComment().equals("comment")).forEach(t-> System.out.println(t.getPostedByUser())); //q3
      System.out.println("-------------------------");
      news.stream().forEach(t-> System.out.println(t.getCommentByUser() + t.getComment())); //q4
	}
}
