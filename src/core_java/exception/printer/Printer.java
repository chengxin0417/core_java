package core_java.exception.printer;

public class Printer {

	/**
	 * 打印100份文件，当打印到第10份的时候缺纸，当打印到第21份的时候缺墨
	 * 
	 * @throws InterruptedException
	 */
	public void work() throws InterruptedException {
		int i = 30; // 打印文件总数
		int j = 10; // 打印第10份文件的时候缺纸
		int k = 21; // 打印第21份的时候缺墨

		int count = 1;
		while (count <= i) {
			try {
				System.out.println("正在打印第" + count + "份文件");
				if (count == k) {
					throw new OutOfInkException();
				}
				if (count == j) {
					throw new OutOfPaperException("没纸张了");
				}
				count++;
			} catch (OutOfInkException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.err.println("等待用户更换墨盒");
				Thread.sleep(3000);
				System.err.println("墨盒更换完毕，继续打印...\n");
				count++;
			} catch (OutOfPaperException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.err.println("等待用户更换纸张");
				Thread.sleep(3000);
				System.err.println("纸张更换完毕，继续打印...\n");
				count++;
			}
		}
	}
}
