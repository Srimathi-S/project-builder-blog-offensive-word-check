package utility;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import model.Blog;

public class CheckBlogPost extends OffensiveWordsChecker implements OffensiveWordsInterface
{
	String offensiveWords[]= {
			"doofus",
			"dookie",
			"doosh",
			"dopey",
			"Doublelift",
			"douch3",
			"douche",
			"douchebag",
			"douchebags",
			"douche-fag",
			"douchewaffle",
			"douchey",
			"dp action",
			"drunk",
			"dry hump",
			"duche",
			"dumass",
			"dumb ass",
			"dumbass",
			"god",
			"god damn",
			"godamn",
			"godamnit",
			"goddam",
			"god-dam",
			"goddammit",
			"goddamn",
			"goddamned",
			"god-damned",
			"goddamnit",
			"godsdamn",
			"gokkun",
			"golden shower",
			"goldenshower"
	};
	Set<String> offensiveWordsSet = new HashSet<String>(Arrays.asList(offensiveWords)); 
	@Override
	public boolean checkBlogTitle(Blog blog) {
		String blogTitle[]=blog.getBlogTitle().split(" ");
		for(String titleWords:blogTitle)
		{
			
			if(offensiveWordsSet.contains(titleWords))
			{
				return true;
			}
		}
		return false;
		
	}

	@Override
	public boolean checkBlogDescription(Blog blog) {
		String blogDescription[]=blog.getBlogDescription().split(" ");
		for(String descriptionWords:blogDescription)
		{
			if(offensiveWordsSet.contains(descriptionWords))
				return true;
		}
		
		return false;
	}

	@Override
	public boolean checkBlog(Blog blog) {
		// TODO Auto-generated method stub
		return checkBlogTitle(blog) || checkBlogDescription(blog);
	}
	
}