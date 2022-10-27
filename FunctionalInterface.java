interface example
{
	void speak(String msg);
}
public class FunctionalInterface implements example
{
	public void speak(String msg)
	{
		System.out.println(msg);
	}
	public static void main(String[] args)
	{
		FunctionalInterface f = new FunctionalInterface();
		f.speak("Hello There");
	}
}