package shiyan5_2;

public class Main {
	public static void main(String[] args) {
		try
		{
			int len = Integer.MAX_VALUE;
            @SuppressWarnings("unused")
			int largArray[] = new int[len];
            System.out.println(len);
		}
		catch (OutOfMemoryError ex)
		{
			System.out.println("�����ڴ棺"+Runtime.getRuntime().freeMemory());
			System.out.println("���ڴ棺"+Runtime.getRuntime().totalMemory());
			System.out.println("����ռ���ڴ棺"+Runtime.getRuntime().maxMemory());
            System.out.println(ex.getMessage());
            
		}
		finally
		{
			System.gc();
		}
	}
}
