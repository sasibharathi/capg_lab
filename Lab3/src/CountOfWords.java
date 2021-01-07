/**
 * Java program that displays the number of characters, lines and words in a text 
 * @author SASI
 *
 */
public class CountOfWords {
	public void displayCount(String string) {
		String arr[]=string.split("\\s");
		int count=arr.length;
		System.out.println("The number of words are: "+count);
		int countChar=string.length()-(count-1);
		System.out.println("The number of characters are: "+countChar);
		String[] lines=string.split("\r\n|\r|\n");
		int countLines=lines.length;
		System.out.println("The number of lines are: "+countLines);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountOfWords count=new CountOfWords();
		String str="Capgemini Technology Solutions";
		count.displayCount(str);
	}

}
