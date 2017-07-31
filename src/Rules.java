import java.util.ArrayList;

public class Rules {

	
	public String getAsset(String sentence){
		
		ArrayList<String> words = new ArrayList<String>();
		ArrayList<String> asset = new ArrayList<String>();
		char[] c = new char[30];
		int j = 0;
		int k = 0;
		
			for (int i = 0 ; i < sentence.length() ; i++) {
				
				c[k] = sentence.charAt(i);
				k++;
				
			    if (Character.isWhitespace(sentence.charAt(i))) {
			    	words.add(String.valueOf(c));
			    	c = new char[30];
			    	k=0;
			    	j++;
			    }
			}
			    int jj;
			for(int ii = 0 ; ii < words.size(); ii++){
				
				if(words.get(ii).contains("NNS") || words.get(ii).contains("NN")){
					jj = ii;
					while(words.get(jj).contains("NNS") || words.get(jj).contains("NN") || 
							 words.get(jj).contains("IN") ){
					asset.add(words.get(jj));
					jj++;
					ii = words.size();
					}
					
				}
				for(int o = 0 ; o < asset.size(); o++){
					
					int spaceIndex = asset.get(o).indexOf("/");
					if (spaceIndex != -1)
					{
						asset.set(o, asset.get(o).substring(0,spaceIndex) + " ");
					}
				}
				System.out.println(String.join("", asset));
				
				
			}
			
			return String.join("", asset);
		
		
	}
	public void getThreat(String pepe){
		
		
		
		
		
	}
	public String getControl(String sentence){
		
		ArrayList<String> words = new ArrayList<String>();
		ArrayList<String> asset = new ArrayList<String>();
		char[] c = new char[30];
		int j = 0;
		int k = 0;
		
			for (int i = 0 ; i < sentence.length() ; i++) {
				
				c[k] = sentence.charAt(i);
				k++;
				
			    if (Character.isWhitespace(sentence.charAt(i))) {
			    	words.add(String.valueOf(c));
			    	c = new char[30];
			    	k=0;
			    	j++;
			    }
			}
			    int jj;
			for(int ii = 0 ; ii < words.size(); ii++){
				
				if((words.get(ii).contains("NNS") || words.get(ii).contains("NN")) && (words.get(ii).contains("policy")
						|| words.get(ii).contains("security"))){
					asset.add(words.get(ii-1));
					jj = ii;
					while(words.get(jj).contains("NNS") || words.get(jj).contains("NN") || 
							 words.get(jj).contains("IN") ){
					asset.add(words.get(jj));
					jj++;
					ii = words.size();
					}
					
					
				}
				for(int o = 0 ; o < asset.size(); o++){
					
					int spaceIndex = asset.get(o).indexOf("/");
					if (spaceIndex != -1)
					{
						asset.set(o, asset.get(o).substring(0,spaceIndex) + " ");
					}
				}
				System.out.println(String.join("", asset));
				
				
			}
			
			return String.join("", asset);
		
		
		
	}
	public String getOrg(String sentence){
		
		ArrayList<String> words = new ArrayList<String>();
		ArrayList<String> asset = new ArrayList<String>();
		char[] c = new char[30];
		int j = 0;
		int k = 0;
		
			for (int i = 0 ; i < sentence.length() ; i++) {
				
				c[k] = sentence.charAt(i);
				k++;
				
			    if (Character.isWhitespace(sentence.charAt(i))) {
			    	words.add(String.valueOf(c));
			    	c = new char[30];
			    	k=0;
			    	j++;
			    }
			}
			    int jj;
			for(int ii = 0 ; ii < words.size(); ii++){
				
				if(words.get(ii).contains("organization") || words.get(ii).contains("management")){
				
					asset.add(words.get(ii));
			
					}
					
				}
				for(int o = 0 ; o < asset.size(); o++){
					
					int spaceIndex = asset.get(o).indexOf("/");
					if (spaceIndex != -1)
					{
						asset.set(o, asset.get(o).substring(0,spaceIndex) + " ");
			
					}
				}
				System.out.println(String.join("", asset));
				
				
			
			
			return String.join("", asset);
		
	}
	public String getAction(String sentence){
		
		ArrayList<String> words = new ArrayList<String>();
		ArrayList<String> asset = new ArrayList<String>();
		char[] c = new char[30];
		int j = 0;
		int k = 0;
		
			for (int i = 0 ; i < sentence.length() ; i++) {
				
				c[k] = sentence.charAt(i);
				k++;
				
			    if (Character.isWhitespace(sentence.charAt(i))) {
			    	words.add(String.valueOf(c));
			    	c = new char[30];
			    	k=0;
			    	j++;
			    }
			}
			    int jj;
			for(int ii = 0 ; ii < words.size(); ii++){
				
				if((words.get(ii).contains("VBN") || words.get(ii).contains("VB"))){
					if(!words.get(ii).contains("be"))
					asset.add(words.get(ii));
					
					
				}
			}
				for(int o = 0 ; o < asset.size(); o++){
					
					int spaceIndex = asset.get(o).indexOf("/");
					if (spaceIndex != -1)
					{
						asset.set(o, asset.get(o).substring(0,spaceIndex) + " ");
					}
				}
				
				
			System.out.println(String.join("", asset));
			return String.join("", asset);
			
	}
}
