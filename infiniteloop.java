class infinitloop{
	public static void main(String[] args){
		int curr = (int)System.currentTimeMillis()/1000;
		while(true){
			int n = (int)System.currentTimeMillis()/1000;
			if((n-curr) == 5){
				System.out.println("helloworld");
				curr = n;
			}
						
		}
	}
}
