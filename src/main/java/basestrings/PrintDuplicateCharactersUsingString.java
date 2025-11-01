package basestrings;

public class PrintDuplicateCharactersUsingString {

	public static void main(String[] args) {
		test();

	}

	private static void test() {
		
		String name="Rithesh";
		name=name.toLowerCase();
		char[] ch=name.toCharArray();
		
		boolean[] visited=new boolean[256];
		
		for(int i=0;i<name.length();i++) {
			
			if(visited[i]) {
				continue;// already counted this character//this condtion is to make sure it should print only one alphabet
			}
			
			int count=1;
			for(int j=i+1;j<name.length();j++) {
				if(ch[i] == ch[j]) {
					count++;
					visited[j] = true;// mark as visited
				}
			}
			
			if(count > 1) {
			System.out.println(ch[i] + "--" + count);
			}
		}
		
	}

}
