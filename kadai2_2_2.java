import java.io.*;

public class kadai2_2_2
{
	public static void main(String args[]) throws IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("段数を入力してください。");
		while (true) {
			String line = in.readLine();
			if (line == null) {
				throw new EOFException();
			}
			if (isInteger(line) == true){
				int dan=Integer.parseInt(line);
				int y=0;
				int countflg=0;

				for( int i=0; i<dan; i++ ) {
					for(int j=0; j<(i); j++){
						y=j;
						countflg=1;
						System.out.print("  ");
					}
					for( int k=0; k<(dan*2-i*2-1); k++ ){
						if (countflg==1){
							y=y+1;
						}
						else{
							y=k;
						}
					System.out.print("☆");
					}
					countflg=0;
					System.out.println(); 
				}
				break;
			}
			else{
				System.err.println("不正な数値です。もう一度入力してください。");
			}
		}
	}

	// 数値チェック
	static boolean isInteger(String num) {
		try {
		Integer.parseInt(num);
		if (Integer.parseInt(num) < 0){
			return false;
		}else{
				return true;
				}
		} catch (NumberFormatException e) {
			return false;
		}
	}
}