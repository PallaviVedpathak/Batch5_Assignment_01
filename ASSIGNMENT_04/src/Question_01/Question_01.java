package practice.company;

import java.io.*;
import java.util.*;
	
public class Question_01 {

	private BufferedReader br;
	HashMap<String,Integer> map=new HashMap<>();

	public Question_01()
	
	{
		init();
	}
		
	void init() {
	
		try {
			String words[] = null;
			br = new BufferedReader(new FileReader(new File("C:\\Users\\TECHSAKSHAM\\Desktop\\Harman_Java_Training\\ASSIGNMENT_04\\src\\Story.txt")));
			String line = null;
			
			while ((line = br.readLine()) != null) {
				words = line.split(" ");
			}
			
			for(int i=0;i<words.length;i++)
			{
				if(map.containsKey(words[i])) 
				{
					int count=map.get(words[i]);
					map.replace(words[i],count+1);	
				}
				else
				{
					map.put(words[i],1);
				}
			}
			
			map.forEach((i,j)->{
				System.out.println(i+" : "+j);
				});
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
}
