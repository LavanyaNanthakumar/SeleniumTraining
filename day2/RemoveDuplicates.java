package week1.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "we learn java basics as part of java sessions in java week1";
		String words[] = text.split(" ");  
		for (int i = 0; i < words.length; i++)
		{
			if(words[i]!=null)
			{
				for (int j = i+1; j < words.length; j++) 
				{
					if(words[i].equals(words[j]))
					{					
						words[j]=null;
					}
				}
			}
		}
		    for(int k=0;k<words.length;k++)    
		    {
		      if(words[k]!=null)
		      {
		        System.out.print(words[k] + " ");
		      }		      
		   	}
	}

}
