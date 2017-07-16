import java.io.*;

class CaesarCipher
{
	static StringBuffer encrypt(StringBuffer plainText,int key)
	{
		for(int i=0;i<plainText.length();i++)
			plainText.setCharAt(i,(char)(plainText.charAt(i) + key%26));
		return plainText;
	}
	static StringBuffer decrypt(StringBuffer plainText,int key)
	{
		for(int i=0;i<plainText.length();i++)
			plainText.setCharAt(i,(char)(plainText.charAt(i) - key%26));
		return plainText;
	}
	public static void main(String[] args)throws IOException
	{
		StringBuffer plainText = new StringBuffer();
		int key;
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string to encrypt : ");
		plainText.append(br.readLine());
		System.out.println("Enter the key : ");
		key = Integer.parseInt(br.readLine());
		System.out.println("The encrypted String is  :  " + encrypt(plainText,key));
		System.out.println("The decrypted String is  : " + decrypt(plainText,key));
	}
}