import java.util.*;


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer("123-45!,abc? de,?", "-!,");
				while(st.hasMoreTokens()){
					System.out.println(st.nextToken());
				}

	}

}
