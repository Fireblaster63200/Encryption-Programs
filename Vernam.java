import java.io.*;

class Vernam 
{
	static StringBuffer pad(StringBuffer s,int n)
	{
		for(int i=0;i<n-s.length();i++)
			s.append("0");
		return s;
	}
	static StringBuffer encrypt(StringBuffer s,StringBuffer k)
	{
		for(int i=0;i<s.length();i++)
			s.setCharAt(i,(char)(s.charAt(i) + k.charAt(i) - 65));	
		return s;
	}
	public static void main(String[] args)throws IOException
	{
		StringBuffer plainText = new StringBuffer();
		StringBuffer key = new StringBuffer();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string : ");
		plainText.append(br.readLine());
		System.out.println("Enter the key : ");
		key.append(br.readLine());
		key = pad(key,plainText.length());
		System.out.println("The encrypted text is : " + encrypt(plainText,key));
	}
}