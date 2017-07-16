import java.io.*;

class PolyAplhabetic
{
	static StringBuffer pad(StringBuffer key,int n)
	{
		for(int i=0;i<n-key.length();i++)
			key.append("Z");
		return key;
	}
	static StringBuffer encrypt(StringBuffer s,StringBuffer key)
	{
		for(int i=0;i<s.length();i++)
		{
			s.setCharAt(i,(char)(key.charAt(i) + (s.charAt(i)-65)));
		}
		return s;
	}
	public static void main(String[] args)throws IOException
	{
		StringBuffer plainText = new StringBuffer();
		StringBuffer key;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the plainText : ");
		plainText.append(br.readLine());
		System.out.println("Enter the key : ");
		key = new StringBuffer((br.readLine()));
		key = pad(key,plainText.length());
		System.out.println("The encrypted Text is : "  + encrypt(plainText,key));
	}
}