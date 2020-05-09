package week1.day2;

public class CharacterOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "welcome to chennai";
		  int[] freq = new int[str.length()];    
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{ 
			freq[i] = 1;    
		
        for(int j = i+1; j <str.length(); j++)
        {    
            if(ch[i] == ch[j])
            {    
                freq[i]++;        
                ch[j] = '0';    
            }    
        }
		}
		System.out.println("Characters and their corresponding frequencies: ");    
        for(int i = 0; i <freq.length; i++) {    
            if(ch[i] != ' ' && ch[i] != '0')    
                System.out.println(ch[i] + "-" + freq[i]);    
        }    
	}

}
