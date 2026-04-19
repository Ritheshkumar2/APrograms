package cgi;

public class Findfirstandlastoccrance {

	public static void main(String[] args) {
		//test();
		//testone();
		boolean v=tets();
		System.out.print(v);

	}

	private static boolean tets() {
        String value="aamaazinga";		
		char[] ch=value.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i] == ch[j]) {
					return true;
				}
			}
		}
		return false;
		
		
	}

	private static void testone() {
		String value="aamaazinga";
		
		char[] ch=value.toCharArray();
		boolean[] visited=new boolean[ch.length];
		
		for(int i=0;i<ch.length;i++) {
			if(visited[i]) {
				continue;
			}
			int count=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i] == ch[j]) {
					count++;
					visited[j]=true;
				}
			}
			if(count>1) {
				System.out.println(ch[i]+"-->"+count);
			}
		}
		
	}

	private static void test() {
		String value="aamaazinga";
		
		int first=value.indexOf("a");
		int last=value.lastIndexOf("a");
		

        System.out.println("First occurrence: " + first);
        System.out.println("Last occurrence: " + last);
		
	}

}
