package QuickFind;

public class QuickFind {
	int[] index;
	
	public QuickFind(int N) 
	{
		index = new int[N];
		for (int i= 0; i<N; i++){
			index[i] = i;
		}
	}

	public boolean isConnected(int i, int j)
	{
		return index[i] == index[j];
	}
	
	public void union(int i, int j){
		int i_val = index[i];
		int j_val = index[j];
		
		for (int k=0; k<index.length; k++){
			if (index[k] == i_val){
				index[k] = j_val;
			}
		}
	}
	
	
}
