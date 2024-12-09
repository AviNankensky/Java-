
public class averageAthletes {

	public static void main(String[] args) {
		int [][] athletesTime= {
				{25,23,19,18,26,21,24,25},
				{45,46,47,42,42,49,39,43},
				{35,30,32,32,33,39,31,33},
				{25,23,22,22,26,22,25,27}};
		
		final int  tracks=athletesTime.length;//4
		final int  athletes=athletesTime[0].length;//8
		int[] trackSum=new int[tracks];
		int[] athleteSum =new int[athletes];
		
		for(int i =0;i<tracks;i++) {
			for(int j=0;j<athletes;j++) {
				trackSum[i]+=athletesTime[i][j];
				athleteSum[j]+=athletesTime[i][j];	
		}//for loop	
	}//for loop
	double festTrack =(double)trackSum[0]/athletes;
		int fastlnd = 0;
	
		
	for(int i=1;i<trackSum.length;i++) {
		if((double)trackSum[i]/athletes<festTrack) {
			festTrack=(double)trackSum[i]/athletes;
			fastlnd=i;	
		}
	}
	System.out.println("fastest track is number:"+(fastlnd+1));	
	System.out.println("with the average timw of:"+festTrack+" minutes");	
	
		
		
		
		
	
		
		
		
		
	}
}
