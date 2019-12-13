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
			System.out.println("空闲内存："+Runtime.getRuntime().freeMemory());
			System.out.println("总内存："+Runtime.getRuntime().totalMemory());
			System.out.println("最大可占用内存："+Runtime.getRuntime().maxMemory());
            System.out.println(ex.getMessage());
            
		}
		finally
		{
			System.gc();
		}
	}
}
