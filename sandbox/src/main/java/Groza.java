public class Groza{
    public static void main(String[] args){
		int[]arr = new int[5];
		for(int x = 0; x<= 4; x++){
			arr[x] = x;
		}
		int resultat = arr[0]+arr[2];
		System.out.println(resultat);
	}
}